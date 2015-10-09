package edu.hku.sdb.connect;

import edu.hku.sdb.conf.HiveServerConf;
import edu.hku.sdb.conf.ODPSServerConf;
import edu.hku.sdb.conf.ServerConf;
import edu.hku.sdb.conf.ServerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by andy on 9/30/15.
 */
public class ServerConFactory {
  private static final Logger LOG = LoggerFactory.getLogger(ServerConFactory.class);

  public static ServerConnection getServerCon(ServerConf serverConf) {

    // Get a Hive server connection
    LOG.info("Creating server connection for " + serverConf.getType());

    if(serverConf.getType() == ServerType.HIVE) {
      HiveServerConf hiveServerConf = (HiveServerConf) serverConf;

      JDBCServerConnection serverConnection = new JDBCServerConnection(hiveServerConf);

      // register UDFs
      final String serverUDFPATH = System.getenv("SDB_SERVER_UDF_PATH");

      if (serverUDFPATH == null) {
        LOG.error("Please specify the path that the UDF jar store on server!");
        System.exit(1);
      }

      serverConnection.execute("add jar " + serverUDFPATH);
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_intadd AS 'edu.hku.sdb.udf.hive.SdbIntAddUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_add AS 'edu.hku.sdb.udf.hive.SdbAddUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_mul AS 'edu.hku.sdb.udf.hive.SdbMultiUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_sum AS 'edu.hku.sdb.udf.hive.SdbSumUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_first AS 'edu.hku.sdb.udf.hive.SdbFirstUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_keyUp AS 'edu.hku.sdb.udf.hive.SdbKeyUpdateUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_keyUpPlain AS 'edu.hku.sdb.udf.hive.SdbKeyUpdatePlainUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_cartesian AS 'edu.hku.sdb.udf.hive.SdbCartProdUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_lt AS 'edu.hku.sdb.udf.hive.SdbLtUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_gt AS 'edu.hku.sdb.udf.hive.SdbGtUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_le AS 'edu.hku.sdb.udf.hive.SdbLeUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_ge AS 'edu.hku.sdb.udf.hive.SdbGeUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_eq AS 'edu.hku.sdb.udf.hive.SdbEqUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_ne AS 'edu.hku.sdb.udf.hive.SdbNeUDF'");
      serverConnection.execute("CREATE TEMPORARY FUNCTION sdb_search AS 'edu.hku.sdb.udf.hive.SdbSearchUDF'");
      serverConnection.execute("set hive.auto.convert.join=false");

      return serverConnection;
    }

    // Get a ODPS server connection
    else if(serverConf.getType() == ServerType.ODPS) {
      ODPSServerConf odpsServerConf = (ODPSServerConf) serverConf;

      ODPSServerConnection serverConnection = new ODPSServerConnection(odpsServerConf);

      // register UDFs was done out side of the program.

      return serverConnection;
    }

    else {
      LOG.error("Cannot support the server type: " + serverConf.getType());
      System.exit(1);
      return null;
    }
  }
}
