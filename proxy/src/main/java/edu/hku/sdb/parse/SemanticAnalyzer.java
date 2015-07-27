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

import java.util.ArrayList;
import java.util.List;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.parse.BinaryPredicate.BinOperator;
import edu.hku.sdb.parse.CompoundPredicate.CompoundOperator;
import edu.hku.sdb.parse.NormalArithmeticExpr.Operator;

public class SemanticAnalyzer extends BasicSemanticAnalyzer {

  private final MetaStore metaDB;

  public SemanticAnalyzer(MetaStore metaDB) {
    this.metaDB = metaDB;
  }

  /**
   * Perform semantic analyze of a AST tree. A new parse tree is returned.
   *
   * @return parseNode
   */
  @Override
  public ParseNode analyze(ASTNode tree) throws SemanticException {
    tree = ParseUtils.findRootNotNull(tree);
    return analyzeInternal(tree);
  }

  /**
   * Analyze from the token of the root.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private ParseNode analyzeInternal(ASTNode tree) throws SemanticException {
    ParseNode parseTree = null;

    switch (tree.getType()) {
      case HiveParser.TOK_QUERY:
        parseTree = buildStmt(tree);
        break;
      case HiveParser.TOK_CREATETABLE:
        parseTree = buildCreateStmt(tree);
        break;
      case HiveParser.TOK_LOAD:
        parseTree = buildLoadStmt(tree);
        break;
    }

    if (parseTree != null)
      parseTree.analyze(metaDB, (ParseNode) null);

    return parseTree;
  }

  /**
   * Construct a loading data statement.
   * @param tree
   * @return
   * @throws SemanticException
   */
  private ParseNode buildLoadStmt(ASTNode tree) throws SemanticException {

    String filePath = tree.getChild(0).getText().replace("'", "");
    TableName tableName = new TableName();

    //Get table name from AST
    ASTNode secondChild = (ASTNode) tree.getChild(1);
    if (secondChild.getType() == HiveParser.TOK_TAB) {
      ASTNode secondLevelChild = (ASTNode) secondChild.getChild(0);
      if (secondLevelChild.getType() == HiveParser.TOK_TABNAME) {
        tableName.setName(secondLevelChild.getChild(0).getText());
      }
    }
    LoadStmt loadStmt = new LoadStmt(filePath, tableName);
    return loadStmt;
  }

  /**
   * Construct a query statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private StatementBase buildStmt(ASTNode tree) throws SemanticException {
    StatementBase stmt = null;
    InsertStmt insertStmt = null;
    List<TableRef> fromStmt = null;

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_FROM:
          fromStmt = buildFromStmt(child);
          continue;
        case HiveParser.TOK_INSERT:
          insertStmt = buildInsertStmt(child);
          continue;
        default:
          throw new SemanticException("Unsupported Query Type!");
      }
    }

    if (insertStmt != null) {
      if (fromStmt != null)
        ((SelectStmt) insertStmt.getQueryStmt()).setTableRefs(fromStmt);

      // It is just a simple selection query.
      if (insertStmt.getTargetTbl() == null)
        stmt = insertStmt.getQueryStmt();
      else
        stmt = insertStmt;
    }

    return stmt;
  }

  /**
   * Construct a insert statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private InsertStmt buildInsertStmt(ASTNode tree) throws SemanticException {
    SelectStmt selectStmt = new SelectStmt();
    Expr whereStmt = null;
    List<Expr> groupingExprs = null;
    Expr havingExpr = null;
    String targetTbl = null;
    ArrayList<OrderByElement> orderByElements = null;
    LimitElement limitElemt = null;

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_SELECT:
          selectStmt = buildSelectStmt(child);
          continue;
        case HiveParser.TOK_WHERE:
          whereStmt = buildWhereStmt(child);
          continue;
        case HiveParser.TOK_GROUPBY:
          groupingExprs = buildGroupByStmt(child);
          // TODO cannot support "insert into" yet
        case HiveParser.TOK_DESTINATION:
          targetTbl = findDestination(child);
          continue;
        case HiveParser.TOK_ORDERBY:
          orderByElements = buildOrderByStmt(child);
          continue;
        case HiveParser.TOK_LIMIT:
          limitElemt = buildLimitElemt(child);
          continue;
        case HiveParser.TOK_HAVING:
          havingExpr = buildHavingExpr(child);
          continue;
        default:
          throw new SemanticException("Unsupported TOKEN: " + child.getText());
      }
    }

    InsertStmt insertStmt = new InsertStmt(targetTbl);

    if (selectStmt != null) {
      selectStmt.setWhereClause(whereStmt);
      selectStmt.setGroupingExprs(groupingExprs);
      selectStmt.setHavingExpr(havingExpr);
      selectStmt.setOrderByElements(orderByElements);
      selectStmt.setLimitElement(limitElemt);
    }

    insertStmt.setQueryStmt(selectStmt);

    return insertStmt;
  }

  /**
   * Construct a create table statement.
   * @param tree
   * @return
   * @throws SemanticException
   */
  private CreateStmt buildCreateStmt(ASTNode tree) throws SemanticException {
    CreateStmt createStmt = new CreateStmt();
    TableName tableName = null;
    List<ColumnDefinition> colDefinitions = null;
    TableRowFormat tableRowFormat = null;

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_TABNAME:
          tableName = new TableName();
          tableName.setName(child.getChild(0).getText());
          continue;
        case HiveParser.TOK_TABCOLLIST:
          colDefinitions = buildColDefinitions(child);
          continue;
        case HiveParser.TOK_TABLEROWFORMATFIELD:
          tableRowFormat = buildTableRowFormat(child);
          continue;
          //TODO doesn't support create from as select ... yet
        case HiveParser.TOK_INSERT:
        case HiveParser.TOK_LIKETABLE:
          continue;
        default:
          throw new SemanticException("Unsupported Query Type!");
      }
    }

    createStmt.setColumnDefinitions(colDefinitions);
    createStmt.setTableName(tableName);
    createStmt.setTableRowFormat(tableRowFormat);

    return createStmt;
  }

  /**
   * Construct the table row format expression. Hive specific.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private TableRowFormat buildTableRowFormat(ASTNode tree) throws
          SemanticException {
    TableRowFormat tableRowFormat = null;

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_SERDEPROPS:
          ASTNode secondLevelChild = (ASTNode) child.getChild(0);
          if (secondLevelChild.getType() == HiveParser
                  .TOK_TABLEROWFORMATFIELD) {
            tableRowFormat = new TableRowFormat();
            tableRowFormat.setRowFieldFormat(secondLevelChild.getChild(0)
                    .getText());
            return tableRowFormat;
          }
        default:
          throw new SemanticException("Unsupported Query Type!");
      }
    }
    return tableRowFormat;
  }

  /**
   * Return the set of column definitions in the create table statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private List<ColumnDefinition> buildColDefinitions(ASTNode tree)
          throws SemanticException {
    List<ColumnDefinition> colDefinitions = new ArrayList<>();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_TABCOL:
          colDefinitions.add(buildColDefinition(child));
          continue;
        default:
          throw new SemanticException("Unsupported Query Type!");
      }
    }


    return colDefinitions;
  }

  /**
   * Construct a single column definition expression.
   * @param tree
   * @return
   * @throws SemanticException
   */
  private ColumnDefinition buildColDefinition(ASTNode tree) throws
          SemanticException {
    Type type;
    String fieldName = tree.getChild(0).getText();
    boolean isSensitive = false;
    int length;
    int precision;
    int scale;

    ASTNode secondChild = (ASTNode) tree.getChild(1);

    switch (secondChild.getType()) {
      case HiveParser.TOK_VARCHAR:
        length = Integer.valueOf(secondChild.getChild(0).getText());
        type = ScalarType.createVarcharType(length);
        break;
      case HiveParser.TOK_CHAR:
        length = Integer.valueOf(secondChild.getChild(0).getText());
        type = ScalarType.createCharType(length);
        break;
      case HiveParser.TOK_INT:
        type = Type.INT;
        break;
      case HiveParser.TOK_DECIMAL:
        precision = Integer.valueOf(secondChild.getChild(0).getText());
        scale = Integer.valueOf(secondChild.getChild(1).getText());
        type = ScalarType.createDecimalType(precision, scale);
        break;
      default:
        throw new SemanticException("Unsupported Data Type!");
    }

    // mark sensitive in case of ENC
    if (tree.getChildren().size() >= 3 && tree.getChild(2).getType() ==
            (HiveParser.TOK_ENC)) {
      if(type instanceof ScalarType) {
        PrimitiveType priType = ((ScalarType)type).getType();
        switch (priType) {
          case INT:
          case DECIMAL:
            isSensitive = true;
            break;
          default:
            throw new SemanticException(" SDB encryption cannot support data type " + priType);
        }
      }
    }

    ColumnDefinition fieldLiteral = new ColumnDefinition(fieldName, type);
    if (isSensitive) {
      fieldLiteral.setSDBEncrypted(true);
    }

    return fieldLiteral;
  }


  /**
   * Get the query statement without the "insert into".
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private QueryStmt buildQueryStmt(ASTNode tree) throws SemanticException {

    StatementBase stmt = buildStmt(tree);

    if (stmt instanceof InsertStmt)
      return ((InsertStmt) stmt).getQueryStmt();
    else
      // WARNING: This cast is dangerous, should guarantee buildStmt return a
      // QueryStmt.
      return (QueryStmt) stmt;
  }

  /**
   * Construct the selection statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private SelectStmt buildSelectStmt(ASTNode tree) throws SemanticException {
    SelectStmt selectStmt = new SelectStmt();
    SelectionList selectList = new SelectionList();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        // TODO Cannot support select * at this moment
        case HiveParser.TOK_SELEXPR:
          selectList.getItemList().add(buildSelectItem(child));
          continue;
        default:
          throw new SemanticException("Unsupported selection element!");
      }
    }

    //TODO get DbMeta according to DBName
    //set global p, q, n, g
    //    DBMeta dbMeta = metaDB.getDB(DBMeta.defaultDbName);
    //    selectStmt.setP(new BigInteger(dbMeta.getP()));
    //    selectStmt.setQ(new BigInteger(dbMeta.getQ()));
    //    selectStmt.setN(new BigInteger(dbMeta.getN()));
    //    selectStmt.setG(new BigInteger(dbMeta.getG()));

    selectStmt.setSelectList(selectList);

    return selectStmt;
  }

  /**
   * Construct the from statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private List<TableRef> buildFromStmt(ASTNode tree) throws SemanticException {
    List<TableRef> tblRefs = new ArrayList<TableRef>();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_JOIN:
        case HiveParser.TOK_LEFTOUTERJOIN:
        case HiveParser.TOK_RIGHTOUTERJOIN:
        case HiveParser.TOK_FULLOUTERJOIN:
        case HiveParser.TOK_CROSSJOIN:
          tblRefs.addAll(buildJoinStmt(child,
                  ParseUtils.JOIN_OPERATOR_MAP.get(child.getType())));
          continue;
          //add a BaseTableRef if no join is encountered
        case HiveParser.TOK_TABREF:
          tblRefs.add(buildBaseTableRef(child, JoinOperator.NULL_JOIN));
          continue;
        default:
          throw new SemanticException("Unsupported from element!");
      }
    }

    return tblRefs;
  }


  /**
   * Construct a single/compound predicate.
   * @param tree
   * @return
   * @throws SemanticException
   */
  private Expr buildPredicate(ASTNode tree) throws SemanticException {
    Expr predicate = null;

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveLexer.LESSTHAN:
        case HiveLexer.GREATERTHAN:
        case HiveLexer.EQUAL:
        case HiveLexer.NOTEQUAL:
        case HiveLexer.LESSTHANOREQUALTO:
        case HiveLexer.GREATERTHANOREQUALTO:
          predicate = buildNormalBinPredicate(child,
                  ParseUtils.BIN_OPERATOR_MAP.get(child.getType()));
          continue;
        case HiveLexer.KW_AND:
        case HiveLexer.KW_OR:
          predicate = buildCompoundPredicate(child, ParseUtils
                  .COMPOUND_OPERATOR_MAP.get(child.getType()));
          continue;
        default:
          throw new SemanticException("Unsupported where element!");
      }
    }

    return predicate;
  }

  /**
   * Construct the where statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private Expr buildWhereStmt(ASTNode tree) throws SemanticException {
    return buildPredicate(tree);
  }

  private List<Expr> buildGroupByStmt(ASTNode tree) throws SemanticException {
    List<Expr> groupingExprs = new ArrayList<Expr>();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_TABLE_OR_COL:
          groupingExprs.add(new FieldLiteral("", child.getChild(0).getText()));
          continue;
        case HiveLexer.DOT:
          groupingExprs.add(buildDotExpr(child));
          continue;
        default:
          throw new SemanticException("Unsupported group by element!");
      }
    }

    return groupingExprs;
  }


  /**
   * Construct the having expression.
   * @param tree
   * @return
   * @throws SemanticException
   */
  private Expr buildHavingExpr(ASTNode tree) throws SemanticException {
    return buildPredicate(tree);
  }

  private ArrayList<OrderByElement> buildOrderByStmt(ASTNode tree) {
    ArrayList<OrderByElement> orderByElements = new ArrayList<OrderByElement>();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_TABSORTCOLNAMEASC:
          orderByElements.add(buildOrderbyElemt(child, true));
          continue;
        case HiveParser.TOK_TABSORTCOLNAMEDESC:
          orderByElements.add(buildOrderbyElemt(child, false));
          continue;
      }
    }

    return orderByElements;
  }

  /**
   * Construct the order by expression.
   * @param tree
   * @param isAsc
   * @return
   */
  private OrderByElement buildOrderbyElemt(ASTNode tree, boolean isAsc) {
    OrderByElement orderByElement = null;
    ASTNode child = (ASTNode) tree.getChild(0);

    switch (child.getType()) {
      case HiveParser.TOK_TABLE_OR_COL:
        orderByElement = new OrderByElement(new FieldLiteral("", child.getChild(0)
                .getText()), isAsc);
        break;
    }

    return orderByElement;
  }

  /**
   * Construct the limit expression.
   * @param tree
   * @return
   */
  private LimitElement buildLimitElemt(ASTNode tree) {
    LimitElement limitElemt = null;
    ASTNode child = (ASTNode) tree.getChild(0);

    switch (child.getType()) {
      case HiveParser.BigintLiteral:
      case HiveParser.SmallintLiteral:
      case HiveParser.TinyintLiteral:
      case HiveParser.Number:
        limitElemt = new LimitElement(new IntLiteral(child.getText()));
        break;
    }

    return limitElemt;
  }

  /**
   * Find the insert location.
   *
   * @param tree
   * @return
   */
  private String findDestination(ASTNode tree) {
    return null;
  }

  /**
   * Construct a selection item.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private SelectionItem buildSelectItem(ASTNode tree) throws SemanticException {
    SelectionItem selectItem = new SelectionItem();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      Expr expr;
      switch (child.getType()) {
        case HiveLexer.PLUS:
        case HiveLexer.MINUS:
        case HiveLexer.STAR:
        case HiveLexer.DIV:
          expr = buildNormalArithmeticExpr(child,
                  ParseUtils.OPERATOR_MAP.get(child.getType()));
          selectItem.setExpr(expr);
          continue;
        case HiveLexer.DOT:
          selectItem.setExpr(buildDotExpr(child));
          continue;
        case HiveParser.TOK_TABLE_OR_COL:
          selectItem.setExpr(new FieldLiteral(child.getChild(0).getText(),
                  new UnKnownType()));
          continue;
        case HiveLexer.Identifier:
          selectItem.setAlias(child.getText());
          continue;
          // The table names for these columns will be resolved during
          // semantic analysis
        case HiveParser.TOK_ALLCOLREF:
          selectItem.setExpr(new StarLiteral());
          continue;
        case HiveParser.TOK_FUNCTION:
          selectItem.setExpr(buildFunctionCallExpr(child));
          continue;
        case HiveParser.TOK_FUNCTIONSTAR:
          // It is a star function call.
          selectItem.setExpr(new FunctionCallExpr(new FunctionName(child.getChild
                  (0).getText())));
          continue;
        default:
          throw new SemanticException("Unsupported selection item!");
      }
    }

    return selectItem;
  }

  /**
   * Construct a normal arithmetic expression.
   *
   * @param tree
   * @param op
   * @return
   * @throws SemanticException
   */
  private Expr buildNormalArithmeticExpr(ASTNode tree, Operator op)
          throws SemanticException {
    NormalArithmeticExpr normalArithmeticExpr = new NormalArithmeticExpr(op);

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveLexer.PLUS:
        case HiveLexer.MINUS:
        case HiveLexer.STAR:
        case HiveLexer.DIV:
          normalArithmeticExpr.addChild(buildNormalArithmeticExpr(child,
                  ParseUtils.OPERATOR_MAP.get(child.getType())));
          continue;
        case HiveLexer.DOT:
          normalArithmeticExpr.addChild(buildDotExpr(child));
          continue;
        case HiveParser.TOK_TABLE_OR_COL:
          normalArithmeticExpr.addChild(new FieldLiteral("", child.getChild(0)
                  .getText(), new UnKnownType()));
          continue;
        case HiveParser.Number:
            normalArithmeticExpr.addChild(buildNumLiteral(child));
          continue;
        default:
          throw new SemanticException("Unsupported arithmetic element!");
      }
    }

    return normalArithmeticExpr;
  }

  /**
   * Construct an expression for dot reference.
   *
   * @param tree
   * @return
   */
  private Expr buildDotExpr(ASTNode tree) {
    // TODO Better to do error checking
    return new FieldLiteral(tree.getChild(0).getChild(0).getText(), tree
            .getChild(1).getText(),  new UnKnownType());
  }

  /**
   * Construct a function call expression.
   *
   * @param tree
   * @return
   */
  private FunctionCallExpr buildFunctionCallExpr(ASTNode tree) throws
          SemanticException {
    List<Expr> exprs = new ArrayList<Expr>();
    FunctionParams functionParams = new FunctionParams(exprs);
    FunctionCallExpr functionCallExpr = new FunctionCallExpr(null, functionParams);

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveLexer.Identifier:
          functionCallExpr.setName(new FunctionName(child.getText()));
          continue;
        case HiveParser.TOK_TABLE_OR_COL:
          Expr fieldLiteral = new FieldLiteral(child.getChild(0).getText(),  new UnKnownType());
          functionCallExpr.getFunctionParams().getExprs().add(fieldLiteral);
          continue;
        case HiveLexer.DOT:
          functionCallExpr.getFunctionParams().getExprs().add(buildDotExpr(child));
          continue;
        case HiveParser.TOK_FUNCTIONSTAR:
          FunctionParams childFunctionParams = FunctionParams.createStarParam();
          FunctionCallExpr childFunctionCallExpr = new FunctionCallExpr(new
                  FunctionName(child.getChild(0).getText()), childFunctionParams);
          functionCallExpr.getFunctionParams().getExprs().add(childFunctionCallExpr);
          continue;
        case HiveParser.TOK_FUNCTION:
          functionCallExpr.getFunctionParams().getExprs().add
                  (buildFunctionCallExpr(child));
          continue;
        default:
          throw new SemanticException("Unsupported function parameters!");
      }

    }

    return functionCallExpr;
  }

  /**
   * Construct a normal binary predicate.
   *
   * @param tree
   * @param op
   * @return
   * @throws SemanticException
   */
  private Expr buildNormalBinPredicate(ASTNode tree, BinOperator op)
          throws SemanticException {
    NormalBinPredicate binPred = new NormalBinPredicate(op);

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      Expr expr;
      switch (child.getType()) {
        case HiveLexer.PLUS:
        case HiveLexer.MINUS:
        case HiveLexer.STAR:
        case HiveLexer.DIV:
          expr = buildNormalArithmeticExpr(child,
                  ParseUtils.OPERATOR_MAP.get(child.getType()));
          binPred.addChild(expr);
          continue;
        case HiveLexer.DOT:
          binPred.addChild(buildDotExpr(child));
          continue;
        case HiveParser.TOK_TABLE_OR_COL:
          binPred.addChild(new FieldLiteral("", child.getChild(0).getText(),
                  new UnKnownType()));
          continue;
        case HiveParser.BigintLiteral:
        case HiveParser.SmallintLiteral:
        case HiveParser.TinyintLiteral:
          binPred.addChild(new IntLiteral(child.getText()));
          continue;
        case HiveParser.Number:
          binPred.addChild(buildNumLiteral(child));
          continue;
        case HiveParser.DecimalLiteral:
          binPred.addChild(new FloatLiteral(child.getText()));
          continue;
        case HiveParser.StringLiteral:
          binPred.addChild(new StringLiteral(child.getText()));
          continue;
        default:
          throw new SemanticException("Unsupported binary predicate element!");
      }
    }

    return binPred;
  }

  /**
   * Construct a compound predicate.
   *
   * @param tree
   * @param op
   * @return
   * @throws SemanticException
   */
  private Expr buildCompoundPredicate(ASTNode tree, CompoundOperator op) throws
          SemanticException {
    CompoundPredicate compoundPred = new CompoundPredicate(op);

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveLexer.LESSTHAN:
        case HiveLexer.GREATERTHAN:
        case HiveLexer.EQUAL:
        case HiveLexer.NOTEQUAL:
        case HiveLexer.LESSTHANOREQUALTO:
        case HiveLexer.GREATERTHANOREQUALTO:
          compoundPred.addChild(buildNormalBinPredicate(child,
                  ParseUtils.BIN_OPERATOR_MAP.get(child.getType())));
          continue;
        case HiveLexer.KW_AND:
        case HiveLexer.KW_OR:
          compoundPred.addChild(buildCompoundPredicate(child, ParseUtils
                  .COMPOUND_OPERATOR_MAP.get(child.getType())));
          continue;
        default:
          throw new SemanticException("Unsupported compound predicate element!");
      }
    }

    return compoundPred;
  }

  /**
   * Construct a join statement.
   *
   * @param tree
   * @param op
   * @return
   * @throws SemanticException
   */
  private List<TableRef> buildJoinStmt(ASTNode tree, JoinOperator op)
          throws SemanticException {
    List<TableRef> tblRefs = new ArrayList<TableRef>();
    Expr onClause = null;

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_JOIN:
        case HiveParser.TOK_LEFTOUTERJOIN:
        case HiveParser.TOK_RIGHTOUTERJOIN:
        case HiveParser.TOK_FULLOUTERJOIN:
        case HiveParser.TOK_CROSSJOIN:
          tblRefs.addAll(buildJoinStmt(child,
                  ParseUtils.JOIN_OPERATOR_MAP.get(child.getType())));
          continue;
        case HiveParser.TOK_TABREF:
          tblRefs.add(buildBaseTableRef(child, op));
          continue;
        case HiveParser.TOK_SUBQUERY:
          tblRefs.add(buildInlineViewRef(child, op));
          continue;
          // Hive only supports equal condition
        case HiveLexer.EQUAL:
          onClause = buildSingleOnClause(child);
          continue;
        case HiveLexer.KW_AND:
        case HiveLexer.KW_OR:
          onClause = buildCompoundOnClause(child, ParseUtils.COMPOUND_OPERATOR_MAP
                  .get(child.getType()));
          continue;
        default:
          throw new SemanticException("Unsupported join element!");
      }
    }

    int size = tblRefs.size();

    if (size < 2) {
      throw new SemanticException("Only one table in a join clause!");
    }

    tblRefs.get(size - 1).setJoinOp(op);
    tblRefs.get(size - 1).setOnClause(onClause);
    tblRefs.get(size - 1).setLeftTblRef(tblRefs.get(size - 2));

    return tblRefs;
  }

  /**
   * Construct a base table reference.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private TableRef buildBaseTableRef(ASTNode tree, JoinOperator op)
          throws SemanticException {
    String tblName = "";
    String alias = "";

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_TABNAME:
          tblName = child.getChild(0).getText();
          continue;
        case HiveLexer.Identifier:
          alias = child.getText();
          continue;
        default:
          throw new SemanticException("Unsupported basetable element!");
      }
    }

    BaseTableRef baseTbl = new BaseTableRef(tblName, alias);
    baseTbl.setJoinOp(op);

    return baseTbl;
  }

  /**
   * Construct a subquery statement.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private TableRef buildInlineViewRef(ASTNode tree, JoinOperator op) throws SemanticException {
    InLineViewRef inlineView = new InLineViewRef();

    for (int i = 0; i < tree.getChildCount(); i++) {
      ASTNode child = (ASTNode) tree.getChild(i);
      switch (child.getType()) {
        case HiveParser.TOK_QUERY:
          inlineView.setQueryStmt(buildQueryStmt(child));
          continue;
        case HiveLexer.Identifier:
          inlineView.setAlias(child.getText());
          continue;
        default:
          throw new SemanticException("Unsupported inlineview element!");
      }
    }

    inlineView.setJoinOp(op);

    return inlineView;
  }

  /**
   * Construct a join condition clause. Currently, only equal condition is
   * supported.
   *
   * @param tree
   * @return
   * @throws SemanticException
   */
  private Expr buildSingleOnClause(ASTNode tree) throws SemanticException {
    Expr onClause = buildNormalBinPredicate(tree, BinOperator.EQ);

    return onClause;
  }

  private Expr buildCompoundOnClause(ASTNode tree, CompoundOperator op) throws
          SemanticException {
    Expr onClause = buildCompoundPredicate(tree, op);

    return onClause;
  }

  /**
   * Construct a number literal.
   *
   * @param tree
   * @return
   */
  private LiteralExpr buildNumLiteral(ASTNode tree) {
    LiteralExpr expr = null;
    String text = tree.getText();

    if (text.contains("."))
      expr = new FloatLiteral(text);
    else
      expr = new IntLiteral(text);

    return expr;
  }
}
