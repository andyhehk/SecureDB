package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.connect.ResultSetMetaData;
import edu.hku.sdb.connect.SdbResultSet;
import edu.hku.sdb.connect.SdbStatement;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.optimize.Optimizer;
import edu.hku.sdb.optimize.RuleBaseOptimizer;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.rewrite.SdbSchemeRewriter;
import edu.hku.sdb.rewrite.UnSupportedException;
import edu.hku.sdb.upload.UploadHandler;
import edu.hku.sdb.utility.ProfileUtil;
import org.junit.Before;
import org.junit.Test;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import static org.junit.Assert.*;

public class ExecutorTest {

  private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  private static String HiveDriverName = "org.apache.hive.jdbc.HiveDriver";
  private String serverConnectionURL = "jdbc:hive2://galaxy046:10000/default";
  private PersistenceManagerFactory pmf;
  private PersistenceManager pm;
  private UploadHandler uploadHandler;
  private DBMeta db1;
  private BigInteger n;
  private BigInteger g;
  private BigInteger p;
  private BigInteger q;

  private MetaStore metaDB;
  private SemanticAnalyzer semanticAnalyzer;
  private ParseDriver parser;
  private SdbSchemeRewriter sdbSchemeRewriter;
  private Optimizer optimizer;
  private Executor executor;
  private Connection connection;

  //lineitem_1000000_enc_3 => BLOCK size 64MB
  //lineitem_1000000_enc_64 => BLOCK size 64MB

  private String targetTableName = "lineitem_1000000_enc_64";// + new Random().nextInt(100);
  private String simpleCreateQuery = "CREATE TABLE " + targetTableName + " (L_ORDERKEY    INT,\n" +
          "                             L_PARTKEY     INT,\n" +
          "                             L_SUPPKEY     INT,\n" +
          "                             L_LINENUMBER  INT,\n" +
          "                             L_QUANTITY    INT ENC,\n" +
          "                             L_EXTENDEDPRICE  INT ENC,\n" +
          "                             L_DISCOUNT    INT ENC,\n" +
          "                             L_TAX         INT,\n" +
          "                             L_RETURNFLAG  VARCHAR(1),\n" +
          "                             L_LINESTATUS  VARCHAR(1),\n" +
          "                             L_SHIPDATE    VARCHAR(11),\n" +
          "                             L_COMMITDATE  VARCHAR(11),\n" +
          "                             L_RECEIPTDATE VARCHAR(11),\n" +
          "                             L_SHIPINSTRUCT VARCHAR(25),\n" +
          "                             L_SHIPMODE     VARCHAR(10),\n" +
          "                             L_COMMENT      VARCHAR(44))";

  private String simpleSelectWhereQuery = "select L_LINENUMBER from " + targetTableName + " where L_QUANTITY > 49";
  private String selectFromDemoEE = "select a, b, c, d from demo where a < b";
  private String EPSubtractDemoEE = "select count(a) from demo_table where a < 620";


  private String benchEC = "select count(a) from demo";


  private String simpleLoadQuery = "LOAD DATA LOCAL INPATH 'src/test/resources/upload/lineitem_200k.txt' OVERWRITE INTO TABLE " + targetTableName;
  private String simpleMultipleMultiECQuery = "select L_ORDERKEY from " + targetTableName;

  @Before
  public void setUp(){
    prepareTestDB();
    assertNotNull(metaDB.getAllDBs().get(0));
  }

  private void prepareTestDB() {
    try {
      Class.forName(driver).newInstance();
    } catch (InstantiationException | IllegalAccessException
            | ClassNotFoundException e) {
      e.printStackTrace();
    }

    Properties properties = new Properties();
    properties.setProperty("javax.jdo.option.ConnectionURL",
            "jdbc:derby:metastore_db;create=true");

    properties.setProperty("javax.jdo.option.ConnectionDriverName",
            "org.apache.derby.jdbc.EmbeddedDriver");

    properties.setProperty("javax.jdo.option.ConnectionUserName", "");
    properties.setProperty("javax.jdo.option.ConnectionPassword", "");
    properties.setProperty("datanucleus.schema.autoCreateSchema", "true");
    properties.setProperty("datanucleus.schema.autoCreateTables", "true");
    properties.setProperty("datanucleus.schema.validateTables", "false");
    properties.setProperty("datanucleus.schema.validateConstraints", "false");

    pmf = JDOHelper.getPersistenceManagerFactory(properties);
    pm = pmf.getPersistenceManager();
    metaDB = new MetaStore(pm);
    try {
      connection = getHiveConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void testSimpleSelect() throws Exception{

//      String testQuery = selectFromDemoEE;
      String testQuery = EPSubtractDemoEE;

    // Parse & analyse
    System.out.println("Parsing " + testQuery);
    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDB);
    ASTNode parsedNode = parser.parse(testQuery);
    ParseNode analyzedNode  = semanticAnalyzer.analyze(parsedNode);

    // Rewrite
    System.out.println("Rewriting " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(metaDB.getAllDBs().get(0));
    sdbSchemeRewriter.rewrite(analyzedNode);

    // Optimize
    System.out.println("Optimizing " + analyzedNode.toSql());
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = optimizer.optimize(analyzedNode, connection, null);

    // Execute
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);

    ResultSetMetaData sdbMetaData = resultSet.getResultSetMetaData();
    System.out.println(sdbMetaData.getColumnName(1));
//
//    System.out.println(sdbMetaData.getColumnName(1));
    while (resultSet.next()){
      System.out.println(resultSet.getLong(1));
    }

//    assertTrue(resultSet.getServerTotalTime() > 0);
//    assertTrue(!resultSet.getRemoteSQLQuery().equals(""));
  }

  private Connection getHiveConnection() throws SQLException {
    try {
      Class.forName(HiveDriverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "Yifan", "*");
    Statement stmt = con.createStatement();

    // register UDFs
    //stmt.execute("add jar SDB-0.1-SNAPSHOT.jar");
    //stmt.execute("add jar file:///home/haibin/apache/spark/lib/SDB-0.1-SNAPSHOT.jar");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.SDBIntAddUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_add AS 'edu.hku.sdb.udf.SDBAddUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_keyUp AS 'edu.hku.sdb.udf.SDBKeyUpdateUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_mul AS 'edu.hku.sdb.udf.SDBMultiUDF'");
    stmt.execute("CREATE TEMPORARY FUNCTION sdb_compare AS 'edu.hku.sdb.udf.SDBCompareUDF'");

    // test simple UDF
    String sql = "select COUNT(sdb_intadd('2', '1', '11'))  from test";

    ProfileUtil profileUtil = new ProfileUtil();
//    String testQuery2 = "SELECT lineitem_1000000_enc_2.l_linenumber, lineitem_1000000_enc_2.row_id\n" +
//            "FROM lineitem_1000000_enc_2\n" +
//            "WHERE sdb_compare(sdb_keyUp(sdb_mul(lineitem_1000000_enc_2.r,sdb_add(lineitem_1000000_enc_2.l_quantity,lineitem_1000000_enc_2.s,lineitem_1000000_enc_2.s,\"xfinosfjdsu8db9wsmfnwf6kafh6tw4936nu2lwk8kgktpg8mlaxlkz44jbp3oqt923qmgxg3tu553h2stfjisnja107v3phr4hjbsj1g01pzza8lxvrawiuoqeufjn509o4k90hbmhm9582szoaftw1nq72e7w77rk4ty8gz8ziqzi0wk5hq1cb9qmtnuutvujwc0u9xmzdixh05v6demr5fkdh4t8tkf7j77qf6tewx2wsoq77ogohzk41i48r6s4ato877ms34sg0wtx6b7h7x86cazyvk11yqhb9vgnfj4ttkxkozg6zzecwtu2e12u6yvhgzzobyhi484m2qpzxnxphjdldrt18ukb4i1k6akt58dopjuc0ja00oigwzow0wgw3spou\",\"ii4yjq0a67mnvjlcotx0umifvdp2vtg3duk3flnfyybod1hq30tiniosh6h1m5c80gao3bhv9q1ajuf7sorbogp6hp3o9ed6kd5ul29n0d4276oup5yxfdghf1m8czag91km1hjwa7qhrx8iqu5y499p9ajl18t2pojtxcyeamf0qjhnbbmp1rf8c14f4lllpu7nlco3afzvg3xhsjwjbko336p95bhz7a7dm44umzfxh868uo4tf4uie3taguwc64j9qnkni10bvs7qng5adgcsxg6tolqw2bqusujdvdw6p0jz7q9hj2sijomrzqoxeueu7d7uask9lvpz47y0lwxst38fasgawec5sgi874kzwfd67hlh25sm3lr7solvgjkp785o0tqu\",\"von3tp8fmfmqup37h3dgjxfouo8nguvcaeyeirpgx4jctu82w7qeydhn9344th4sll8z8xsv7i63m8k9czcsr1uzr8b8j0ve35w25jozqubi6n4e7tsp8lc6kpx7y3oo8gxdaz7qbnnt67cqdmxobt6h5orgkj1u9wc75aglxcl8pe6rh36v11w9szwr9ge19vv9mz9io821bnixot0kolpw89dm50etz4rnopxda9g55ti3uxa0qeesuu960292ytaqq8294ovq3x2ywzimtq6r5ajifeqmfzba9x6kf6ozmy6lgg7ucxwg4393bvqpmydrcljcgux44yor4zvfxg265lh5ew6xmisx3fvv66d7qtzcp2qduf7a81bmcbj1smch8nslhay\",\"bpz9a594n3anmw5teia1r32de9mrs4mqkhg680qj0d1d72mbxfb3b7pgvt4605qgdtw5sjj4dye6tusprq8gryhprhiobu6ykvwpohqezjb1vpodwsn9cq7tv5lwytj6x7sxmitzzf3x5aiy6xhogh0wntd6p6fbh7frwzct5y5lgcrb4i2tlopeqbmik7teoucwff6d2p8tm61ppyhq9d6d8jmzd9qulkpbdme0z7tewoofzn0oeg20265sm64d8c2vcg10z7nxl47k46k50wwnzskwgsof61yeczcjnpdx7capvvja0trno3110pahyc2ffmau81gct6fygfv3ggcny8xjd3u5p7pu0lgj4wuipvshbrsn00tdqeejwp2p9z0nps078y6g\",\"xlb0vmu89njug86v9os01kfo3plskhekn74vs5saydnvfwhb7ajccs54gey0z4mxvi47pv9gy0cv2w17ljli2ftzska990dnjrjuzmq1c2cwnp1jinvd4c7dowiljuvlc1xqac89ra4c6smwiu0iya3p20wabav7compr4sk66ny28mht4lk41tq0ofia1u37buyxdva9r9ryq5jpheejcnsehdsmgduzg0xjsgoq1tv447kzr645xjbsn0f6lf6z5ljpinsydhkhejky05gw6e2r3u7ouq8hlb83jqeazygozm37g3l22otgnz5oarm3zr4qnzgqmxccbqk1ufpg9aagyrcvkjuv11ekzxp4wzyhe74wghp3qtiua6m1nfhmg31t32ahjyb\"),\"xlb0vmu89njug86v9os01kfo3plskhekn74vs5saydnvfwhb7ajccs54gey0z4mxvi47pv9gy0cv2w17ljli2ftzska990dnjrjuzmq1c2cwnp1jinvd4c7dowiljuvlc1xqac89ra4c6smwiu0iya3p20wabav7compr4sk66ny28mht4lk41tq0ofia1u37buyxdva9r9ryq5jpheejcnsehdsmgduzg0xjsgoq1tv447kzr645xjbsn0f6lf6z5ljpinsydhkhejky05gw6e2r3u7ouq8hlb83jqeazygozm37g3l22otgnz5oarm3zr4qnzgqmxccbqk1ufpg9aagyrcvkjuv11ekzxp4wzyhe74wghp3qtiua6m1nfhmg31t32ahjyb\"),lineitem_1000000_enc_2.s,\"5puzomc3jy9sgcz0pu45fb1wao04v5umjk547r96vl4x9ibcf54p0787xsblkxwvqvwkp2zi2cc6j9n0svudtc65sotn75vgft429s0jqzvtskfkiuari0faezl9n55hkow43w0j09s4x88048unav96ag7s6avygvm9pvw7436r5tf35o13pcxx3hvtxl1izjdpsiyl4ur93s7u629w3m9ayxsdkhe4cvm7s25zjttr9dwv1xt11sp7khmwkqk10869rzfrfj3suenfdc3cz5059cevnlsiqgixy6dv8g6qk75b592h69xgjb3zjek0voqvaia6sozod5uff9x544dduor3ozrrl8kbwemsxf2bx1xs3vil8dkouowj9r2ymbnugty1d3ac\",\"9givacuq4561nlu5za71vsh4uf8hapqy66aedn2k3902zmkpn8xk9zf1y5xv5phomoza24ory7ig62ydefb2yu7b55yondb0gzpv3anqtqx624p639uws1o9ahq3n813dyia7ohon28kff2q4d4sjrseni85u299x88uq4x84tey8ktee6vf2qi3e9ub4ewhmet3brsxjpk5wymz8tolq4t6c12o848axakm22lo5jvy5sp4ja8om5rrsnjozp2tzsg99pdg8lvkr63jgyhcls3sccsozb9qwm72fbal9ginoihjh75n9z4vv3986ddvg22crohhbu78wuivrsv6us59ph9urz7kx1ez3ms1bqb10mqmjlzurnfl95y9hdifz81sfiwjqq91\",\"xlb0vmu89njug86v9os01kfo3plskhekn74vs5saydnvfwhb7ajccs54gey0z4mxvi47pv9gy0cv2w17ljli2ftzska990dnjrjuzmq1c2cwnp1jinvd4c7dowiljuvlc1xqac89ra4c6smwiu0iya3p20wabav7compr4sk66ny28mht4lk41tq0ofia1u37buyxdva9r9ryq5jpheejcnsehdsmgduzg0xjsgoq1tv447kzr645xjbsn0f6lf6z5ljpinsydhkhejky05gw6e2r3u7ouq8hlb83jqeazygozm37g3l22otgnz5oarm3zr4qnzgqmxccbqk1ufpg9aagyrcvkjuv11ekzxp4wzyhe74wghp3qtiua6m1nfhmg31t32ahjyb\"), \"gsniftf44trx843fmue00s7u1uswa8pablkfw2w5h6txpy8nln9o6e2k87h0hkbgxr23uxmqh06fjg0lsrsr17wzwa54mi6trvrxhtd0o16gbuirrbxok63oug9arxfso0yv5644vn263ebg9f09h51uj0g55nflocbcvkea33bz14b8wkas20wv0c7r50x1lnxhgoxn4vmvzd2ruqp79obw78owb86xhq0grw8cd0wxk23shvl22yrnwbi7laplhksrurbwh6qs8p9sh02qg371djx3ufd48snm1rv75hz8cht1lq1sj1ceqbzku5dt1zvkdbzqdbgo65va0x7uq4n58hdofs9xfiipahyukghz8p3kg88ujverf53b0tpqt81iwjj58rz5\") > 0";

//    String testQuery3 = "SELECT sdb_add(demo.b,sdb_keyUp(demo.c,demo.s,\"cql6axsb2luuethaqo9qovsabuk0w94vizj7a3yasw0uhoqmt23bu5bxb2p1h185juzii2h1itudb156dfli8gblcsce2oefwvngkesg8egoux8337135vex728vwx8m7zk9kvtjuiclo4pze4l055hqjkd3g64jcvd25uk47ood24rk8ael2n0r8iqzhxredqpm0r\",\"pko511if66s6837koqp57bs97x1r4fy0wyq6nbb311xgqq58h5issiktzkxh5es9ik20hfbtqqulfepqm1xo4vym9ubhlxoviqkbp8vuxjfzq4f743c4f3263j4rdu5xmkp63wdcexytw1drwyek7wuqq64zzsxs4obqu739b2g3k83yvasws2lf1ewmbhf0qtxn6\",\"x85p78s6j7z61olehg44vtgynd6yrjweiws5cvqcrdjrtb2tmotfev0m2dkbswj11761brle3zx2upyx208e3aixwjsy5mtu67ouksrnq7q02ft5h2dcdzsbz10v0myg4ufvkr5d5k8b8udltc6fnkc2yxqulfazxhle8s2hthauj3zisu4ol9nbja8qjm8icf8rmj\"),demo.s,\"uzw4cjnkburr88ktol6khcrilth87gvs1j0k75txew2z7pr3mx6il8kvb6v4ikmhsec6lw07k4otgkzm237crwtkc25erz51qmw023y4ns2asyj8jx5o29u3fi0mz9mkop8a9yvk1p23zakc6cejvpn6c2mr5pcwh9poo4ugzrfgmf37ifs4gwdmrv2jprkjunt2xp\",\"izjmmpnxukz7wr8fr1grdf47gpiv3q3qur74mkk1v3sp9fysz4d29izf7rjfkyw5jgnxfs7wie0dd2fppm9sgiiuvf33lkqz5up1e3sxzeouvzaz90b15mpnbh2trklctfw4mvjaax8ifbkuufc32ohd4trr9lq4har9j2dt3eltzp4mttk4fxxlxcbwf4u9x3vr30\",\"khkiwazvgm4bmv43qrue6xoobimxvarizx8y2rs1yhixbmc6tmq3kpooravabvavhc6itp4cl62pjotqokmvuu7cjrgk2yfe9bzgu7some6kx23ht4y2az2wvkba2xd2titqncta7bxgbbhyea8ktmoxudyoeyl0scnbi9gqanqxlvt451rs1sgsezaa10xh1b7q0d\",\"obe63v8fzxz9e64pvcjb3kyxg4p0uf8n8meg1zbokm3z0imoylxtn1rpo6mhz8ru822s68jjk203hwdslg24slq7mg628chpwipe3hqas56oirhb66qqlszf6qp5u3mlibdjntuz2sfixsutsze31x5ttc3zq8kea06writ5n55qkqzdczdu2k2rz7k3eyhbk4hdg2\",\"x85p78s6j7z61olehg44vtgynd6yrjweiws5cvqcrdjrtb2tmotfev0m2dkbswj11761brle3zx2upyx208e3aixwjsy5mtu67ouksrnq7q02ft5h2dcdzsbz10v0myg4ufvkr5d5k8b8udltc6fnkc2yxqulfazxhle8s2hthauj3zisu4ol9nbja8qjm8icf8rmj\") AS c238, demo.row_id\n" +
//            "FROM demo";


    System.out.println("Testing UDF " + sql);
//    java.sql.ResultSet res = con.createStatement().executeQuery(testQuery3);
//    while(res.next()){
//      System.out.println(res.getObject(1));
//    };
    System.out.println("100 results server time: " + profileUtil.getDuration());

    return con;
  }


  @Test
  public void testExecuteCreate() throws Exception{
//    testCreateInternal();
//    testLoadInternal();

    testSimpleSelect();
    ;
  }

  private void testCreateInternal() throws ParseException, SemanticException, UnSupportedException, SQLException, RemoteException {

    String testQuery = simpleCreateQuery;

    // Parse & analyse
    System.out.println("Parsing " + testQuery);
    parser = new ParseDriver();
    semanticAnalyzer = new SemanticAnalyzer(metaDB);
    ASTNode parsedNode = parser.parse(testQuery);
    ParseNode analyzedNode  = semanticAnalyzer.analyze(parsedNode);

    // Rewrite
    System.out.println("Rewriting " + analyzedNode.toSql());
    sdbSchemeRewriter = new SdbSchemeRewriter(metaDB.getAllDBs().get(0));
    sdbSchemeRewriter.rewrite(analyzedNode);

    // Optimize
    System.out.println("Optimizing " + analyzedNode.toSql());
    optimizer = new RuleBaseOptimizer();
    PlanNode planNode = optimizer.optimize(analyzedNode, connection, metaDB);

    // Execute
    executor = new Executor();
    SdbResultSet resultSet = new SdbResultSet();
    ExecutionState eState = new ExecutionState();
    executor.execute(planNode, eState, resultSet);
  }

  private void testLoadInternal() throws ParseException, SemanticException, UnSupportedException, SQLException, RemoteException {
    String testQuery = simpleLoadQuery;

    SdbStatement sdbStatement = new SdbStatement(metaDB, connection);
    sdbStatement.executeQuery(testQuery);
  }

}