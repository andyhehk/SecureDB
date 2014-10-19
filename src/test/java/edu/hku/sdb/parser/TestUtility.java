package edu.hku.sdb.parser;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


/**
 * Unit test for simple App.
 */
public class TestUtility
{
    private ASTNode tree;

    public TestUtility(ASTNode tree){
        this.tree = tree;
    }

    public String visualize(){
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        return st.toString();
    }

}
