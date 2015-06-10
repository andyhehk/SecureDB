/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.parse;

import java.util.HashMap;
import java.util.Map;

import edu.hku.sdb.parse.BinaryPredicate.BinOperator;
import edu.hku.sdb.parse.NormalArithmeticExpr.Operator;

public class ParseUtils {

  public static final Map<Integer, Operator> OPERATOR_MAP = new HashMap<Integer, Operator>() {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    {
      put(HiveLexer.PLUS, Operator.ADD);
      put(HiveLexer.MINUS, Operator.SUBTRACT);
      put(HiveLexer.STAR, Operator.MULTIPLY);
      put(HiveLexer.DIV, Operator.DIVIDE);
    }
  };

  public static final Map<Integer, JoinOperator> JOIN_OPERATOR_MAP = new HashMap<Integer, JoinOperator>() {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    {
      put(HiveParser.TOK_JOIN, JoinOperator.INNER_JOIN);
      put(HiveParser.TOK_LEFTOUTERJOIN, JoinOperator.LEFT_OUTER_JOIN);
      put(HiveParser.TOK_RIGHTOUTERJOIN, JoinOperator.RIGHT_OUTER_JOIN);
      put(HiveParser.TOK_FULLOUTERJOIN, JoinOperator.FULL_OUTER_JOIN);
      put(HiveParser.TOK_CROSSJOIN, JoinOperator.CROSS_JOIN);
    }
  };

  public static final Map<Integer, BinOperator> BIN_OPERATOR_MAP = new HashMap<Integer, BinOperator>() {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    {
      put(HiveLexer.LESSTHAN, BinOperator.LT);
      put(HiveLexer.GREATERTHAN, BinOperator.GT);
      put(HiveLexer.EQUAL, BinOperator.EQ);
      put(HiveLexer.NOTEQUAL, BinOperator.NE);
      put(HiveLexer.LESSTHANOREQUALTO, BinOperator.LE);
      put(HiveLexer.GREATERTHANOREQUALTO, BinOperator.GE);
    }
  };

  public static ASTNode findRootNotNull(ASTNode tree) {
    while ((tree.getToken() == null) && (tree.getChildCount() > 0)) {
      tree = (ASTNode) tree.getChild(0);
    }
    return tree;
  }
}
