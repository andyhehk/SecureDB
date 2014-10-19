/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.hku.sdb.rewriter;

import edu.hku.sdb.parser.ASTNode;
import edu.hku.sdb.parser.HiveParser;
import edu.hku.sdb.parser.Node;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.Token;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class HiveRewriter extends AbstractRewriter{

    private ASTNode tree;

    public HiveRewriter(ASTNode tree){
        this.tree = tree;
    }

    public void rewrite(){
        rewrite(this.tree);
    }

    public void rewrite(ASTNode tree){
        ArrayList<Node> children = tree.getChildren();
        Token token = tree.getToken();

        if (token != null){
            if (token.getText().equals("*")) {
                token.setText("sdb_mul");
            }
        }

        rewriteChildren(children);

        return;
    }

    private void rewriteChildren(ArrayList<Node> children){
        for (int i = 0; children!=null && i < children.size(); i++) {
            ASTNode t = (ASTNode) children.get(i);
            rewrite(t);
        }
    }


    public String prettyPrint(){
        return this.tree.prettyPrint();
    }

}