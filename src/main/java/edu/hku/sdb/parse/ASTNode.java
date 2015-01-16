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

import java.io.Serializable;
import java.util.ArrayList;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 *
 */
public class ASTNode extends CommonTree implements Node, Serializable {
  private static final long serialVersionUID = 1L;

  private ASTNodeOrigin origin;

  public ASTNode() {
  }

  /**
   * Constructor.
   * 
   * @param t
   *          Token for the CommonTree Node
   */
  public ASTNode(Token t) {
    super(t);
  }

  public ASTNode(ASTNode node) {
    super(node);
    this.origin = node.origin;
  }

  @Override
  public Tree dupNode() {
    return new ASTNode(this);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.hadoop.hive.ql.lib.Node#getChildren()
   */
  @Override
  public ArrayList<Node> getChildren() {
    if (super.getChildCount() == 0) {
      return null;
    }

    ArrayList<Node> ret_vec = new ArrayList<Node>();
    for (int i = 0; i < super.getChildCount(); ++i) {
      ret_vec.add((Node) super.getChild(i));
    }

    return ret_vec;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.hadoop.hive.ql.lib.Node#getName()
   */
  public String getName() {
    return (Integer.valueOf(super.getToken().getType())).toString();
  }

  /**
   * @return information about the object from which this ASTNode originated, or
   *         null if this ASTNode was not expanded from an object reference
   */
  public ASTNodeOrigin getOrigin() {
    return origin;
  }

  /**
   * Tag this ASTNode with information about the object from which this node
   * originated.
   */
  public void setOrigin(ASTNodeOrigin origin) {
    this.origin = origin;
  }

  public String dump() {
    StringBuilder sb = new StringBuilder();

    sb.append('(');
    sb.append(toString());
    ArrayList<Node> children = getChildren();
    if (children != null) {
      for (Node node : getChildren()) {
        if (node instanceof ASTNode) {
          sb.append(((ASTNode) node).dump());
        } else {
          sb.append("NON-ASTNODE!!");
        }
      }
    }
    sb.append(')');
    return sb.toString();
  }

  @Override
  public String toStringTree() {
    if (children == null || children.size() == 0) {
      return this.toString();
    }
    StringBuffer buf = new StringBuffer();
    if (!isNil()) {
      String tokenText = token.getText();
      if (tokenText.equals("TOK_QUERY")) {
        ASTNode insertTree = (ASTNode) children.get(findChild("TOK_INSERT"));
        int groupByIndex = insertTree.findChild("TOK_GROUPBY");
        if (groupByIndex != 0) {
          ASTNode groupByTree = (ASTNode) insertTree.getChildren().get(
              groupByIndex);
          StringBuffer groupByBuffer = new StringBuffer();
          groupByBuffer.append(groupByTree.toStringTree());
          Tree second = (Tree) children.get(1);
          buf.append(second.toStringTree());
          buf.delete(buf.length() - groupByBuffer.length(), buf.length());
          Tree first = (Tree) children.get(0);
          buf.append(first.toStringTree());
          buf.append(" ");
          buf.append(groupByBuffer.toString());
          buf.append(" ");
          return buf.toString();
        } else {
          Tree second = (Tree) children.get(1);
          buf.append(second.toStringTree());
          Tree first = (Tree) children.get(0);
          buf.append(first.toStringTree());
          return buf.toString();
        }
      }

      else if (tokenText.equals("TOK_SUBQUERY")) {
        buf.append("(");
        Tree first = (Tree) children.get(0);
        buf.append(first.toStringTree());
        buf.append(")");
        buf.append(" ");
        Tree second = (Tree) children.get(1);
        buf.append(second.toStringTree());
        buf.append(" ");
        return buf.toString();
      }

      else if (tokenText.equals("TOK_DESTINATION")) {
        return "";
      }

      else if (tokenText.equals("TOK_SELECT")) {
        buf.append(this.toString());
        childToStringTree(buf);
        buf.deleteCharAt(buf.indexOf(","));
        buf.append(" ");
        return buf.toString();

      } else if (tokenText.equals("TOK_TABCOLLIST")) {
        buf.append("(");
        childToStringTree(buf);
        buf.deleteCharAt(buf.length() - 1);
        buf.append(")");
        buf.append(" ");
        return buf.toString();
      } else if (tokenText.equals("TOK_TABCOL")) {
        childToStringTree(buf);
        buf.append(",");
        return buf.toString();
      }

      else if (tokenText.equals("*") || tokenText.equals("/")) {
        Tree first = (Tree) children.get(0);
        buf.append(first.toStringTree());
        buf.append(" " + tokenText + " ");
        Tree second = (Tree) children.get(1);
        buf.append(second.toStringTree());
        buf.append(" ");
        return buf.toString();
      }

      else if (tokenText.equals("sdb_mul")) {
        Tree first = (Tree) children.get(0);
        buf.append(tokenText + "(");
        buf.append(first.toStringTree());
        Tree second = (Tree) children.get(1);
        buf.append(", ");
        buf.append(second.toStringTree());
        buf.append(") ");
        return buf.toString();
      }

      else if (tokenText.equals("TOK_JOIN")) {
        Tree first = (Tree) children.get(0);
        buf.append(first.toStringTree());
        buf.append(" JOIN ");
        Tree second = (Tree) children.get(1);
        buf.append(second.toStringTree());
        buf.append(" ");
        return buf.toString();
      }

      if (tokenText.equals("TOK_FUNCTION")) {
        if (getChildCount() > 1) {
          ASTNode functionTree = (ASTNode) children.get(0);
          buf.append(functionTree.toString());
          buf.append("(");
          ASTNode paramsTree = (ASTNode) children.get(1);
          buf.append(paramsTree.toStringTree());
          buf.append(")");
          return buf.toString();
        } else
          return buf.toString();
      } else {
        buf.append(this.toString());
        buf.append(' ');
      }
    }
    childToStringTree(buf);
    return buf.toString();
  }

  private void childToStringTree(StringBuffer buf) {
    for (int i = 0; children != null && i < children.size(); i++) {
      Tree t = (Tree) children.get(i);
      if (i > 0) {
        buf.append(' ');
      }
      buf.append(t.toStringTree());
    }
  }

  private int findChild(String token) {
    for (int i = 0; children != null && i < children.size(); i++) {
      Tree t = (Tree) children.get(i);
      if (t.getText().equals(token))
        return i;
    }
    return 0;
  }

  public String toString() {
    if (isNil())
      return "nil";
    if (getType() == Token.INVALID_TOKEN_TYPE)
      return "<errornode>";
    if (token == null)
      return null;
    else if (token.getText().equals("TOK_CREATETABLE"))
      return "CREATE TABLE";
    else if (token.getText().equals("TOK_SELEXPR"))
      return ",";
    else if (token.getText().equals("TOK_TABNAME"))
      return "";
    else if (token.getText().equals("TOK_FROM"))
      return "FROM";
    else if (token.getText().equals("TOK_SELECT"))
      return "SELECT";
    else if (token.getText().equals("TOK_FUNCTION"))
      return "";
    else if (token.getText().equals("TOK_INT"))
      return "int";
    else if (token.getText().equals("TOK_ENC"))
      return "ENC";
    else if (token.getText().equals("<EOF>"))
      return ";";
    else if (token.getText().equals("TOK_TABREF"))
      return "";
    else if (token.getText().equals("TOK_TABCOLLIST"))
      return "";
    else if (token.getText().equals("TOK_INSERT"))
      return "";
    else if (token.getText().equals("TOK_TABLE_OR_COL"))
      return "";
    else if (token.getText().equals("TOK_LIKETABLE"))
      return "";
    else if (token.getText().equals("TOK_GROUPBY"))
      return "GROUP BY";
    else
      return token.getText();
  }

  public String prettyPrint() {
    String result = this.toStringTree();
    result = result.replaceAll("\\s+", " ");
    return result;
  }
}
