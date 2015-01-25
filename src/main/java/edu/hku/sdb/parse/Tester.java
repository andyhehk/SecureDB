/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 *******************************************************************************/
package edu.hku.sdb.parse;

import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class Tester {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ParseDriver pd = new ParseDriver();
        String[] stmts = args[0].split(";");
        for (String stmt : stmts)
            try {
                ASTNode tree = pd.parse(stmt.trim());
                DOTTreeGenerator gen = new DOTTreeGenerator();
                StringTemplate st = gen.toDOT(tree);
                System.out.println(st);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }

    }

}
