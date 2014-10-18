package edu.hku.sdb.parser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    
    {
        ParseDriver parseDriver = new ParseDriver();
        //        String stmtArray = "  SELECT COUNT(*) FROM wgEncodeBroadHistone.wgEncodeBroadHistoneGm12878ControlStdSig  ; SELECT COUNT(*" +
        //                ") FROM wgEncodeBroadHistone.wgEncodeBroadHistoneGm12878ControlStdSig  ;";
        String stmtArray = "CREATE TABLE employee (\n" +
        "id int ,\n" +
        "age int,\n" +
        "salary int ENC  \n" +
        ") ;"
        
        
        //              + "SELECT page_views.*\n" +
        //              "FROM page_views JOIN dim_users\n" +
        //              "  ON (page_views.user_id = dim_users.id " +
        //              "AND page_views.date >= '2008-03-01' AND page_views.date <= '2008-03-31')\n"
        
        + "select id, sum(price*quantity) "
        +"from (select id, price, quantity from A JOIN B ) t "
        +"group by id;";
        
        
        //SELECT col1 FROM (SELECT col1, SUM(col2) AS col2sum FROM t1 GROUP BY col1) t2 WHERE t2.col2sum > 10
        ;
        
        
        String[] stmts = stmtArray.split(";");
        for (String stmt : stmts)
            try {
                ASTNode tree = parseDriver.parse(stmt.trim());
                DOTTreeGenerator gen = new DOTTreeGenerator();
                StringTemplate st = gen.toDOT(tree);
                System.out.println(st);
                System.out.println(stmt);
                System.out.println(tree.prettyPrint());

            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        assertTrue( true );
    }
}
