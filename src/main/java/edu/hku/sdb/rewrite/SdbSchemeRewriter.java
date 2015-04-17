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
 *******************************************************************************/

package edu.hku.sdb.rewrite;

import static com.google.common.base.Preconditions.checkNotNull;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SdbSchemeRewriter extends AbstractRewriter {

  private static final Logger LOG = LoggerFactory
      .getLogger(SdbSchemeRewriter.class);


  BigInteger p;
  BigInteger q;
  BigInteger n;
  BigInteger g;
  BigInteger totient;

  /**
   * @param dbMeta
   */
  public SdbSchemeRewriter(DBMeta dbMeta) {
    super(dbMeta);
    // TODO Auto-generated constructor stub
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewrite(edu.hku.sdb.parse.ParseNode)
   */
  @Override
  public void rewrite(ParseNode parseTree) throws UnSupportedException {
    rewriteInternal(parseTree);
  }

  /**
   * 
   * @see edu.hku.sdb.rewrite.AbstractRewriter#rewriteSelStmt(edu.hku.sdb.parse.
   *      SelectStmt)
   */
  @Override
  protected void rewriteSelStmt(SelectStmt selStmt) throws UnSupportedException {

    /***********************************************************************
     * The rewrite steps are: 1. Rewrite sub-queries if any, also propagate the
     * key updates to all fields in the outer query that refer to selection
     * items in the sub queries.
     * 
     * 2. Check if there are join in the from clause. If yes, do key update for
     * all fields in selection list and where clause if necessary. Also
     * propagate the key update to the group by fields.
     * 
     * 3. Do rewrite for all selection items and exprs in where clause. The key
     * update will propagate to the outer query if it is a sub query.
     * 
     * 4. Do rewrite for all group by exprs.
     * 
     * 5. Not support having clause, orderby clause at this moment.
     * 
     **********************************************************************/

    p = new BigInteger(dbMeta.getP());
    q = new BigInteger(dbMeta.getQ());
    n = new BigInteger(dbMeta.getN());
    g = new BigInteger(dbMeta.getG());
    totient = Crypto.evaluateTotient(p, q);

    rewriteTableRefs(selStmt.getTableRefs(), selStmt.getSelectList(),
        selStmt.getWhereClause(), selStmt.getGroupingExprs());
    selStmt.setWhereClause(rewriteWhereClause(selStmt.getWhereClause()));
    rewriteGroupByExprs(selStmt.getGroupingExprs(), selStmt.getTableRefs());

    rewriteSelList(selStmt.getSelectList());
    rewriteHavingExpr(selStmt.getHavingExpr());
  }

  @Override
  protected void rewriteCreateStmt(CreateStmt createStmt) throws UnSupportedException {

    p = new BigInteger(dbMeta.getP());
    q = new BigInteger(dbMeta.getQ());
    n = new BigInteger(dbMeta.getN());
    g = new BigInteger(dbMeta.getG());

    rewriteCreateFieldLists(createStmt.getFieldList());
    rewriteCreateRowFormat(createStmt);
  }

  private void rewriteCreateRowFormat(CreateStmt createStmt) {
    TableRowFormat tableRowFormat = createStmt.getTableRowFormat();
    //TODO get default separator ";" from config file
    if (tableRowFormat == null){
      tableRowFormat = new TableRowFormat();
      tableRowFormat.setRowFieldFormat(";");
      createStmt.setTableRowFormat(tableRowFormat);
    }
  }

  private void rewriteCreateFieldLists(List<BasicFieldLiteral> fieldList) {
    TableName tableName = fieldList.get(0).getTableName();

    for (BasicFieldLiteral basicFieldLiteral : fieldList){
      if (basicFieldLiteral.isSen()){
        int index = fieldList.indexOf(basicFieldLiteral);
        BasicFieldLiteral sensitiveField = buildSensitiveCreateField(basicFieldLiteral.getName(), tableName, p, q);
        fieldList.set(index, sensitiveField);
      }
    }

    BasicFieldLiteral rowIdField = buildSensitiveCreateField(BasicFieldLiteral.ROW_ID_COLUMN_NAME, tableName, p, q);
    fieldList.add(rowIdField);

    BasicFieldLiteral sField = buildSensitiveCreateField(BasicFieldLiteral.S_COLUMN_NAME, tableName, p, q);
    fieldList.add(sField);

    BasicFieldLiteral rField = buildSensitiveCreateField(BasicFieldLiteral.R_COLUMN_NAME, tableName, p, q);
    fieldList.add(rField);
  }

  private BasicFieldLiteral buildSensitiveCreateField(String fieldName, TableName tableName, BigInteger p, BigInteger q) {
    ColumnType type = new ColumnType(DataType.VARCHAR);
    type.setLength(Crypto.defaultRandLength);
    BigInteger m = Crypto.generatePositiveRand(p, q);
    BigInteger x = Crypto.generatePositiveRand(p, q);
    ColumnKey columnKey = new ColumnKey(m, x);
    BasicFieldLiteral fieldLiteral = new BasicFieldLiteral(fieldName, type, tableName, true, columnKey);
    return fieldLiteral;
  }

  protected void rewriteSelList(SelectionList selList)
      throws UnSupportedException {

    if (selList.involveSdbEncrytedCol()) {

      for (SelectionItem selItem : selList.getItemList()){
        Expr expr = selItem.getExpr();
        if (expr instanceof NormalArithmeticExpr) {
          if (expr.involveSdbEncrytedCol()){
            selItem.setAlias(expr.toSql());
            selItem.setExpr(rewriteNorArithExpr((NormalArithmeticExpr) expr));
          }
        }
      }
    }
  }

  protected void rewriteTableRefs(List<TableRef> tblRefs,
      SelectionList selList, Expr whereClause, List<Expr> groupExprs)
      throws UnSupportedException {

    List<BaseTableRef> baseRefs = new ArrayList<BaseTableRef>();
    List<InLineViewRef> inlineviews = new ArrayList<InLineViewRef>();
    
    for (TableRef tblRef : tblRefs) {
      if (tblRef instanceof BaseTableRef) {
        baseRefs.add((BaseTableRef) tblRef);
      } else if (tblRef instanceof InLineViewRef) {
        inlineviews.add((InLineViewRef) tblRef);
      }
    }
    
    // Rewrite inlineview first.
    for (InLineViewRef view : inlineviews) {
      rewriteInLineViewRef(view);
    }
    
    // Rewrite base table.
    for (BaseTableRef baseTbl : baseRefs) {
      rewriteBaseTblRef(baseTbl);
    }

    //Insert row-id field at the end of selectionItem list
    if (baseRefs.size() == 1){
      if (selList.involveSdbEncrytedCol()){
        String tableName = baseRefs.get(0).getTableName();
        SelectionItem selectionItem = new SelectionItem();
        ColumnKey rowIdColumnKey = getTableColumnKey(tableName, BasicFieldLiteral.ROW_ID_COLUMN_NAME);
        Expr expr = new FieldLiteral(tableName, BasicFieldLiteral.ROW_ID_COLUMN_NAME, DataType.INT, true, rowIdColumnKey);
        selectionItem.setExpr(expr);
        selList.getItemList().add(selectionItem);
      }
    }
    else {
      //TODO in case of join, propagate keyUpdate to selList and whereClause
      UnSupportedException e = new UnSupportedException(
              "unsupported query when rewriting tableRefs(Join)!");
      LOG.error("There is unsupported expression!", e);
      throw e;
    }

  }

  protected void rewriteBaseTblRef(BaseTableRef tblRef)
      throws UnSupportedException {
    Expr onClause = tblRef.getOnClause();

    // rewrite the join clause if any
    if (onClause != null) {
      if (onClause instanceof NormalBinPredicate) {
        tblRef
            .setOnClause(rewriteNorBinPredicate((NormalBinPredicate) onClause));
      }
    }
  }

  protected void rewriteInLineViewRef(InLineViewRef inlineView)
      throws UnSupportedException {
    if (inlineView.involveSdbEncrytedCol()) {
      rewriteSelStmt((SelectStmt) inlineView.getQueryStmt());
      Expr onClause = inlineView.getOnClause();
      
      // rewrite the join clause is any
      if (onClause != null) {
        if (onClause instanceof NormalBinPredicate) {
          inlineView
              .setOnClause(rewriteNorBinPredicate((NormalBinPredicate) onClause));
        }
      }
    }
  }

  protected Expr rewriteWhereClause(Expr whereClause)
      throws UnSupportedException {
    if (whereClause instanceof NormalBinPredicate){
      LOG.debug("rewrite NormalBinPredicate during rewriteWhereClause");
      return rewriteNorBinPredicate((NormalBinPredicate) whereClause);
    }
    else return null;
  }

  protected void rewriteGroupByExprs(List<Expr> groupExprs,
      List<TableRef> tblRefs) throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  protected void rewriteHavingExpr(Expr havingExpr) throws UnSupportedException {
    // TODO Auto-generated method stub
  }

  //TODO method not tested yet
  protected Expr rewriteNorArithExpr(NormalArithmeticExpr arithExpr)
      throws UnSupportedException {

    Expr left = arithExpr.getChild(0);
    Expr right = arithExpr.getChild(1);

    // TODO support nested arithmetic expression.
    if (checkNotNull(left).hasChild(1) || checkNotNull(right).hasChild(1)) {
      UnSupportedException e = new UnSupportedException(
          "nested arithmetic expression!");
      LOG.error("There is unsupported expression!", e);
      throw e;
    }

    // EE mode
    if (left.involveSdbEncrytedCol() && right.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
      //SDB_MUL EE Mode
      case MULTIPLY: {
        return rewriteMultiEE(arithExpr);
      }
      //SDB_ADD EE Mode
      case ADD:{
        return rewriteAddEE(arithExpr);
      }
      case SUBTRACT:
      {
        return rewriteSubtractEE((FieldLiteral) left, (FieldLiteral) right);
      }
      default:
        break;
      }
    }

    // EC mode or EP mode
    else if (left.involveSdbEncrytedCol() || right.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
        case MULTIPLY:
          //EC mode
          if (left instanceof IntLiteral || right instanceof IntLiteral) {
            FieldLiteral fieldLiteral = (FieldLiteral) (left instanceof FieldLiteral ? left : right);
            Integer u = (left instanceof IntLiteral ? ((IntLiteral) left).getValue() : ((IntLiteral) right).getValue());
            BigInteger m = fieldLiteral.getColKey().getM();
            ColumnKey columnKey = new ColumnKey(m.multiply(new BigInteger(String.valueOf(u))), fieldLiteral.getColKey().getX());
            fieldLiteral.setColKey(columnKey);
            return fieldLiteral;
          }
          //EP mode
          else {
            //TODO: EP mode to be implemented
            UnSupportedException e = new UnSupportedException(
                    "EP mode in normal arithmetic expression!");
            LOG.error("There is unsupported expression!", e);
            throw e;
          }
        case SUBTRACT:
          //EC mode
          if (left instanceof IntLiteral || right instanceof IntLiteral) {
            return rewriteSubtractEC((FieldLiteral) left, (IntLiteral) right);
          }
          //EP mode
          else {
            return rewriteSubtractEP((FieldLiteral) left, (FieldLiteral) right);
          }
      }
    }

    return null;
  }

  private SdbArithmeticExpr rewriteSubtractEE(FieldLiteral left, FieldLiteral right) {

    boolean isSen = true;
    String tableName = left.getTbl();
    String columnName = BasicFieldLiteral.S_COLUMN_NAME;
    ColumnKey columnKeyS = getTableColumnKey(tableName, columnName);

    DataType type = DataType.INT;
    FieldLiteral sField = new FieldLiteral(tableName, columnName, type, isSen, columnKeyS);

    BigInteger ma = left.getColKey().getM();
    BigInteger xa = left.getColKey().getX();

    BigInteger mb = right.getColKey().getM();
    BigInteger xb = right.getColKey().getX();

    BigInteger ms = columnKeyS.getM();
    BigInteger xs = columnKeyS.getX();

    BigInteger mb_i = n.subtract(BigInteger.ONE).multiply(mb).mod(n);
    BigInteger xb_i = xb;

    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);

    BigInteger[] pqa_c = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pa_c = pqa_c[0];
    BigInteger qa_c = pqa_c[1];

    BigInteger[] pqb_i_c = Crypto.keyUpdateClient(mb_i, mc, ms, xb_i, xc, xs, p, q);
    BigInteger pb_i_c = pqb_i_c[0];
    BigInteger qb_i_c = pqb_i_c[1];

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr();
    sdbArithmeticExpr.setOp(SdbArithmeticExpr.Operator.SDB_ADD);

    //Ae, Be, Se, pa_c,qa_c, pb_i_c, qb_i_c, n
    sdbArithmeticExpr.addChild(left);
    sdbArithmeticExpr.addChild(right);
    sdbArithmeticExpr.addChild(sField);
    sdbArithmeticExpr.addChild(new SecureIntLiteral(pa_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(qa_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(pb_i_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(qb_i_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(n));
    sdbArithmeticExpr.setColumnKey(new ColumnKey(mc, xc));
    return sdbArithmeticExpr;
  }

  private Expr rewriteSubtractEC(FieldLiteral left, IntLiteral right) {
    FieldLiteral leftField = left;
    IntLiteral rightInt = right;

    boolean isSen = true;
    String tableName = leftField.getTbl();
    String columnName = BasicFieldLiteral.S_COLUMN_NAME;
    ColumnKey columnKeyS = getTableColumnKey(tableName, columnName);

    DataType type = DataType.INT;
    FieldLiteral sField = new FieldLiteral(tableName, columnName, type, isSen, columnKeyS);

    BigInteger ma = leftField.getColKey().getM();
    BigInteger xa = leftField.getColKey().getX();

    BigInteger ms = columnKeyS.getM();
    BigInteger xs = columnKeyS.getX();

    BigInteger msu = ms.multiply(new BigInteger(String.valueOf(rightInt.getValue()))).mod(n);
    BigInteger xsu = xs;

    BigInteger msu_i = n.subtract(BigInteger.ONE).multiply(msu).mod(n);
    BigInteger xsu_i = xsu;

    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p ,q);

    BigInteger[] pqa_c = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pa_c = pqa_c[0];
    BigInteger qa_c = pqa_c[1];

    BigInteger[] pqsu_i_c = Crypto.keyUpdateClient(msu_i, mc, ms, xsu_i, xc, xs, p, q);
    BigInteger psu_i_c = pqsu_i_c[0];
    BigInteger qsu_i_c = pqsu_i_c[1];


    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr();
    sdbArithmeticExpr.setOp(SdbArithmeticExpr.Operator.SDB_ADD);

    //Ae, Se, Se, pa_c,qa_c, psu_i_c, qsu_i_c, n
    sdbArithmeticExpr.addChild(leftField);
    sdbArithmeticExpr.addChild(sField);
    sdbArithmeticExpr.addChild(sField);
    sdbArithmeticExpr.addChild(new SecureIntLiteral(pa_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(qa_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(psu_i_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(qsu_i_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(n));
    sdbArithmeticExpr.setColumnKey(new ColumnKey(mc, xc));

    return sdbArithmeticExpr;
  }

  //TODO this function is not working
  private Expr rewriteSubtractEP(FieldLiteral left, FieldLiteral right) {
    String tableName =  left.getTbl();
    String columnName = BasicFieldLiteral.S_COLUMN_NAME;
    ColumnKey columnKeyS = getTableColumnKey(tableName, columnName);
    DataType type = DataType.INT;
    FieldLiteral sField = new FieldLiteral(tableName, columnName, type, true, columnKeyS);

    BigInteger ma = left.getColKey().getM();
    BigInteger xa = left.getColKey().getX();

    BigInteger mp_n = Crypto.generatePositiveRand(p, q);
    BigInteger xp_n = Crypto.generatePositiveRand(p, q);

    BigInteger ms = columnKeyS.getM();
    BigInteger xs = columnKeyS.getX();
    BigInteger[] pqp_n = Crypto.keyUpdateClient(new BigInteger("1"), mp_n, ms, new BigInteger("0"), xp_n, xs, p, q);

    BigInteger mpn_i = n.subtract(BigInteger.ONE).multiply(mp_n).mod(n);
    BigInteger xpn_i = xp_n;

    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p ,q);

    BigInteger[] pqa_c = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
    BigInteger pa_c = pqa_c[0];
    BigInteger qa_c = pqa_c[1];

    BigInteger[] pqn_i_c = Crypto.keyUpdateClient(mpn_i, mc, ms, xpn_i, xc, xs, p, q);
    BigInteger ppn_i_c = pqn_i_c[0];
    BigInteger qpn_i_c = pqn_i_c[1];

    SecureIntLiteral literalN = new SecureIntLiteral(n);
    SdbKeyUpdateExpr sdbKeyUpExpr = new SdbKeyUpdateExpr();
    sdbKeyUpExpr.addChild(right);
    sdbKeyUpExpr.addChild(sField);
    sdbKeyUpExpr.addChild(new SecureIntLiteral(pqp_n[0]));
    sdbKeyUpExpr.addChild(new SecureIntLiteral(pqp_n[1]));
    sdbKeyUpExpr.addChild(literalN);

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr();
    sdbArithmeticExpr.setOp(SdbArithmeticExpr.Operator.SDB_ADD);
    sdbArithmeticExpr.addChild(left);
    sdbArithmeticExpr.addChild(sdbKeyUpExpr);
    sdbArithmeticExpr.addChild(sField);
    sdbArithmeticExpr.addChild(new SecureIntLiteral(pa_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(qa_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(ppn_i_c));
    sdbArithmeticExpr.addChild(new SecureIntLiteral(qpn_i_c));
    sdbArithmeticExpr.addChild(literalN);
    sdbArithmeticExpr.setColumnKey(new ColumnKey(mc, xc));

    return sdbArithmeticExpr;
  }

  private ColumnKey sdbMultiGetColumnKeyEE(FieldLiteral left, FieldLiteral right) {
    ColumnKey columnKey;
    ColumnKey leftColumnKey =  left.getColKey();
    ColumnKey rightColumnKey = right.getColKey();
    BigInteger m = leftColumnKey.getM().multiply(rightColumnKey.getM()).mod(n);
    BigInteger x = leftColumnKey.getX().add(rightColumnKey.getX()).mod(Crypto.evaluateTotient(p, q));
    columnKey = new ColumnKey(m,x);
    return columnKey;
  }

  protected Expr rewriteNorBinPredicate(NormalBinPredicate binPred)
      throws UnSupportedException {
    // No SDB encrypted column.
    if (!binPred.involveSdbEncrytedCol())
      return binPred;

    Expr left = binPred.getChild(0);
    Expr right = binPred.getChild(1);

//    TODO support nested binary predicate.
    if (checkNotNull(left).hasChild(1) || checkNotNull(right).hasChild(1)) {
      UnSupportedException e = new UnSupportedException(
          "nested binary predicate!");
      LOG.error("There is unsupported expression!", e);
      throw e;
    }

    SdbArithmeticExpr sdbArithExpr = new SdbArithmeticExpr();
    SdbKeyUpdateExpr sdbKeyUpExpr = new SdbKeyUpdateExpr();

    Expr addExpr = null;
    String tableName = null;

    //EP mode
    if (left.involveSdbEncrytedCol() && !right.involveSdbEncrytedCol() && (right instanceof FieldLiteral)) {
      LOG.debug("rewriteNorBinPredicate EP Mode");
      FieldLiteral leftField = (FieldLiteral) left;
      tableName = ((FieldLiteral) left).getTbl();
      addExpr = rewriteSubtractEP(leftField, (FieldLiteral) right);
    }
    // EE mode
    else if (left.involveSdbEncrytedCol() && right.involveSdbEncrytedCol()) {
      LOG.debug("rewriteNorBinPredicate EC Mode");
      FieldLiteral leftField = (FieldLiteral) left;
      FieldLiteral rightField = (FieldLiteral) right;
      tableName = ((FieldLiteral) left).getTbl();
      addExpr = rewriteSubtractEE(leftField, rightField);
    }
    // EC mode
    else if (left.involveSdbEncrytedCol() || right.involveSdbEncrytedCol()) {
      LOG.debug("rewriteNorBinPredicate EC Mode");
      FieldLiteral leftField = (FieldLiteral) left;
      IntLiteral rightInt = (IntLiteral) right;
      tableName = ((FieldLiteral) left).getTbl();
      addExpr = rewriteSubtractEC(leftField, rightInt);
    }

    //prepare udf
    prepareUdf(sdbArithExpr, sdbKeyUpExpr, addExpr, tableName);

    SdbBinPredicate sdbBinPred = new SdbBinPredicate(binPred.getOp(),
        sdbArithExpr, sdbKeyUpExpr);
    sdbBinPred.setThreshold(n.subtract(BigInteger.ONE).divide(new BigInteger("2")));

    return sdbBinPred;
  }

  private void prepareUdf(SdbArithmeticExpr sdbArithExpr, SdbKeyUpdateExpr sdbKeyUpExpr, Expr addExpr, String tableName) {
    ColumnKey columnKeyC = addExpr.getColKey();
    BigInteger mc = columnKeyC.getM();
    BigInteger xc = columnKeyC.getX();

    ColumnKey columnKeyR = getTableColumnKey(tableName, BasicFieldLiteral.R_COLUMN_NAME);
    BigInteger mr = columnKeyR.getM();
    BigInteger xr = columnKeyR.getX();

    BigInteger mrc = mr.multiply(mc).mod(n);
    BigInteger xrc = xr.add(xc).mod(Crypto.evaluateTotient(p, q));

    ColumnKey columnKeyS = getTableColumnKey(tableName, BasicFieldLiteral.S_COLUMN_NAME);
    BigInteger ms = columnKeyS.getM();
    BigInteger xs = columnKeyS.getX();
    SecureIntLiteral literalN = new SecureIntLiteral(n);

    BigInteger[] pqrc_z = Crypto.keyUpdateClient(mrc, new BigInteger("1"), ms, xrc, new BigInteger("0"), xs, p, q);

    FieldLiteral rField = new FieldLiteral(tableName, BasicFieldLiteral.R_COLUMN_NAME, DataType.INT);
    sdbArithExpr.setOp(SdbArithmeticExpr.Operator.SDB_MUL);
    sdbArithExpr.addChild(rField);
    sdbArithExpr.addChild(addExpr);
    sdbArithExpr.addChild(literalN);

    FieldLiteral sField = new FieldLiteral(tableName, BasicFieldLiteral.S_COLUMN_NAME, DataType.INT);

    sdbKeyUpExpr.addChild(sdbArithExpr);
    sdbKeyUpExpr.addChild(sField);
    sdbKeyUpExpr.addChild(new SecureIntLiteral(pqrc_z[0]));
    sdbKeyUpExpr.addChild(new SecureIntLiteral(pqrc_z[1]));
    sdbKeyUpExpr.addChild(literalN);
  }

  private ParseNode rewriteAddEE(ParseNode parseTree) {
    return null;
  }

  private ParseNode rewriteAddEC(ParseNode parseTree) {
    return null;
  }

  private ParseNode rewriteEquiJoinEE(ParseNode parseTree) {
    return null;
  }

  private Expr rewriteMultiEE(NormalArithmeticExpr arithExpr){
    Expr left = arithExpr.getChild(0);
    Expr right = arithExpr.getChild(1);

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr();
    //set operator to sdb_mul
    sdbArithmeticExpr.setOp(SdbArithmeticExpr.Operator.SDB_MUL);

    //Key update for sdb_mul
    ColumnKey columnKey = null;
    if (left instanceof FieldLiteral && right instanceof FieldLiteral) {
      columnKey = sdbMultiGetColumnKeyEE((FieldLiteral) left, (FieldLiteral) right);
    }

    //set parameter for sdb_mul
    SecureIntLiteral literalN = new SecureIntLiteral(n);
    sdbArithmeticExpr.addChild(left);
    sdbArithmeticExpr.addChild(right);
    sdbArithmeticExpr.addChild(literalN);
    sdbArithmeticExpr.setColumnKey(columnKey);
    return sdbArithmeticExpr;
  }

  private Expr rewriteAddEE(NormalArithmeticExpr arithExpr) throws UnSupportedException {
    Expr left = arithExpr.getChild(0);
    Expr right = arithExpr.getChild(1);

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr();
    //set operator to sdb_add
    sdbArithmeticExpr.setOp(SdbArithmeticExpr.Operator.SDB_ADD);
    //generate a new column key for c
    BigInteger mc = Crypto.generatePositiveRand(p, q);
    BigInteger xc = Crypto.generatePositiveRand(p, q);
    ColumnKey columnKeyC = new ColumnKey(mc, xc);

    if (left instanceof FieldLiteral && right instanceof FieldLiteral){
      BigInteger ma = ((FieldLiteral) left).getColKey().getM();
      BigInteger xa = ((FieldLiteral) left).getColKey().getX();
      BigInteger mb = ((FieldLiteral) right).getColKey().getM();
      BigInteger xb = ((FieldLiteral) right).getColKey().getX();
      ColumnKey columnKeyS = getTableColumnKey(((FieldLiteral) right).getTbl(), BasicFieldLiteral.S_COLUMN_NAME);
      BigInteger xs = columnKeyS.getX();
      BigInteger ms = columnKeyS.getM();

      //execute key update client protocol
      BigInteger pq_a[] = Crypto.keyUpdateClient(ma, mc, ms, xa, xc, xs, p, q);
      BigInteger pq_b[] = Crypto.keyUpdateClient(mb, mc, ms, xb, xc, xs, p, q);

      //prepare parameter for sdb_add
      Expr sField = new FieldLiteral(((FieldLiteral) left).getTbl(), BasicFieldLiteral.S_COLUMN_NAME, DataType.INT, true, columnKeyS);
      SecureIntLiteral p_a = new SecureIntLiteral(pq_a[0]);
      SecureIntLiteral q_a = new SecureIntLiteral(pq_a[1]);
      SecureIntLiteral p_b = new SecureIntLiteral(pq_b[0]);
      SecureIntLiteral q_b = new SecureIntLiteral(pq_b[1]);

      //set parameter for sdb_add(ae,be,se,pa,qa,pb,qb,n);
      sdbArithmeticExpr.addChild(left);
      sdbArithmeticExpr.addChild(right);
      sdbArithmeticExpr.addChild(sField);
      sdbArithmeticExpr.addChild(p_a);
      sdbArithmeticExpr.addChild(q_a);
      sdbArithmeticExpr.addChild(p_b);
      sdbArithmeticExpr.addChild(q_b);
      sdbArithmeticExpr.addChild(new SecureIntLiteral(n));
      sdbArithmeticExpr.setColumnKey(columnKeyC);
      return sdbArithmeticExpr;
    }
    UnSupportedException e = new UnSupportedException(
            "unsupported query when rewriting add EE!");
    LOG.error("There is unsupported expression!", e);
    throw e;
  }

  private ColumnKey getTableColumnKey(String tableName, String columnName) {
    ColumnKey columnKey = null;
    for (TableMeta tableMeta : dbMeta.getTbls()){
      if (tableMeta.getTblName().equals(tableName)){
        for (ColumnMeta columnMeta: tableMeta.getCols()){
          if (columnMeta.getColName().equals(columnName)){
            BigInteger m = columnMeta.getColkey().getM();
            BigInteger x = columnMeta.getColkey().getX();
            columnKey = new ColumnKey(m, x);
            break;
          }
        }
      }
    }
    return columnKey;
  }

}
