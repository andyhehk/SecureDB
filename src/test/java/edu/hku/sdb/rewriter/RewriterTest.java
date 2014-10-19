package edu.hku.sdb.rewriter;

import edu.hku.sdb.parser.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


/**
 * Unit test for simple App.
 */
public class RewriterTest extends TestCase
{

    private ParseDriver parseDriver;
    private String stmtArraySimple;
    private String stmtArrayOneLevel;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RewriterTest ( String testName )
    {
        super( testName );
    }


    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ParserTest.class );
    }

    public void setUp(){
        this.parseDriver = new ParseDriver();

        this.stmtArraySimple = "CREATE TABLE employee (id int, age int, salary int ENC);";
        this.stmtArrayOneLevel = "select id, sum(price*quantity) from (select id, price, quantity from A JOIN B ) t group by id;";
    }

    /**
     * Rigourous Test :-)
     */
    public void testParserSimple()
    {
        String[] stmts = stmtArraySimple.split(";");
        for (String stmt : stmts)
            try {
                doPrettyPrint(stmt);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        assertTrue( true );
    }

    public void testParserOneLevel(){
        String[] stmts = stmtArrayOneLevel.split(";");
        for (String stmt : stmts)
            try {
                doPrettyPrint(stmt);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        assertTrue( true );
    }

    private void printVizTree(ASTNode tree){
        TestUtility testUtility = new TestUtility(tree);
        System.out.println(testUtility.visualize());
    }

    private void doPrettyPrint(String stmt) throws ParseException{
        ASTNode tree = parseDriver.parse(stmt.trim());
        System.out.println("Input SQL: " + stmt);
        System.out.println("Output SQL: " + tree.prettyPrint());
    }

}