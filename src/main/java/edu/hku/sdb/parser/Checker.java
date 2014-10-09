package edu.hku.sdb.parser;


import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import javax.print.DocFlavor;

/**
 * Introduction: This is an independent tool to check the basic syntax of stql language.
 * Usage: java -jar Checker.jar "query1;query2;...;"
 * query1, query2 are stql queries.
 */

public class Checker {
    public static void main(String[] args) {
        ParseDriver pd = new ParseDriver();
//        String stmtArray = "  SELECT COUNT(*) FROM wgEncodeBroadHistone.wgEncodeBroadHistoneGm12878ControlStdSig  ; SELECT COUNT(*" +
//                ") FROM wgEncodeBroadHistone.wgEncodeBroadHistoneGm12878ControlStdSig  ;";
        String stmtArray = "CREATE TABLE employee (\n" +
                "id int ,\n" +
                "age int,\n" +
                "salary int ENC  \n" +
                ") ;";
        String[] stmts = stmtArray.split(";");
        for (String stmt : stmts)
            try {
                ASTNode tree = pd.parse(stmt.trim());
                DOTTreeGenerator gen = new DOTTreeGenerator();
                StringTemplate st = gen.toDOT(tree);
                System.out.println(st);
                System.out.println(stmt);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
    }
}