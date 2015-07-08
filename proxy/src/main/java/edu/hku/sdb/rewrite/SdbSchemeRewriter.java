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

package edu.hku.sdb.rewrite;

import java.math.BigInteger;
import java.util.*;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.parse.SdbTransformExpr.SdbOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The rewrite class performs all query rewriting based on SDB's encryption scheme.
 */
public class SdbSchemeRewriter extends AbstractRewriter {

  public enum SecurityLevel {
    HIGH, MEDIUM
  }

  private SecurityLevel securityLevel = SecurityLevel.MEDIUM;

  private static final Logger LOG = LoggerFactory
          .getLogger(SdbSchemeRewriter.class);

  BigInteger prime1;
  BigInteger prime2;
  BigInteger n;
  BigInteger g;
  BigInteger totient;

  // TODO: we assume tables and inlineView have unique names.
  private Map<String, ColumnKey> colKeyMap = new HashMap<>();

  /**
   * @param dbMeta
   */
  public SdbSchemeRewriter(DBMeta dbMeta) {
    super(dbMeta);

    prime1 = new BigInteger(dbMeta.getPrime1());
    prime2 = new BigInteger(dbMeta.getPrime2());
    n = new BigInteger(dbMeta.getN());
    g = new BigInteger(dbMeta.getG());
    totient = Crypto.evaluateTotient(prime1, prime2);
  }

  @Override
  public void rewrite(ParseNode parseTree) throws RewriteException {
    rewriteInternal(parseTree);
  }


  @Override
  protected void rewriteSelStmt(SelectStmt selStmt) throws
          RewriteException {

    /********************************************************************************
     * The rewrite steps are: 1. Rewrite sub-queries if any, also propagate the
     * key updates to all fields in the outer query that refers to selection
     * items in the sub queries.
     *
     * 2. Check if there are joins in the from clause. If yes, do key update for
     * all fields in selection list and where clause if necessary.
     *
     * 3. Do rewrite for all selection items. The key
     * update will propagate to the outer query if it is a sub query and the group
     * by fields.
     *
     * 4. Do rewrite for where clause. If a filtering predicate contains columns from
     * different tables, and at least one of them is sensitive, then we need to
     * pull it out from the where clause. Further more, we need to make the current
     * query to be a sub-query.
     *
     * 5. Do rewrite for all group by exprs.
     *
     * 6. Not support having clause, orderby clause at this moment.
     *
     *******************************************************************************/

    // Rewrite sub-query and join clause first, and also propagate the keyUpdate
    // to the selection items and fields in where predicates.
    rewriteTableRefs(selStmt.getTableRefs(), selStmt.getSelectList(),
            selStmt.getWhereClause());

    // Rewrite the where predicates.


    selStmt.setWhereClause(rewriteWhereClause(selStmt.getWhereClause()));

    // Rewrite the selection items.
    rewriteSelList(selStmt.getSelectList());

    // Rewrite the group by clause.
    rewriteGroupByExprs(selStmt.getGroupingExprs());
  }

  /**
   * Detect if a rewrite depends on the join result.
   *
   * @return
   */
  protected boolean needJoinFirst(Expr expr) {
    boolean needJoinFirst = false;

    if (expr instanceof NormalBinPredicate) {

    }

    return needJoinFirst;
  }

  @Override
  protected void rewriteCreateStmt(CreateStmt createStmt) throws
          RewriteException {
    rewriteCreateFieldLists(createStmt.getFieldList());
    rewriteCreateRowFormat(createStmt);
  }

  private void rewriteCreateRowFormat(CreateStmt createStmt) {
    TableRowFormat tableRowFormat = createStmt.getTableRowFormat();
    //TODO get default separator ";" from config file
    if (tableRowFormat == null) {
      tableRowFormat = new TableRowFormat();
      tableRowFormat.setRowFieldFormat(";");
      createStmt.setTableRowFormat(tableRowFormat);
    }
  }

  private void rewriteCreateFieldLists(List<BasicFieldLiteral> fieldList) {
    TableName tableName = fieldList.get(0).getTableName();

    for (BasicFieldLiteral basicFieldLiteral : fieldList) {
      if (basicFieldLiteral.isSen()) {
        int index = fieldList.indexOf(basicFieldLiteral);
        BasicFieldLiteral sensitiveField = buildSensitiveCreateField
                (basicFieldLiteral.getName(), tableName, prime1, prime2);
        fieldList.set(index, sensitiveField);
      }
    }

    BasicFieldLiteral rowIdField = buildSensitiveCreateField
            (BasicFieldLiteral.ROW_ID_COLUMN_NAME, tableName, prime1, prime2);
    fieldList.add(rowIdField);

    BasicFieldLiteral rField = buildSensitiveCreateField(BasicFieldLiteral
            .R_COLUMN_NAME, tableName, prime1, prime2);
    fieldList.add(rField);

    BasicFieldLiteral sField = buildSensitiveCreateField(BasicFieldLiteral
            .S_COLUMN_NAME, tableName, prime1, prime2);
    fieldList.add(sField);
  }

  private BasicFieldLiteral buildSensitiveCreateField(String fieldName,
                                                      TableName tableName,
                                                      BigInteger p,
                                                      BigInteger q) {
    ColumnType type = new ColumnType(DataType.VARCHAR);
    type.setLength(Crypto.defaultRandLength);
    BigInteger m = Crypto.generatePositiveRand(p, q);
    BigInteger x = Crypto.generatePositiveRand(p, q);
    ColumnKey columnKey = new ColumnKey(m, x);
    BasicFieldLiteral fieldLiteral = new BasicFieldLiteral(fieldName, type,
            tableName, true, columnKey);
    return fieldLiteral;
  }

  protected void rewriteSelList(SelectionList selList)
          throws UnSupportedException {

    if (selList.involveSdbEncrytedCol()) {

      for (SelectionItem selItem : selList.getItemList()) {
        Expr expr = selItem.getExpr();
        if (expr instanceof NormalArithmeticExpr) {
          if (expr.involveSdbEncrytedCol()) {
            Set<String> tbls = findAllTbls(expr);
            assert(tbls != null);
            if(tbls.size()<1) {
              // No column involved in the where clause, no need to rewrite.
              continue;
            }
            else if(tbls.size() == 1) {

              String tblName = (String) tbls.toArray()[0];

              FieldLiteral S = new FieldLiteral(tblName, BasicFieldLiteral.S_COLUMN_NAME, DataType.INT, true, null);
              S.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.S_COLUMN_NAME));
              selItem.setExpr(rewriteNorArithExpr((NormalArithmeticExpr) expr, S));

            }
            else {
              UnSupportedException e = new UnSupportedException("Can not support " +
                      "selection item involves columns from different tables!");
              LOG.error("There is unsupported predicates!", e);
              throw e;
            }

          }
        }
      }
    }

    // Propagate the new Column keys to all its ascendants
    for (SelectionItem selItem : selList.getItemList()) {
      if (selItem.involveSdbEncrytedCol()) {
        selItem.getExpr().notifyAllFields();
      }
    }
  }

  /**
   * This is the most complex rewriting part, since all columns need to do keyUpdate
   * after two tables join together.
   *
   * @param tblRefs
   * @param selList
   * @param whereClause
   * @throws RewriteException
   */
  protected void rewriteTableRefs(List<TableRef> tblRefs,
                                  SelectionList selList, Expr whereClause)
          throws RewriteException {
    // First of all, initialize the auxiliary columns RowID, R, S of the selection
    // list, since we possibly need them for the later computation.
    // In the optimization phase, we will delete all those useless auxiliary columns.
    SelectionItem leftRowID = new SelectionItem();
    SelectionItem leftR = new SelectionItem();
    SelectionItem leftS = new SelectionItem();

    leftRowID.setAlias(BasicFieldLiteral.ROW_ID_COLUMN_NAME);
    leftR.setAlias(BasicFieldLiteral.R_COLUMN_NAME);
    leftS.setAlias(BasicFieldLiteral.S_COLUMN_NAME);

    // To record the set of table names we have visited.
    Set<String> visitedTbl = new HashSet<>();

    boolean isFirstOne = true;
    for (TableRef tblRef : tblRefs) {
      if (tblRef instanceof InLineViewRef) {
        // Perform rewrite for inline view first.
        rewriteInLineViewRef((InLineViewRef) tblRef);
      }
      // Do if it is the first table.
      if (isFirstOne) {
        if (tblRef instanceof BaseTableRef) {
          String tblName = tblRef.getTableName();
          ColumnKey rowIDColKey = getTableColumnKey(tblName, BasicFieldLiteral
                  .ROW_ID_COLUMN_NAME);

          FieldLiteral rowID = new FieldLiteral(tblName, BasicFieldLiteral
                  .ROW_ID_COLUMN_NAME, DataType.INT,
                  true, rowIDColKey);
          leftRowID.setExpr(rowID);

          ColumnKey rColKey = getTableColumnKey(tblName, BasicFieldLiteral
                  .R_COLUMN_NAME);
          FieldLiteral r = new FieldLiteral(tblName, BasicFieldLiteral
                  .R_COLUMN_NAME, DataType.INT,
                  true, rColKey);
          leftR.setExpr(r);

          ColumnKey sColKey = getTableColumnKey(tblName, BasicFieldLiteral
                  .S_COLUMN_NAME);
          FieldLiteral s = new FieldLiteral(tblName, BasicFieldLiteral
                  .S_COLUMN_NAME, DataType.INT,
                  true, sColKey);
          leftS.setExpr(s);

          visitedTbl.add(tblName);
        }
        // Is is an inline view.
        else {
          // The rewrite has been performed.
          SelectionList inLineSelList = ((SelectStmt) ((InLineViewRef) tblRef)
                  .getQueryStmt()).getSelectList();

          FieldLiteral inlineRowID = new FieldLiteral(tblRef.getAlias(),
                  BasicFieldLiteral.ROW_ID_COLUMN_NAME, DataType.INT);
          FieldLiteral inlineR = new FieldLiteral(tblRef.getAlias(),
                  BasicFieldLiteral.R_COLUMN_NAME, DataType.INT);
          FieldLiteral inlineS = new FieldLiteral(tblRef.getAlias(),
                  BasicFieldLiteral.S_COLUMN_NAME, DataType.INT);

          // Get column keys for rowID, R and S
          inlineRowID.setColKey(inLineSelList.getRowID().getExpr().getColKey());
          inlineR.setColKey(inLineSelList.getAuxiliaryR().getExpr().getColKey());
          inlineS.setColKey(inLineSelList.getAuxiliaryS().getExpr().getColKey());

          leftRowID = new SelectionItem(inlineRowID, BasicFieldLiteral
                  .ROW_ID_COLUMN_NAME);
          leftR = new SelectionItem(inlineR, BasicFieldLiteral.R_COLUMN_NAME);
          leftS = new SelectionItem(inlineS, BasicFieldLiteral.S_COLUMN_NAME);

          visitedTbl.add(tblRef.getAlias());
        }

        isFirstOne = false;
      }

      // It is a join table.
      else {
        boolean isInlineView = false;
        Expr onClause = tblRef.getOnClause();
        assert (onClause != null);
        SelectionItem rightRowID = new SelectionItem();
        SelectionItem rightS = new SelectionItem();

        if (tblRef instanceof BaseTableRef) {
          String tblName = tblRef.getTableName();

          ColumnKey rowIDColKey = getTableColumnKey(tblName, BasicFieldLiteral.ROW_ID_COLUMN_NAME);

          FieldLiteral rowID = new FieldLiteral(tblName, BasicFieldLiteral
                  .ROW_ID_COLUMN_NAME, DataType.INT,
                  true, rowIDColKey);
          rightRowID.setExpr(rowID);

          ColumnKey sColKey = getTableColumnKey(tblName, BasicFieldLiteral.S_COLUMN_NAME);

          FieldLiteral s = new FieldLiteral(tblName, BasicFieldLiteral
                  .S_COLUMN_NAME, DataType.INT,
                  true, sColKey);
          rightS.setExpr(s);

        }
        // It is an inline view.
        else {
          isInlineView = true;
          SelectionList inLineSelList = ((SelectStmt) ((InLineViewRef) tblRef)
                  .getQueryStmt()).getSelectList();

          FieldLiteral inlineRowID = new FieldLiteral(tblRef.getAlias(),
                  BasicFieldLiteral.ROW_ID_COLUMN_NAME, DataType.INT);
//          FieldLiteral inlineR = new FieldLiteral(tblRef.getAlias(),
//                  BasicFieldLiteral.R_COLUMN_NAME, DataType.INT);
          FieldLiteral inlineS = new FieldLiteral(tblRef.getAlias(),
                  BasicFieldLiteral.S_COLUMN_NAME, DataType.INT);

          // Get column keys for rowID, R and S
          inlineRowID.setColKey(inLineSelList.getRowID().getExpr().getColKey());
//          inlineR.setColKey(inLineSelList.getAuxiliaryR().getExpr().getColKey());
          inlineS.setColKey(inLineSelList.getAuxiliaryS().getExpr().getColKey());

          rightRowID = new SelectionItem(inlineRowID, BasicFieldLiteral
                  .ROW_ID_COLUMN_NAME);
          rightS = new SelectionItem(inlineS, BasicFieldLiteral.S_COLUMN_NAME);

        }

        // Property of Column Key <m, 0>: all values in the Column A has the same
        // item key m. That means if two values a1, a2 are equal, then their encrypted
        // value E(a1) and E(a2) are equal as well.
        BigInteger targetM = Crypto.generatePositiveRand(prime1, prime2);
        BigInteger targetX = BigInteger.ZERO;

        // Perform Key updates on the join columns
        rewriteJoinPred(onClause, leftS, rightS, targetM, targetX);

        // Update the auxiliary columns
        // The row id is homomorphic additive
        Expr newRowID = new SdbTransformExpr(SdbOperator.SDB_ADDROWID);
        newRowID.addChild(leftRowID.getExpr());
        newRowID.addChild(rightRowID.getExpr());

        Expr newR = buildCartesianExpr(leftR.getExpr(), leftS, rightS, visitedTbl);
        Expr newS = buildCartesianExpr(leftS.getExpr(), leftS, rightS, visitedTbl);

        leftRowID.setExpr(newRowID);
        leftR.setExpr(newR);
        leftS.setExpr(newS);

        // Do transform for all sensitive columns in the selection list
        for (SelectionItem selItem : selList.getItemList()) {
          if (selItem.involveSdbEncrytedCol()) {
            selItem.setExpr(buildCartesianExpr(selItem.getExpr(), leftS, rightS,
                    visitedTbl));
          }
        }

        if (isInlineView) {
          visitedTbl.add(tblRef.getAlias());
        } else {
          visitedTbl.add(tblRef.getTableName());
        }
      }
    }

    selList.setAuxiliaryR(leftR);
    selList.setAuxiliaryS(leftS);
    selList.setRowID(leftRowID);
  }


  protected void rewriteJoinPred(Expr predicate, SelectionItem leftS,
                                 SelectionItem rightS, BigInteger targetM,
                                 BigInteger targetX) throws
          RewriteException {
    if (predicate instanceof CompoundPredicate) {
      rewriteJoinPred(((CompoundPredicate) predicate).getLeftPred(), leftS,
              rightS, targetM, targetX);
      rewriteJoinPred(((CompoundPredicate) predicate).getRightPred(), leftS,
              rightS, targetM, targetX);
    } else if (predicate instanceof NormalBinPredicate) {
      rewriteNorBinJoinPred((NormalBinPredicate) predicate, leftS, rightS,
              targetM, targetX);
    }
  }

  protected void rewriteNorBinJoinPred(NormalBinPredicate normalBinPred,
                                       SelectionItem leftS, SelectionItem
                                               rightS, BigInteger targetM,
                                       BigInteger targetX) throws
          RewriteException {
    if (!normalBinPred.involveSdbEncrytedCol())
      return;

    if (normalBinPred.getOp() != BinaryPredicate.BinOperator.EQ) {
      UnSupportedException e = new UnSupportedException("Can not support condition" +
              " " + normalBinPred.getOp() + " in join clause!");
      LOG.error("There is unsupported join condition!", e);
      throw e;
    }

    Expr leftExpr = normalBinPred.getLeftExpr();
    Expr rightExpr = normalBinPred.getRightExpr();

    if (!(leftExpr instanceof FieldLiteral && rightExpr instanceof FieldLiteral)) {
      UnSupportedException e = new UnSupportedException("Can not support " +
              "non-column join attributes!");
      LOG.error("There is unsupported join condition!", e);
      throw e;
    }

    FieldLiteral leftField = (FieldLiteral) leftExpr;
    FieldLiteral rightField = (FieldLiteral) rightExpr;

    if (leftField.getType() != DataType.INT || rightField.getType() != DataType
            .INT) {
      UnSupportedException e = new UnSupportedException("Can not support " +
              "non-integer join attributes!");
      LOG.error("There is unsupported join condition!", e);
      throw e;
    }

    ColumnKey leftSColKey = leftS.getExpr().getColKey();

    // The auxiliary update values p, q for the left field
    BigInteger[] pqLeft = Crypto.keyUpdateClient(leftExpr.getColKey().getM(),
            targetM, leftSColKey.getM(), leftExpr.getColKey().getX(), targetX,
            leftSColKey.getX(), prime1, prime2);

    // The auxiliary update values p, q for the right field
    BigInteger[] pqRight = Crypto.keyUpdateClient(rightExpr.getColKey().getM(),
            targetM, rightS.getExpr().getColKey().getM(), rightExpr.getColKey()
                    .getX(), targetX,
            rightS.getExpr().getColKey().getX(), prime1, prime2);


    // The order must be:(field, auxiliaryS, p, q, n)
    Expr leftKeyUp = buildSdbKeyUpdateExpr(leftExpr, leftS.getExpr(), new
                    BigIntLiteral(pqLeft[0]),
            new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM, targetX);
    Expr rightKeyUp = buildSdbKeyUpdateExpr(rightExpr, rightS.getExpr(), new
                    BigIntLiteral(pqRight[0]),
            new BigIntLiteral(pqRight[1]), new BigIntLiteral(n), targetM, targetX);

    // Replace the original predicate
    normalBinPred.setLeftExpr(leftKeyUp);
    normalBinPred.setRightExpr(rightKeyUp);
  }


  protected Expr buildCartesianExpr(Expr expr, SelectionItem leftS, SelectionItem
          rightS, Set<String> visitedTbl) throws UnSupportedException {
    if (expr instanceof FieldLiteral) {
      if (expr.involveSdbEncrytedCol()) {
        FieldLiteral column = (FieldLiteral) expr;
        FieldLiteral rightSExpr = (FieldLiteral) rightS.getExpr();
        SdbCartesianExpr transformedCol = new SdbCartesianExpr();
        // This field is from the left side of the join
        if (visitedTbl.contains(column.getTbl())) {
          BigInteger ma = column.getColKey().getM();
          BigInteger xa = column.getColKey().getX();
          BigInteger ms = rightSExpr.getColKey().getM();
          BigInteger xs = rightSExpr.getColKey().getX();
          BigInteger auxiliaryP = Crypto.cartesianAuxiliaryP(xa, xs, totient);
          // Update the column key
          BigInteger[] colKey = Crypto.cartesianUpdateColyKey(ma, xa, ms,
                  auxiliaryP, n);

          transformedCol.addChild(column);
          transformedCol.addChild(rightSExpr);
          transformedCol.addChild(new BigIntLiteral(auxiliaryP));
          transformedCol.addChild(new BigIntLiteral(n));

          transformedCol.setAlia(column.getName());
          transformedCol.setColKey(new ColumnKey(colKey[0], colKey[1]));
          transformedCol.setReferredByList(column.getReferredByList());

          return transformedCol;
        }
        // This field is from the right side of the join
        else if (column.getTbl().equals(rightSExpr.getTbl())) {
          BigInteger ma = column.getColKey().getM();
          BigInteger xa = column.getColKey().getX();
          BigInteger ms = leftS.getExpr().getColKey().getM();
          BigInteger xs = leftS.getExpr().getColKey().getX();
          BigInteger auxiliaryP = Crypto.cartesianAuxiliaryP(xa, xs, totient);
          // Update the column key
          BigInteger[] colKey = Crypto.cartesianUpdateColyKey(ma, xa, ms,
                  auxiliaryP, n);

          transformedCol.addChild(column);
          transformedCol.addChild(leftS.getExpr());
          transformedCol.addChild(new BigIntLiteral(auxiliaryP));
          transformedCol.addChild(new BigIntLiteral(n));

          transformedCol.setAlia(column.getName());
          transformedCol.setColKey(new ColumnKey(colKey[0], colKey[1]));
          transformedCol.setReferredByList(column.getReferredByList());

          return transformedCol;
        } else
          return column;
      } else
        return expr;
    } else if (expr instanceof SdbCartesianExpr) {
      // It must be from the left side of the join and updated before
      SdbCartesianExpr cartesianExpr = (SdbCartesianExpr) expr;
      SdbCartesianExpr transformedCol = new SdbCartesianExpr();
      FieldLiteral rightSExpr = (FieldLiteral) rightS.getExpr();

      BigInteger ma = cartesianExpr.getColKey().getM();
      BigInteger xa = cartesianExpr.getColKey().getX();
      BigInteger ms = rightSExpr.getColKey().getM();
      BigInteger xs = rightSExpr.getColKey().getX();
      BigInteger auxiliaryP = Crypto.cartesianAuxiliaryP(xa, xs, totient);
      // Update the column key
      BigInteger[] colKey = Crypto.cartesianUpdateColyKey(ma, xa, ms, auxiliaryP, n);

      transformedCol.addChild(cartesianExpr);
      transformedCol.addChild(rightSExpr);
      transformedCol.addChild(new BigIntLiteral(auxiliaryP));
      transformedCol.addChild(new BigIntLiteral(n));

      transformedCol.setAlia(cartesianExpr.getAlia());
      transformedCol.setColKey(new ColumnKey(colKey[0], colKey[1]));
      transformedCol.setReferredByList(cartesianExpr.getReferredByList());

      return transformedCol;
    }

//    else if (expr instanceof NormalArithmeticExpr){
//      UnSupportedException e = new UnSupportedException("Can not support " +
//              "non column expression in selection clause!");
//      LOG.error("There is unsupported selection item!", e);
//      throw e;
//    }


    // It is not a basic expr, we need to do recursive build
    for (int i = 0; i < expr.getChildren().size(); i++) {
      expr.setChild(i, buildCartesianExpr(expr.getChild(i), leftS, rightS,
              visitedTbl));
    }

    return expr;
  }

  protected void rewriteInLineViewRef(InLineViewRef inlineView)
          throws RewriteException {
    if (!inlineView.involveSdbEncrytedCol())
      return;

    // WARNING: This is casting is dangerous, since it could be an Union Statement.
    rewriteSelStmt((SelectStmt) inlineView.getQueryStmt());
  }

  /**
   * TODO: We assume a single predicate involves columns only from the same table.
   *
   * @param whereClause
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteWhereClause(Expr whereClause)
          throws UnSupportedException {
    if (whereClause instanceof CompoundPredicate) {
      rewriteCompoundPredicate((CompoundPredicate) whereClause);
      return whereClause;
    } else if (whereClause instanceof NormalBinPredicate) {
      LOG.info("Rewriting NormalBinPredicate during rewriteWhereClause");
      Set<String> tbls = findAllTbls((NormalBinPredicate)whereClause);
      assert(tbls != null);
      if(tbls.size()<1) {
        // No column involved in the where clause, no need to rewrite.
        return whereClause;
      }
      else if(tbls.size() == 1) {
        String tblName = (String)tbls.toArray()[0];
        // Key is table name + column name
        String key1 = tblName + BasicFieldLiteral.R_COLUMN_NAME;
        String key2 = tblName + BasicFieldLiteral.S_COLUMN_NAME;

        FieldLiteral R = new FieldLiteral(tblName, BasicFieldLiteral.R_COLUMN_NAME,DataType.INT, true, null);
        FieldLiteral S = new FieldLiteral(tblName, BasicFieldLiteral.S_COLUMN_NAME,DataType.INT, true, null);

        R.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.R_COLUMN_NAME));

        S.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.S_COLUMN_NAME));

        return rewriteNorBinPredicate((NormalBinPredicate) whereClause, R, S);
      }
      else {
        UnSupportedException e = new UnSupportedException("Can not support " +
                "predicate involves columns from different tables!");
        LOG.error("There is unsupported predicates!", e);
        throw e;
      }
    }
    else {
      UnSupportedException e = new UnSupportedException("Can not support " + whereClause.getClass().getName());
      LOG.error("There is unsupported predicates!", e);
      throw e;
    }
  }

  protected void rewriteGroupByExprs(List<Expr> groupExprs) throws
          UnSupportedException {
    // TODO Auto-generated method stub
  }

  protected void rewriteHavingExpr(Expr havingExpr) throws
          UnSupportedException {
    // TODO Auto-generated method stub
  }


  protected void rewriteCompoundPredicate(CompoundPredicate compoundPred) throws
          UnSupportedException {
    // No SDB encrypted column
    if (!compoundPred.involveSdbEncrytedCol())
      return;

    Expr leftPred = compoundPred.getLeftPred();
    Expr rightPred = compoundPred.getRightPred();


    if (leftPred instanceof CompoundPredicate) {
      rewriteCompoundPredicate((CompoundPredicate) leftPred);
    } else if (leftPred instanceof NormalBinPredicate) {

      Set<String> tbls = findAllTbls((NormalBinPredicate)leftPred);
      assert(tbls != null);

      if(tbls.size() == 1) {
        String tblName = (String)tbls.toArray()[0];

        FieldLiteral R = new FieldLiteral(tblName, BasicFieldLiteral.R_COLUMN_NAME,DataType.INT, true, null);
        FieldLiteral S = new FieldLiteral(tblName, BasicFieldLiteral.S_COLUMN_NAME,DataType.INT, true, null);

        R.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.R_COLUMN_NAME));
        S.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.S_COLUMN_NAME));

        compoundPred.setLeftPred(rewriteNorBinPredicate((NormalBinPredicate)
                leftPred, R, S));
      }
      else {
        UnSupportedException e = new UnSupportedException("Can not support " +
                "predicate involves columns from different tables!");
        LOG.error("There is unsupported predicates!", e);
        throw e;
      }

    }

    if (rightPred instanceof CompoundPredicate) {
      rewriteCompoundPredicate((CompoundPredicate) rightPred);
    } else if (rightPred instanceof NormalBinPredicate) {
      Set<String> tbls = findAllTbls((NormalBinPredicate)rightPred);
      assert(tbls != null);

      if(tbls.size() == 1) {
        String tblName = (String)tbls.toArray()[0];

        FieldLiteral R = new FieldLiteral(tblName, BasicFieldLiteral.R_COLUMN_NAME,DataType.INT, true, null);
        FieldLiteral S = new FieldLiteral(tblName, BasicFieldLiteral.S_COLUMN_NAME,DataType.INT, true, null);

        R.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.R_COLUMN_NAME));
        S.setColKey(getTableColumnKey(tblName, BasicFieldLiteral.S_COLUMN_NAME));

        compoundPred.setRightPred(rewriteNorBinPredicate((NormalBinPredicate)
                rightPred, R, S));
      }
      else {
        UnSupportedException e = new UnSupportedException("Can not support " +
                "predicate involves columns from different tables!");
        LOG.error("There is unsupported predicates!", e);
        throw e;
      }
    }
  }

  /**
   * Find the set of tables involved.
   *
   * @param expr
   * @return
   */
  protected Set<String> findAllTbls(Expr expr) {
    Set<String> tbls = new HashSet<>();

    if(expr instanceof NormalArithmeticExpr) {
      tbls.addAll(findAllTbls((NormalArithmeticExpr) expr));
    }
    else if(expr instanceof FieldLiteral) {
      String tblName = ((FieldLiteral) expr).getTbl();
      tbls.add(tblName);
    }
    else if(expr instanceof  NormalBinPredicate) {
      tbls.addAll(findAllTbls((NormalBinPredicate) expr));
    }
    else if(expr instanceof SdbCartesianExpr) {
      tbls.addAll(findAllTbls((SdbCartesianExpr) expr));
    }

    return tbls;
  }

  private Set<String> findAllTbls(NormalArithmeticExpr norArithExpr) {
    Set<String> tbls = new HashSet<>();

    Expr leftExpr = norArithExpr.getLeftExpr();
    Expr rightExpr = norArithExpr.getRightExpr();

    if(leftExpr instanceof NormalArithmeticExpr)
      tbls.addAll(findAllTbls((NormalArithmeticExpr) leftExpr));
    else if(leftExpr instanceof FieldLiteral) {
      String tblName = ((FieldLiteral) leftExpr).getTbl();
      tbls.add(tblName);
    }

    if(rightExpr instanceof NormalArithmeticExpr)
      tbls.addAll(findAllTbls((NormalArithmeticExpr) rightExpr));
    else if(rightExpr instanceof FieldLiteral) {
      String tblName = ((FieldLiteral) rightExpr).getTbl();
      tbls.add(tblName);
    }

    return tbls;
  }

  private Set<String> findAllTbls(NormalBinPredicate norBinPred) {
    Set<String> tbls = new HashSet<>();

    Expr leftExpr = norBinPred.getLeftExpr();
    Expr rightExpr = norBinPred.getRightExpr();

    tbls.addAll(findAllTbls(leftExpr));
    tbls.addAll(findAllTbls(rightExpr));

    return tbls;
  }

  private Set<String> findAllTbls(SdbCartesianExpr cartesianExpr) {
    Set<String> tbls = new HashSet<>();

    for(Expr expr : cartesianExpr.getChildren()) {
      tbls.addAll(findAllTbls(expr));
    }

    return tbls;
  }

  /**
   * TODO: We assume the arithmetic expression cannot have columns from different tables.
   *
   * @param arithExpr
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteNorArithExpr(NormalArithmeticExpr arithExpr, Expr S)
          throws UnSupportedException {

    Expr leftExpr = arithExpr.getLeftExpr();
    Expr rightExpr = arithExpr.getRightExpr();

    if (leftExpr instanceof NormalArithmeticExpr)
      arithExpr.setLeftExpr(rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S));
    if (rightExpr instanceof NormalArithmeticExpr)
      arithExpr.setRightExpr(rewriteNorArithExpr((NormalArithmeticExpr) rightExpr,
              S));

    // EE mode
    if (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
        //SDB_MUL EE Mode
        case MULTIPLY: {
          return rewriteMultiplyEE(arithExpr.getLeftExpr(), arithExpr.getRightExpr
                  ());
        }
        //SDB_ADD EE Mode
        case ADD: {
          return rewriteAddEE(arithExpr.getLeftExpr(), arithExpr.getRightExpr(), S);
        }
        case SUBTRACT: {
          return rewriteSubtractEE(arithExpr.getLeftExpr(), arithExpr.getRightExpr
                  (), S);
        }
        default:
          UnSupportedException e = new UnSupportedException(
                  "Unsupported arithmetic operation " + arithExpr.getOp());
          LOG.error("There is unsupported arithmetic operation!", e);
          throw e;
      }
    }

    // EC mode or EP mode
    else if (leftExpr.involveSdbEncrytedCol() || rightExpr.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
        case MULTIPLY:
          // EC mode only support Integer type currently
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {
            return rewriteMultiplyEC(leftExpr, rightExpr);
          }
          //EP mode
          else {
            return rewriteMultiplyEP(leftExpr, rightExpr, S);
          }
        case ADD:
          // EC mode
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {
            return rewriteAddEC(leftExpr, rightExpr, S);
          }
          // EP mode
          else {
            return rewriteAddEP(leftExpr, rightExpr, S);
          }
        case SUBTRACT:
          //EC mode
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {
            return rewriteSubtractEC(leftExpr, rightExpr, S);
          }
          //EP mode
          else {
            return rewriteSubtractEP(leftExpr, rightExpr, S);
          }
      }
    }

    return arithExpr;
  }


  /**
   * Rewrite addition for EE mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteAddEE(Expr leftExpr, Expr rightExpr, Expr S) throws UnSupportedException {
    assert (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol());

    SdbTransformExpr sdbTransformExpr = new SdbTransformExpr(SdbOperator.SDB_ADD);

    BigInteger targetM = Crypto.generatePositiveRand(prime1, prime2);
    BigInteger targetX = Crypto.generatePositiveRand(prime1, prime2);

    BigInteger[] pqLeft = Crypto.keyUpdateClient(leftExpr.getColKey().getM(),
            targetM, S.getColKey().getM(), leftExpr.getColKey().getX(), targetX,
            S.getColKey().getX(), prime1, prime2);

    BigInteger[] pqRight = Crypto.keyUpdateClient(rightExpr.getColKey().getM(),
            targetM, S.getColKey().getX(), rightExpr.getColKey().getX(), targetX,
            S.getColKey().getX(), prime1, prime2);

    Expr leftKeyUp = buildSdbKeyUpdateExpr(leftExpr, S, new BigIntLiteral
                    (pqLeft[0]),
            new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM, targetX);

    Expr rightKeyUp = buildSdbKeyUpdateExpr(rightExpr, S, new BigIntLiteral
                    (pqRight[0]),
            new BigIntLiteral(pqRight[1]), new BigIntLiteral(n), targetM, targetX);


    sdbTransformExpr.addChild(leftKeyUp);
    sdbTransformExpr.addChild(rightKeyUp);
    sdbTransformExpr.addChild(new BigIntLiteral(n));
    sdbTransformExpr.setColKey(new ColumnKey(targetM, targetX));

    return sdbTransformExpr;
  }

  /**
   * Rewrite addition for EP mode. Assume columns from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteAddEP(Expr leftExpr, Expr rightExpr, Expr S) throws UnSupportedException {
    // only one involves encrypted column
    assert (leftExpr.involveSdbEncrytedCol() ^ rightExpr.involveSdbEncrytedCol());
    SdbTransformExpr sdbTransformExpr = new SdbTransformExpr(SdbOperator.SDB_ADD);

    Expr E;
    Expr P;
    if (leftExpr.involveSdbEncrytedCol()) {
      E = leftExpr;
      P = rightExpr;
    } else {
      E = rightExpr;
      P = leftExpr;
    }

    BigInteger targetM = Crypto.generatePositiveRand(prime1, prime2);
    BigInteger targetX = Crypto.generatePositiveRand(prime1, prime2);

    Expr pKeyUp = keyUpdatePlainCol(P, S, targetM, targetX);

    BigInteger[] pq = Crypto.keyUpdateClient(E.getColKey().getM(),
            targetM, S.getColKey().getX(), E.getColKey().getX(), targetX,
            S.getColKey().getX(), prime1, prime2);

    Expr eKeyUp = buildSdbKeyUpdateExpr(E, S, new BigIntLiteral
                    (pq[0]),
            new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);

    sdbTransformExpr.addChild(eKeyUp);
    sdbTransformExpr.addChild(pKeyUp);
    sdbTransformExpr.addChild(new BigIntLiteral(n));


    return sdbTransformExpr;
  }

  /**
   * Rewrite addition for EC mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteAddEC(Expr leftExpr, Expr rightExpr, Expr S) throws
          UnSupportedException {
    Expr E;
    Expr C;

    if (leftExpr instanceof IntLiteral) {
      E = rightExpr;
      C = leftExpr;
    } else if (rightExpr instanceof IntLiteral) {
      E = leftExpr;
      C = rightExpr;
    } else {
      throw new UnSupportedException("Unsupported Data Type in EC mode!");
    }

    Expr SC = rewriteMultiplyEC(S, C);

    return rewriteAddEE(E, SC, S);
  }

  /**
   * Rewrite subtraction for EE mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteSubtractEE(Expr leftExpr, Expr rightExpr, Expr S) throws UnSupportedException {
    assert (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol());
    BigInteger inverseM = rightExpr.getColKey().getM().multiply(n.subtract
            (BigInteger.ONE)).mod(n);

    ColumnKey colKey = new ColumnKey(inverseM, rightExpr.getColKey().getX());
    rightExpr.setColKey(colKey);

    return rewriteAddEE(leftExpr, rightExpr, S);
  }

  /**
   * Rewrite subtraction for EP mode. Assume columns are from the same table.
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteSubtractEP(Expr leftExpr, Expr rightExpr, Expr S) {
    // only one involves encrypted column
    assert (leftExpr.involveSdbEncrytedCol() ^ rightExpr.involveSdbEncrytedCol());
    SdbTransformExpr sdbTransformExpr = new SdbTransformExpr(SdbOperator.SDB_ADD);

    BigInteger targetM = Crypto.generatePositiveRand(prime1, prime2);
    BigInteger targetX = Crypto.generatePositiveRand(prime1, prime2);


    // We need to inverse the value of the right expression
    if (leftExpr.involveSdbEncrytedCol()) {
      // P is the right expression. Inverse P.
      rightExpr = keyUpdateInversedPlainCol(rightExpr, S, targetM, targetX);
      BigInteger[] pq = Crypto.keyUpdateClient(leftExpr.getColKey().getM(),
              targetM, S.getColKey().getX(), leftExpr.getColKey().getX(), targetX,
              S.getColKey().getX(), prime1, prime2);
      leftExpr = buildSdbKeyUpdateExpr(leftExpr, S, new BigIntLiteral(pq[0]),
              new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);
    } else {
      // P is the left expression.
      leftExpr = keyUpdatePlainCol(leftExpr, S, targetM, targetX);
      // Inverse E expression.
      BigInteger inverseM = rightExpr.getColKey().getM().multiply(n.subtract
              (BigInteger.ONE)).mod(n);
      BigInteger[] pq = Crypto.keyUpdateClient(inverseM,
              targetM, S.getColKey().getX(), rightExpr.getColKey().getX(),
              targetX,
              S.getColKey().getX(), prime1, prime2);
      rightExpr = buildSdbKeyUpdateExpr(rightExpr, S, new BigIntLiteral(pq[0]),
              new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);
    }

    sdbTransformExpr.addChild(leftExpr);
    sdbTransformExpr.addChild(rightExpr);
    sdbTransformExpr.addChild(new BigIntLiteral(n));
    sdbTransformExpr.setColKey(new ColumnKey(targetM, targetX));
    return sdbTransformExpr;
  }

  /**
   * Rewrite subtraction for EC mode. Assume columns are from the same table.
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteSubtractEC(Expr leftExpr, Expr rightExpr, Expr S) throws
          UnSupportedException {
    Expr SC;
    if (leftExpr instanceof IntLiteral) {
      SC = rewriteMultiplyEC(S, leftExpr);
      return rewriteSubtractEE(SC, rightExpr, S);
    } else if (rightExpr instanceof IntLiteral) {
      SC = rewriteMultiplyEC(S, rightExpr);
      return rewriteSubtractEE(leftExpr, SC, S);
    } else {
      throw new UnSupportedException("Unsupported Data Type in EC mode!");
    }
  }

  /**
   * Rewrite multiplication for EE mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @return
   */
  protected Expr rewriteMultiplyEE(Expr leftExpr, Expr rightExpr) {
    assert (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol());

    SdbTransformExpr sdbTransformExpr = new SdbTransformExpr(SdbOperator.SDB_MUL);

    BigInteger m = leftExpr.getColKey().getM().multiply(rightExpr.getColKey().getM
            ()).mod(n);

    BigInteger x = leftExpr.getColKey().getX().add(rightExpr.getColKey()
            .getX()).mod(totient);

    ColumnKey colKey = new ColumnKey(m, x);

    sdbTransformExpr.addChild(leftExpr);
    sdbTransformExpr.addChild(rightExpr);
    sdbTransformExpr.addChild(new BigIntLiteral(n));
    sdbTransformExpr.setColKey(colKey);

    return sdbTransformExpr;
  }

  /**
   * Rewrite multiplication for EP mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteMultiplyEP(Expr leftExpr, Expr rightExpr, Expr S) {
    // only one involves encrypted column
    assert (leftExpr.involveSdbEncrytedCol() ^ rightExpr.involveSdbEncrytedCol());

    Expr E;
    Expr P;
    if (leftExpr.involveSdbEncrytedCol()) {
      E = leftExpr;
      P = rightExpr;
    } else {
      E = rightExpr;
      P = leftExpr;
    }

    // Need to do key update for the unencrypted expr
    BigInteger targetM = Crypto.generatePositiveRand(prime1, prime2);
    BigInteger targetX = Crypto.generatePositiveRand(prime1, prime2);

    Expr pKeyUp = keyUpdatePlainCol(P, S, targetM, targetX);

    return rewriteMultiplyEE(E, pKeyUp);
  }

  protected Expr rewriteMultiplyEC(Expr leftExpr, Expr rightExpr) throws
          UnSupportedException {
    Expr E;
    Expr C;

    if (leftExpr instanceof IntLiteral) {
      E = rightExpr;
      C = leftExpr;
    } else if (rightExpr instanceof IntLiteral) {
      E = leftExpr;
      C = rightExpr;
    } else {
      throw new UnSupportedException("Unsupported Data Type in EC mode!");
    }

    SdbTransformExpr sdbTransformExpr = new SdbTransformExpr(SdbOperator.SDB_MUL);
    sdbTransformExpr.addChild(E);
    sdbTransformExpr.addChild(C);
    sdbTransformExpr.addChild(new BigIntLiteral(n));

    BigInteger m = BigInteger.valueOf(((IntLiteral) C).getValue()).multiply(E
            .getColKey().getM()).mod(n);
    BigInteger x = E.getColKey().getX();

    ColumnKey colKey = new ColumnKey(m, x);
    sdbTransformExpr.setColKey(colKey);

    return sdbTransformExpr;
  }

  /**
   * Do keyUpdate for a plain text column.
   *
   * @param P
   * @param S
   * @param targetM
   * @param targetX
   * @return
   */
  private Expr keyUpdatePlainCol(Expr P, Expr S, BigInteger targetM,
                                 BigInteger targetX) {
    BigInteger pM = BigInteger.ONE;
    BigInteger pX = BigInteger.ZERO;

    BigInteger[] pq = Crypto.keyUpdateClient(pM, targetM, S.getColKey()
                    .getM(),
            pX, targetX, S.getColKey().getX(), prime1, prime2);

    return buildSdbKeyUpdateExpr(P, S, new BigIntLiteral(pq[0]),
            new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);

  }

  /**
   * Do keyUpdate for a plain text column but inverse its value.
   *
   * @param P
   * @param S
   * @param targetM
   * @param targetX
   * @return
   */
  private Expr keyUpdateInversedPlainCol(Expr P, Expr S, BigInteger targetM,
                                         BigInteger targetX) {
    BigInteger pM = n.subtract(BigInteger.ONE);
    BigInteger pX = BigInteger.ZERO;

    BigInteger[] pq = Crypto.keyUpdateClient(pM, targetM, S.getColKey()
                    .getM(),
            pX, targetX, S.getColKey().getX(), prime1, prime2);

    return buildSdbKeyUpdateExpr(P, S, new BigIntLiteral(pq[0]),
            new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);

  }

  /**
   * Build a key update expression.
   *
   * @param column
   * @param S
   * @param p
   * @param q
   * @param n
   * @param targetM
   * @param targetX
   * @return
   */
  private Expr buildSdbKeyUpdateExpr(Expr column, Expr S, Expr p, Expr q, Expr n,
                                     BigInteger targetM, BigInteger targetX) {
    SdbKeyUpdateExpr keyUpdateExpr = new SdbKeyUpdateExpr();

    keyUpdateExpr.addChild(column);
    keyUpdateExpr.addChild(S);
    keyUpdateExpr.addChild(p);
    keyUpdateExpr.addChild(q);
    keyUpdateExpr.addChild(n);

    keyUpdateExpr.setColKey(new ColumnKey(targetM, targetX));

    return keyUpdateExpr;
  }

  /**
   * TODO: We assume the predicate cannot have columns from different table.
   *
   * @param normalBinPred
   * @param R
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteNorBinPredicate(NormalBinPredicate normalBinPred, Expr R,
                                        Expr S) throws UnSupportedException {
    // No SDB encrypted column.
    if (!normalBinPred.involveSdbEncrytedCol())
      return normalBinPred;

    Expr leftExpr = normalBinPred.getLeftExpr();
    Expr rightExpr = normalBinPred.getRightExpr();

    Expr subtractExpr = null;
    Expr multiplyExpr = null;

    BigInteger targetM = BigInteger.ONE;
    BigInteger targetX = BigInteger.ZERO;

    Expr keyUpdateExpr = null;
    Expr compareExpr = new SdbComparisonExpr(normalBinPred.getOp());

    // EE mode
    if (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol()) {
      if (leftExpr instanceof NormalArithmeticExpr) {
        leftExpr = rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S);
      }

      if (rightExpr instanceof NormalArithmeticExpr) {
        rightExpr = rewriteNorArithExpr((NormalArithmeticExpr) rightExpr, S);
      }

      subtractExpr = rewriteSubtractEE(leftExpr, rightExpr, S);
      multiplyExpr = rewriteMultiplyEE(R, subtractExpr);

      BigInteger[] pq = Crypto.keyUpdateClient(multiplyExpr.getColKey().getM(),
              targetM, S.getColKey().getM(), multiplyExpr.getColKey().getX(),
              targetX, S.getColKey().getX(), prime1, prime2);

      keyUpdateExpr = buildSdbKeyUpdateExpr(multiplyExpr, S, new
              BigIntLiteral(pq[0]), new BigIntLiteral(pq[1]), new
              BigIntLiteral(n), targetM, targetX);

    } else if (leftExpr.involveSdbEncrytedCol() || rightExpr.involveSdbEncrytedCol
            ()) {
      // EC mode
      if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {
        if (leftExpr instanceof NormalArithmeticExpr) {
          leftExpr = rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S);
        }

        if (rightExpr instanceof NormalArithmeticExpr) {
          rightExpr = rewriteNorArithExpr((NormalArithmeticExpr) rightExpr, S);
        }

        subtractExpr = rewriteSubtractEC(leftExpr, rightExpr, S);
        multiplyExpr = rewriteMultiplyEE(R, subtractExpr);

        BigInteger[] pq = Crypto.keyUpdateClient(multiplyExpr.getColKey().getM(),
                targetM, S.getColKey().getM(), multiplyExpr.getColKey().getX(),
                targetX, S.getColKey().getX(), prime1, prime2);

        keyUpdateExpr = buildSdbKeyUpdateExpr(multiplyExpr, S, new
                BigIntLiteral(pq[0]), new BigIntLiteral(pq[1]), new
                BigIntLiteral(n), targetM, targetX);
      }

      // EP mode
      else if (leftExpr instanceof FieldLiteral || rightExpr instanceof FieldLiteral) {
        if (leftExpr instanceof NormalArithmeticExpr) {
          leftExpr = rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S);
        }

        if (rightExpr instanceof NormalArithmeticExpr) {
          rightExpr = rewriteNorArithExpr((NormalArithmeticExpr) rightExpr, S);
        }


        subtractExpr = rewriteSubtractEP(leftExpr, rightExpr, S);
        multiplyExpr = rewriteMultiplyEE(R, subtractExpr);

        BigInteger[] pq = Crypto.keyUpdateClient(multiplyExpr.getColKey().getM(),
                targetM, S.getColKey().getM(), multiplyExpr.getColKey().getX(),
                targetX, S.getColKey().getX(), prime1, prime2);

        keyUpdateExpr = buildSdbKeyUpdateExpr(multiplyExpr, S, new
                BigIntLiteral(pq[0]), new BigIntLiteral(pq[1]), new
                BigIntLiteral(n), targetM, targetX);
      }
    }

    if (normalBinPred.getOp() != BinaryPredicate.BinOperator.EQ) {
      compareExpr.addChild(keyUpdateExpr);
      compareExpr.addChild(new BigIntLiteral(n.subtract(BigInteger.ONE)
              .divide(new BigInteger("2"))));
    } else {
      compareExpr.addChild(keyUpdateExpr);
    }

    return compareExpr;
  }

  private ColumnKey getTableColumnKey(String tblName, String colName) {
    ColumnKey colKey = null;

    String key = tblName + colName;

    if(colKeyMap.containsKey(key)) {
      colKey = colKeyMap.get(key);
    }
    else {
      for (TableMeta tableMeta : dbMeta.getTbls()) {
        if (tableMeta.getTblName().equals(tblName)) {
          for (ColumnMeta columnMeta : tableMeta.getCols()) {
            if (columnMeta.getColName().equals(colName)) {
              BigInteger m = columnMeta.getColkey().getM();
              BigInteger x = columnMeta.getColkey().getX();
              colKey = new ColumnKey(m, x);

              colKeyMap.put(tblName + colName, colKey);

              return colKey;
            }
          }
        }
      }
    }
    return colKey;
  }

  /**
   * Belows are fast implementation of rewriting arithmetic expression by updating
   * all columns to be the same column key <m, 0>.
   */


  /**
   *
   * @param arithExpr
   * @param targetM
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteNorArithExprFast(NormalArithmeticExpr arithExpr, BigInteger targetM)
          throws UnSupportedException {

    Expr leftExpr = arithExpr.getLeftExpr();
    Expr rightExpr = arithExpr.getRightExpr();

    // Need to check if expression involves columns from different table.


    if (leftExpr instanceof NormalArithmeticExpr)
      arithExpr.setLeftExpr(rewriteNorArithExprFast((NormalArithmeticExpr)
              leftExpr, targetM));
    if (rightExpr instanceof NormalArithmeticExpr)
      arithExpr.setRightExpr(rewriteNorArithExprFast((NormalArithmeticExpr) rightExpr, targetM));


    // EE mode
    if (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
        //SDB_MUL EE Mode
        case MULTIPLY: {

        }
        //SDB_ADD EE Mode
        case ADD: {
          return rewriteAddEEFast(leftExpr, rightExpr, targetM);
        }
        case SUBTRACT: {

        }
        default:
          UnSupportedException e = new UnSupportedException(
                  "Unsupported arithmetic operation " + arithExpr.getOp());
          LOG.error("There is unsupported arithmetic operation!", e);
          throw e;
      }
    }

    // EC mode or EP mode
    else if (leftExpr.involveSdbEncrytedCol() || rightExpr.involveSdbEncrytedCol()) {
      switch (arithExpr.getOp()) {
        case MULTIPLY:
          // EC mode only support Integer type currently
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {

          }
          //EP mode
          else {

          }
        case ADD:
          // EC mode
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {

          }
          // EP mode
          else {

          }
        case SUBTRACT:
          //EC mode
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral) {

          }
          //EP mode
          else {

          }
      }
    }

    return arithExpr;

  }

  protected Expr rewriteAddEEFast(Expr leftExpr, Expr rightExpr, BigInteger targetM) throws UnSupportedException {
    assert (leftExpr.involveSdbEncrytedCol() && rightExpr.involveSdbEncrytedCol());
    BigInteger targetX = BigInteger.ZERO;

    SdbTransformExpr sdbTransformExpr = new SdbTransformExpr(SdbOperator.SDB_ADD);

    //      BigInteger targetM = Crypto.generatePositiveRand(prime1, prime2);
    //      BigInteger targetX = BigInteger.ZERO;
    //
    //      FieldLiteral eLiteral = (FieldLiteral) E;
    //      FieldLiteral pLiteral = (FieldLiteral) P;
    //
    //      FieldLiteral eS = new FieldLiteral(eLiteral.getTbl(),BasicFieldLiteral.S_COLUMN_NAME,DataType.INT);
    //      FieldLiteral pS = new FieldLiteral(pLiteral.getTbl(),BasicFieldLiteral.S_COLUMN_NAME,DataType.INT);
    //
    //      String key1 = eLiteral.getTbl() + BasicFieldLiteral.S_COLUMN_NAME;
    //      String key2 = pLiteral.getTbl() + BasicFieldLiteral.S_COLUMN_NAME;
    //      if(colKeyMap.containsKey(key1)) {
    //        eS.setColKey(colKeyMap.get(key1));
    //      }
    //      else {
    //        ColumnKey colKey = getTableColumnKey(eLiteral.getTbl(),
    //                BasicFieldLiteral.S_COLUMN_NAME);
    //        eS.setColKey(colKey);
    //        colKeyMap.put(key1, colKey);
    //      }
    //
    //      if(colKeyMap.containsKey(key2)){
    //        pS.setColKey(colKeyMap.get(key2));
    //      }
    //      else {
    //        ColumnKey colKey = getTableColumnKey(pLiteral.getTbl(),
    //                BasicFieldLiteral.S_COLUMN_NAME);
    //        pS.setColKey(colKey);
    //        colKeyMap.put(key2, colKey);
    //      }
    //
    //      Expr pKeyUp = keyUpdatePlainCol(P, pS, targetM, targetX);
    //
    //      BigInteger[] pq = Crypto.keyUpdateClient(E.getColKey().getM(),
    //              targetM, eS.getColKey().getX(), E.getColKey().getX(), targetX,
    //              S.getColKey().getX(), prime1, prime2);
    //
    //      Expr eKeyUp = buildSdbKeyUpdateExpr(E, eS, new BigIntLiteral
    //                      (pq[0]),
    //              new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);
    //
    //      sdbTransformExpr.addChild(eKeyUp);
    //      sdbTransformExpr.addChild(pKeyUp);
    //      sdbTransformExpr.addChild(new BigIntLiteral(n));
    //      sdbTransformExpr.setColKey(new ColumnKey(targetM, targetX));

    return sdbTransformExpr;

  }

}
