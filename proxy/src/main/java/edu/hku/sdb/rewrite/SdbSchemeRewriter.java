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
import edu.hku.sdb.crypto.SDBEncrypt;
import edu.hku.sdb.crypto.SEException;
import edu.hku.sdb.crypto.SEKey;
import edu.hku.sdb.crypto.SearchEncrypt;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.parse.SdbArithmeticExpr.SdbOperator;
import edu.hku.sdb.parse.SdbKeyUpdateExpr.SdbKeyUpOperator;
import edu.hku.sdb.utility.ParserConstant;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.SecretKey;

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

  // TODO: we assume the names for all tables and inlineView are unique.
  private Map<String, SdbColumnKey> colKeyMap = new HashMap<>();
  private Map<String, String> aliasTblMap = new HashMap<>();

  /**
   * @param dbMeta
   */
  public SdbSchemeRewriter(DBMeta dbMeta) {
    super(dbMeta);

    prime1 = new BigInteger(dbMeta.getPrime1());
    prime2 = new BigInteger(dbMeta.getPrime2());
    n = new BigInteger(dbMeta.getN());
    g = new BigInteger(dbMeta.getG());
    totient = SDBEncrypt.evaluateTotient(prime1, prime2);
  }

  @Override
  public void rewrite(ParseNode parseTree) throws RewriteException {
    LOG.info("Begin the rewrite process");
    rewriteInternal(parseTree);
    LOG.info("End the rewrite process");
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
    rewriteCreateFieldLists(createStmt.getColumnDefinitions());
    rewriteCreateRowFormat(createStmt);
  }

  private void rewriteCreateRowFormat(CreateStmt createStmt) {
    TableRowFormat tableRowFormat = createStmt.getTableRowFormat();
    //TODO get default separator ";" from config file
    if (tableRowFormat == null) {
      tableRowFormat = new TableRowFormat();
      tableRowFormat.setFieldDelimiter(ParserConstant.DEFAULT_FIELD_DELIMETER);
      tableRowFormat.setColletionDelimiter(ParserConstant.DEFAULT_COLLETION_DELIMETER);
      createStmt.setTableRowFormat(tableRowFormat);
    }
  }

  private void rewriteCreateFieldLists(List<ColumnDefinition> fieldList) throws UnSupportedException {
    TableName tableName = fieldList.get(0).getTableName();

    for (ColumnDefinition colDefinition : fieldList) {
      if (colDefinition.involveEncrytedCol()) {
        Type originType = colDefinition.getOriginType();

        if(originType instanceof ScalarType) {
          int index = fieldList.indexOf(colDefinition);
          Type type;
          switch ( ((ScalarType) originType).getType()) {
            case INT:
            case BIGINT:
            case TINYINT:
            case DECIMAL:
              type = ScalarType.createVarcharType(SDBEncrypt.defaultRandLength);
              BigInteger m = SDBEncrypt.generatePositiveRand(prime1, prime2);
              BigInteger x = SDBEncrypt.generatePositiveRand(prime1, prime2);
              SdbColumnKey colKey = new SdbColumnKey(m, x);
              colDefinition.setSDBEncrypted(true);
              colDefinition.setRewrittenType(type);
              colDefinition.setSDBColumnKey(colKey);
              break;
            case CHAR:
            case VARCHAR:
            case STRING:
              type = new ArrayType(ScalarType.createVarcharType(SearchEncrypt.DEAULTT_LENGTH));
              SearchEncrypt searchEncrypt = SearchEncrypt.getInstance();
              try {
                SEKey key = searchEncrypt.keyGen();
                SearchColumnKey searchColKey = new SearchColumnKey(key, searchEncrypt.prkey);
                colDefinition.setSDBEncrypted(true);
                colDefinition.setRewrittenType(type);
                colDefinition.setSearchColKey(searchColKey);
              } catch (SEException e) {
                e.printStackTrace();
              }

              break;
            default:
              UnSupportedException e = new UnSupportedException("Can not support " +
                      "sdb encryption for data type " + originType);
              LOG.error("There is unsupported data type!", e);
              throw e;
          }
          fieldList.set(index, colDefinition);
        }
      }
    }

    ColumnDefinition rowIdField = buildAuxiliaryColumn
            (ColumnDefinition.ROW_ID_COLUMN_NAME, tableName, prime1, prime2);
    fieldList.add(rowIdField);

    ColumnDefinition rField = buildAuxiliaryColumn(ColumnDefinition
            .R_COLUMN_NAME, tableName, prime1, prime2);
    fieldList.add(rField);

    ColumnDefinition sField = buildAuxiliaryColumn(ColumnDefinition
            .S_COLUMN_NAME, tableName, prime1, prime2);
    fieldList.add(sField);
  }

  private ColumnDefinition buildAuxiliaryColumn(String fieldName,
                                                TableName tableName,
                                                BigInteger p,
                                                BigInteger q) {
    Type type = ScalarType.createVarcharType(SDBEncrypt.defaultRandLength);
    BigInteger m = SDBEncrypt.generatePositiveRand(p, q);
    BigInteger x = SDBEncrypt.generatePositiveRand(p, q);
    SdbColumnKey sdbColumnKey = new SdbColumnKey(m, x);
    ColumnDefinition fieldLiteral = new ColumnDefinition(fieldName, Type.INT,
            tableName, true, sdbColumnKey);
    fieldLiteral.setRewrittenType(type);
    return fieldLiteral;
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
    LOG.debug("Rewriting table list");

    // First of all, initialize the auxiliary columns RowID, R, S of the selection
    // list, since we possibly need them for the later computation.
    // In the optimization phase, we will delete all those useless auxiliary columns.
    SelectionItem leftRowID = new SelectionItem();
    SelectionItem leftR = new SelectionItem();
    SelectionItem leftS = new SelectionItem();

    leftRowID.setAlias(ColumnDefinition.ROW_ID_COLUMN_NAME);
    leftR.setAlias(ColumnDefinition.R_COLUMN_NAME);
    leftS.setAlias(ColumnDefinition.S_COLUMN_NAME);

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
          String tblName = tblRef.getTblName();
          SdbColumnKey rowIDColKey = getTableColumnKey(tblName, ColumnDefinition
                  .ROW_ID_COLUMN_NAME);

          FieldLiteral rowID = new FieldLiteral(tblName, ColumnDefinition
                  .ROW_ID_COLUMN_NAME, Type.INT,
                  true, rowIDColKey);
          leftRowID.setExpr(rowID);

          SdbColumnKey rColKey = getTableColumnKey(tblName, ColumnDefinition
                  .R_COLUMN_NAME);
          FieldLiteral r = new FieldLiteral(tblName, ColumnDefinition
                  .R_COLUMN_NAME, Type.INT,
                  true, rColKey);
          leftR.setExpr(r);

          SdbColumnKey sColKey = getTableColumnKey(tblName, ColumnDefinition
                  .S_COLUMN_NAME);
          FieldLiteral s = new FieldLiteral(tblName, ColumnDefinition
                  .S_COLUMN_NAME, Type.INT,
                  true, sColKey);
          leftS.setExpr(s);

          if (!tblRef.getAlias().equals("")) {
            // Should use the alias in the final rewritten query.
            rowID.setTbl(tblRef.getAlias());
            r.setTbl(tblRef.getAlias());
            s.setTbl(tblRef.getAlias());

            // Check if alias has been used.
            if (aliasTblMap.containsKey(tblRef.getAlias())) {
              RewriteException e = new RewriteException("Repeated alias!");
              LOG.error("Please use another alias for table " + tblName, e);
              throw e;
            }
            aliasTblMap.put(tblRef.getAlias(), tblName);
            visitedTbl.add(tblRef.getAlias());
          } else {
            visitedTbl.add(tblName);
          }
        }
        // Is is an inline view.
        else {
          // The rewrite has been performed.
          SelectionList inLineSelList = ((SelectStmt) ((InLineViewRef) tblRef)
                  .getQueryStmt()).getSelectList();

          FieldLiteral inlineRowID = new FieldLiteral(tblRef.getAlias(),
                  ColumnDefinition.ROW_ID_COLUMN_NAME, Type.INT);
          FieldLiteral inlineR = new FieldLiteral(tblRef.getAlias(),
                  ColumnDefinition.R_COLUMN_NAME, Type.INT);
          FieldLiteral inlineS = new FieldLiteral(tblRef.getAlias(),
                  ColumnDefinition.S_COLUMN_NAME, Type.INT);

          // Get column keys for rowID, R and S
          inlineRowID.setSdbColKey(inLineSelList.getRowID().getExpr().getSdbColKey());
          inlineR.setSdbColKey(inLineSelList.getAuxiliaryR().getExpr()
                  .getSdbColKey());
          inlineS.setSdbColKey(inLineSelList.getAuxiliaryS().getExpr().getSdbColKey());

          leftRowID = new SelectionItem(inlineRowID, ColumnDefinition
                  .ROW_ID_COLUMN_NAME);
          leftR = new SelectionItem(inlineR, ColumnDefinition.R_COLUMN_NAME);
          leftS = new SelectionItem(inlineS, ColumnDefinition.S_COLUMN_NAME);

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
          String tblName = tblRef.getTblName();

          SdbColumnKey rowIDColKey = getTableColumnKey(tblName, ColumnDefinition
                  .ROW_ID_COLUMN_NAME);

          FieldLiteral rowID = new FieldLiteral(tblName, ColumnDefinition
                  .ROW_ID_COLUMN_NAME, Type.INT,
                  true, rowIDColKey);
          rightRowID.setExpr(rowID);

          SdbColumnKey sColKey = getTableColumnKey(tblName, ColumnDefinition
                  .S_COLUMN_NAME);

          FieldLiteral s = new FieldLiteral(tblName, ColumnDefinition
                  .S_COLUMN_NAME, Type.INT,
                  true, sColKey);
          rightS.setExpr(s);

          if (!tblRef.getAlias().equals("")) {
            // Should use the alias in the final rewritten query.
            rowID.setTbl(tblRef.getAlias());
            s.setTbl(tblRef.getAlias());

            // Check if alias has been used.
            if (aliasTblMap.containsKey(tblRef.getAlias())) {
              RewriteException e = new RewriteException("Repeated alias!");
              LOG.error("Please use another alias for table " + tblName, e);
              throw e;
            }
            aliasTblMap.put(tblRef.getAlias(), tblName);
          }

        }
        // It is an inline view.
        else {
          isInlineView = true;
          SelectionList inLineSelList = ((SelectStmt) ((InLineViewRef) tblRef)
                  .getQueryStmt()).getSelectList();

          FieldLiteral inlineRowID = new FieldLiteral(tblRef.getAlias(),
                  ColumnDefinition.ROW_ID_COLUMN_NAME, Type.INT);
          //          FieldLiteral inlineR = new FieldLiteral(tblRef.getAlias(),
          //                  ColumnDefinition.R_COLUMN_NAME, DataType.INT);
          FieldLiteral inlineS = new FieldLiteral(tblRef.getAlias(),
                  ColumnDefinition.S_COLUMN_NAME, Type.INT);

          // Get column keys for rowID, R and S
          inlineRowID.setSdbColKey(inLineSelList.getRowID().getExpr().getSdbColKey());
          //          inlineR.setSdbColKey(inLineSelList.getAuxiliaryR().getExpr()
          // .getSdbColKey());
          inlineS.setSdbColKey(inLineSelList.getAuxiliaryS().getExpr().getSdbColKey());

          rightRowID = new SelectionItem(inlineRowID, ColumnDefinition
                  .ROW_ID_COLUMN_NAME);
          rightS = new SelectionItem(inlineS, ColumnDefinition.S_COLUMN_NAME);

        }

        // Property of Column Key <m, 0>: all values in the Column A has the same
        // item key m. That means if two values a1, a2 are equal, then their
        // encrypted
        // value E(a1) and E(a2) are equal as well.
        BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
        BigInteger targetX = BigInteger.ZERO;

        // Perform Key updates on the join columns
        rewriteJoinPred(onClause, leftS, rightS, targetM, targetX);

        // Do transform for all sensitive columns in the selection list
        for (SelectionItem selItem : selList.getItemList()) {
          if (selItem.involveEncrytedCol()) {
            Expr originExpr = selItem.getExpr();
            Expr rewrittenExpr = buildCartesianExpr(originExpr, leftS, rightS,
                    visitedTbl);
            rewrittenExpr.setReferredByList(originExpr.getReferredByList());

            if(selItem.getAlias().equals("")) {
              if(originExpr instanceof FieldLiteral) {
                selItem.setAlias(((FieldLiteral)originExpr).getName());
              }
              else {
                RewriteException e = new UnSupportedException("Only column can be " +
                        "without alias in the selection list");
                LOG.error("There is unsupport seletcion item!", e);
                throw e;
              }
            }

            selItem.setExpr(rewrittenExpr);
          }
        }

        // The row column key should be equal for across all tables.
        assert (leftRowID.getExpr().getSdbColKey().getM().equals(rightRowID.getExpr()
                .getSdbColKey().getM()));

        // Update the auxiliary columns
        // The row id is homomorphic additive
        Expr newRowID = new SdbArithmeticExpr(SdbOperator.SDB_ADDROWID);
        newRowID.addChild(leftRowID.getExpr());
        newRowID.addChild(rightRowID.getExpr());
        newRowID.addChild(new BigIntLiteral(n));

        BigInteger m = leftRowID.getExpr().getSdbColKey().getM();
        BigInteger x = leftRowID.getExpr().getSdbColKey().getX().add(rightRowID
                .getExpr().getSdbColKey().getX());
        newRowID.setSdbColKey(new SdbColumnKey(m, x));

        Expr newR = buildCartesianExpr(leftR.getExpr(), leftS, rightS, visitedTbl);
        Expr newS = buildCartesianExpr(leftS.getExpr(), leftS, rightS, visitedTbl);

        leftRowID.setExpr(newRowID);
        leftR.setExpr(newR);
        leftS.setExpr(newS);

        if (isInlineView) {
          visitedTbl.add(tblRef.getAlias());
        } else {
          if (tblRef.getAlias().equals(""))
            visitedTbl.add(tblRef.getTblName());
          else
            visitedTbl.add(tblRef.getAlias());
        }
      }
    }

    selList.setAuxiliaryR(leftR);
    selList.setAuxiliaryS(leftS);
    selList.setRowID(leftRowID);
  }


  /**
   * Rewrite a join predicate. We only support equal-join at this moment.
   *
   * @param predicate
   * @param leftS
   * @param rightS
   * @param targetM
   * @param targetX
   * @throws RewriteException
   */
  protected void rewriteJoinPred(Expr predicate, SelectionItem leftS,
                                 SelectionItem rightS, BigInteger targetM,
                                 BigInteger targetX) throws
          RewriteException {
    LOG.debug("Rewriting join predicate for " + predicate.toSql());

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

  /**
   * Rewrite a normal join predicate.
   *
   * @param normalBinPred
   * @param leftS
   * @param rightS
   * @param targetM
   * @param targetX
   * @throws RewriteException
   */
  protected void rewriteNorBinJoinPred(NormalBinPredicate normalBinPred,
                                       SelectionItem leftS, SelectionItem
                                               rightS, BigInteger targetM,
                                       BigInteger targetX) throws
          RewriteException {
    LOG.debug("Rewriting join predicate for " + normalBinPred.toSql());
    if (!normalBinPred.involveEncrytedCol())
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

    if (!leftField.getType().equals(Type.INT) || !rightField.getType().equals(Type.INT)) {
      UnSupportedException e = new UnSupportedException("Can not support " +
              "non-integer join attributes!");
      LOG.error("There is unsupported join condition!", e);
      throw e;
    }

    // EE mode
    if (leftField.involveEncrytedCol() && rightField.involveEncrytedCol()) {
      SdbColumnKey leftSColKey = leftS.getExpr().getSdbColKey();

      // The auxiliary update values p, q for the left field
      BigInteger[] pqLeft = SDBEncrypt.keyUpdateClient(leftExpr.getSdbColKey()
                      .getM(),
              targetM, leftSColKey.getM(), leftExpr.getSdbColKey().getX(), targetX,
              leftSColKey.getX(), prime1, prime2);

      // The auxiliary update values p, q for the right field
      BigInteger[] pqRight = SDBEncrypt.keyUpdateClient(rightExpr.getSdbColKey()
                      .getM(),
              targetM, rightS.getExpr().getSdbColKey().getM(), rightExpr.getSdbColKey()
                      .getX(), targetX,
              rightS.getExpr().getSdbColKey().getX(), prime1, prime2);


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
    } else {
      if (leftField.involveEncrytedCol()) {
        SdbColumnKey leftSColKey = leftS.getExpr().getSdbColKey();

        // The auxiliary update values p, q for the left field
        BigInteger[] pqLeft = SDBEncrypt.keyUpdateClient(leftExpr.getSdbColKey()
                        .getM(),
                targetM, leftSColKey.getM(), leftExpr.getSdbColKey().getX(), targetX,
                leftSColKey.getX(), prime1, prime2);

        // The auxiliary update values p, q for the right field
        BigInteger[] pqRight = SDBEncrypt.keyUpdateClient(BigInteger.ONE,
                targetM, rightS.getExpr().getSdbColKey().getM(), BigInteger.ZERO,
                targetX,
                rightS.getExpr().getSdbColKey().getX(), prime1, prime2);


        // The order must be:(field, auxiliaryS, p, q, n)
        Expr leftKeyUp = buildSdbKeyUpdateExpr(leftExpr, leftS.getExpr(), new
                        BigIntLiteral(pqLeft[0]),
                new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM,
                targetX);
        Expr rightKeyUp = buildSdbKeyUpdateExpr(rightExpr, rightS.getExpr(), new
                        BigIntLiteral(pqRight[0]),
                new BigIntLiteral(pqRight[1]), new BigIntLiteral(n), targetM,
                targetX);

        // Replace the original predicate
        normalBinPred.setLeftExpr(leftKeyUp);
        normalBinPred.setRightExpr(rightKeyUp);
      } else {
        SdbColumnKey leftSColKey = leftS.getExpr().getSdbColKey();

        // The auxiliary update values p, q for the left field
        BigInteger[] pqLeft = SDBEncrypt.keyUpdateClient(BigInteger.ONE,
                targetM, leftSColKey.getM(), BigInteger.ZERO, targetX,
                leftSColKey.getX(), prime1, prime2);

        // The auxiliary update values p, q for the right field
        BigInteger[] pqRight = SDBEncrypt.keyUpdateClient(rightExpr.getSdbColKey()
                        .getM(),
                targetM, rightS.getExpr().getSdbColKey().getM(), rightExpr.getSdbColKey()
                        .getX(), targetX,
                rightS.getExpr().getSdbColKey().getX(), prime1, prime2);


        // The order must be:(field, auxiliaryS, p, q, n)
        Expr leftKeyUp = buildSdbKeyUpdateExpr(leftExpr, leftS.getExpr(), new
                        BigIntLiteral(pqLeft[0]),
                new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM,
                targetX);
        Expr rightKeyUp = buildSdbKeyUpdateExpr(rightExpr, rightS.getExpr(), new
                        BigIntLiteral(pqRight[0]),
                new BigIntLiteral(pqRight[1]), new BigIntLiteral(n), targetM,
                targetX);

        // Replace the original predicate
        normalBinPred.setLeftExpr(leftKeyUp);
        normalBinPred.setRightExpr(rightKeyUp);
      }
    }
  }


  /**
   * Do key update for the selection columns after join/cartesian.
   *
   * @param expr
   * @param leftS
   * @param rightS
   * @param visitedTbl
   * @return
   * @throws UnSupportedException
   */
  protected Expr buildCartesianExpr(Expr expr, SelectionItem leftS, SelectionItem
          rightS, Set<String> visitedTbl) throws UnSupportedException {
    LOG.debug("Building cartesian expression for " + expr.toSql());
    if (expr instanceof FieldLiteral) {
      if (expr.involveEncrytedCol()) {
        FieldLiteral column = (FieldLiteral) expr;
        FieldLiteral rightSExpr = (FieldLiteral) rightS.getExpr();
        SdbCartesianExpr transformedCol = new SdbCartesianExpr();
        // This field is from the left side of the join
        if (visitedTbl.contains(column.getTblName())) {
          BigInteger ma = column.getSdbColKey().getM();
          BigInteger xa = column.getSdbColKey().getX();

          BigInteger ms = rightSExpr.getSdbColKey().getM();
          BigInteger xs = rightSExpr.getSdbColKey().getX();
          BigInteger auxiliaryP = SDBEncrypt.cartesianAuxiliaryP(xa, xs, totient);
          // Update the column key
          BigInteger[] colKey = SDBEncrypt.cartesianUpdateColyKey(ma, xa, ms,
                  auxiliaryP, n);

          transformedCol.addChild(column);
          transformedCol.addChild(rightSExpr);
          transformedCol.addChild(new BigIntLiteral(auxiliaryP));
          transformedCol.addChild(new BigIntLiteral(n));

          transformedCol.setAlias(column.getName());
          transformedCol.setSdbColKey(new SdbColumnKey(colKey[0], colKey[1]));
          transformedCol.setType(expr.getType());
          transformedCol.setReferredByList(column.getReferredByList());

          return transformedCol;
        }
        // This field is from the right side of the join
        else if (column.getTblName().equals(rightSExpr.getTblName())) {
          BigInteger ma = column.getSdbColKey().getM();
          BigInteger xa = column.getSdbColKey().getX();

          BigInteger ms = leftS.getExpr().getSdbColKey().getM();
          BigInteger xs = leftS.getExpr().getSdbColKey().getX();
          BigInteger auxiliaryP = SDBEncrypt.cartesianAuxiliaryP(xa, xs, totient);
          // Update the column key
          BigInteger[] colKey = SDBEncrypt.cartesianUpdateColyKey(ma, xa, ms,
                  auxiliaryP, n);

          transformedCol.addChild(column);
          transformedCol.addChild(leftS.getExpr());
          transformedCol.addChild(new BigIntLiteral(auxiliaryP));
          transformedCol.addChild(new BigIntLiteral(n));

          transformedCol.setAlias(column.getName());
          transformedCol.setSdbColKey(new SdbColumnKey(colKey[0], colKey[1]));
          transformedCol.setType(expr.getType());
          transformedCol.setReferredByList(column.getReferredByList());

          return transformedCol;
        }
      } else
        return expr;
    } else if (expr instanceof SdbCartesianExpr) {
      // It must be from the left side of the join and updated before
      SdbCartesianExpr cartesianExpr = (SdbCartesianExpr) expr;
      SdbCartesianExpr transformedCol = new SdbCartesianExpr();
      FieldLiteral rightSExpr = (FieldLiteral) rightS.getExpr();

      BigInteger ma = cartesianExpr.getSdbColKey().getM();
      BigInteger xa = cartesianExpr.getSdbColKey().getX();
      BigInteger ms = rightSExpr.getSdbColKey().getM();
      BigInteger xs = rightSExpr.getSdbColKey().getX();
      BigInteger auxiliaryP = SDBEncrypt.cartesianAuxiliaryP(xa, xs, totient);
      // Update the column key
      BigInteger[] colKey = SDBEncrypt.cartesianUpdateColyKey(ma, xa, ms,
              auxiliaryP, n);

      transformedCol.addChild(cartesianExpr);
      transformedCol.addChild(rightSExpr);
      transformedCol.addChild(new BigIntLiteral(auxiliaryP));
      transformedCol.addChild(new BigIntLiteral(n));

      transformedCol.setAlias(cartesianExpr.getAlias());
      transformedCol.setSdbColKey(new SdbColumnKey(colKey[0], colKey[1]));
      transformedCol.setType(expr.getType());
      transformedCol.setReferredByList(cartesianExpr.getReferredByList());

      return transformedCol;
    } else if (expr instanceof FunctionCallExpr) {
      FunctionCallExpr funCallExpr = (FunctionCallExpr) expr;
      FunctionParams funParams = funCallExpr.getFunctionParams();

      for (Expr funExpr : funParams.getExprs()) {
        for (int i = 0; i < funExpr.getChildren().size(); i++) {
          funExpr.setChild(i, buildCartesianExpr(funExpr.getChild(i), leftS, rightS,
                  visitedTbl));
        }
      }
    }

    // It is not a basic expr, we need to do recursive build
    for (int i = 0; i < expr.getChildren().size(); i++) {
      expr.setChild(i, buildCartesianExpr(expr.getChild(i), leftS, rightS,
              visitedTbl));
    }

    return expr;
  }

  /**
   * Perform rewrite for a inlinew view.
   *
   * @param inlineView
   * @throws RewriteException
   */
  protected void rewriteInLineViewRef(InLineViewRef inlineView)
          throws RewriteException {
    LOG.debug("Rewriting inline view " + inlineView.toSql());
    if (!inlineView.involveEncrytedCol())
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
    if (whereClause == null)
      return null;

    LOG.debug("Rewriting where clause " + whereClause.toSql());
    if (whereClause instanceof CompoundPredicate) {
      rewriteCompoundPredicate((CompoundPredicate) whereClause);
      return whereClause;
    } else if (whereClause instanceof NormalBinPredicate) {
      LOG.info("Rewriting NormalBinPredicate during rewriteWhereClause");
      Set<String> tbls = findAllTbls((NormalBinPredicate) whereClause);
      assert (tbls != null);
      if (tbls.size() < 1) {
        // No column involved in the where clause, no need to rewrite.
        return whereClause;
      } else if (tbls.size() == 1) {
        String tblName = (String) tbls.toArray()[0];

        FieldLiteral R = new FieldLiteral(tblName, ColumnDefinition
                .R_COLUMN_NAME, Type.INT, true, null);
        FieldLiteral S = new FieldLiteral(tblName, ColumnDefinition
                .S_COLUMN_NAME, Type.INT, true, null);

        R.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.R_COLUMN_NAME));
        S.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.S_COLUMN_NAME));

        return rewriteNorBinPredicate((NormalBinPredicate) whereClause, R, S);
      } else {
        UnSupportedException e = new UnSupportedException("Can not support " +
                "predicate involves columns from different tables!");
        LOG.error("There is unsupported predicates!", e);
        throw e;
      }
    } else if (whereClause instanceof LikePredicate) {
      LOG.info("Rewriting like predicate during rewriteWhereClause");
      return rewriteLikePredicate((LikePredicate) whereClause);
    }
    else {
      UnSupportedException e = new UnSupportedException("Can not support " +
              whereClause.getClass().getName());
      LOG.error("There is unsupported predicates!", e);
      throw e;
    }
  }

  /**
   * Rewrite the selection list.
   *
   * @param selList
   * @throws UnSupportedException
   */
  protected void rewriteSelList(SelectionList selList)
          throws UnSupportedException {

    LOG.debug("Rewriting selection list " + selList.toSql());

    boolean involveAggFunc = false;

    for (SelectionItem selItem : selList.getItemList()) {
      Expr expr = selItem.getExpr();

      if (expr instanceof NormalArithmeticExpr) {
        if (expr.involveEncrytedCol()) {
          // This rewrite is wrong if there exist cartesian transformation in the
          // arithmetic expression.
          if (expr.involveEncrytedCol()) {
            Set<String> tbls = findAllTbls(expr);
            assert (tbls != null);
            if (tbls.size() < 1) {
              continue;
            } else if (tbls.size() == 1) {

              String tblName = (String) tbls.toArray()[0];

              FieldLiteral S = new FieldLiteral(tblName, ColumnDefinition
                      .S_COLUMN_NAME, Type.INT, true, null);
              S.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition
                      .S_COLUMN_NAME));

              Expr rewrittenExpr = rewriteNorArithExpr((NormalArithmeticExpr) expr, S);
              rewrittenExpr.setReferredByList(expr.getReferredByList());
              selItem.setExpr(rewrittenExpr);
            } else {
              UnSupportedException e = new UnSupportedException("Cannot " +
                      "support " +
                      "arithmetic selection item with sensitive column where " +
                      "there are joins!");
              LOG.error("There is unsupported selection item!", e);
              throw e;
            }
          }
        }
      } else if (expr instanceof FunctionCallExpr) {
        FunctionCallExpr funCallExpr = (FunctionCallExpr) expr;
        FunctionParams funParams = funCallExpr.getFunctionParams();
        String funName = funCallExpr.getFunctionName().getName();
        // TODO: how to record all the aggregation functions?
        if (funName.equals(ParserConstant.FUNCTION_SUM) || funName.equals(ParserConstant.FUNCTION_COUNT)) {
          involveAggFunc = true;
        }

        // Currently, only
        if (expr.involveEncrytedCol()) {
          Set<String> tbls = new HashSet<>();

          List<Expr> exprs = funParams.getExprs();

          for (Expr subexpr : exprs) {
            tbls.addAll(findAllTbls(subexpr));
          }
          assert (tbls != null);
          if (tbls.size() < 1) {
            continue;
          } else if (tbls.size() == 1) {

            String tblName = (String) tbls.toArray()[0];

            FieldLiteral S = new FieldLiteral(tblName, ColumnDefinition
                    .S_COLUMN_NAME, Type.INT, true, null);
            S.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition
                    .S_COLUMN_NAME));
            Expr rewrittenExpr = rewriteFunCallExpr((FunctionCallExpr) expr, S);
            rewrittenExpr.setReferredByList(expr.getReferredByList());
            selItem.setExpr(rewrittenExpr);

          } else {
            UnSupportedException e = new UnSupportedException("Cannot support " +
                    "function call with sensitive column and arithmetic " +
                    "expression " +
                    "where there are joins!");
            LOG.error("There is unsupported selection item!", e);
            throw e;
          }
        }
      }
    }

    // If involve aggregation function, we just keep the first saw rowid, r, s.
    if (involveAggFunc) {
      SdbArithmeticExpr sdbTransformExprRowID = new SdbArithmeticExpr(SdbOperator.SDB_FIRST);
      sdbTransformExprRowID.addChild(selList.getRowID().getExpr());
      sdbTransformExprRowID.setSdbColKey(selList.getRowID().getExpr()
              .getSdbColKey());

      SdbArithmeticExpr sdbTransformExprR = new SdbArithmeticExpr(SdbOperator.SDB_FIRST);
      sdbTransformExprR.addChild(selList.getAuxiliaryR().getExpr());
      sdbTransformExprR.setSdbColKey(selList.getAuxiliaryR().getExpr()
              .getSdbColKey());

      SdbArithmeticExpr sdbTransformExprS = new SdbArithmeticExpr(SdbOperator.SDB_FIRST);
      sdbTransformExprS.addChild(selList.getAuxiliaryS().getExpr());
      sdbTransformExprS.setSdbColKey(selList.getAuxiliaryS().getExpr()
              .getSdbColKey());

      selList.getRowID().setExpr(sdbTransformExprRowID);
      selList.getAuxiliaryR().setExpr(sdbTransformExprR);
      selList.getAuxiliaryS().setExpr(sdbTransformExprS);
    }

    // Propagate the new Column keys to all its ascendants
    for (SelectionItem selItem : selList.getItemList()) {
      if (selItem.involveEncrytedCol()) {
        selItem.getExpr().notifyAllFields();
      }
    }
  }


  /**
   * Rewrite the group by expression.
   *
   * @param groupExprs
   * @throws UnSupportedException
   */
  protected void rewriteGroupByExprs(List<Expr> groupExprs) throws
          UnSupportedException {
    if (groupExprs == null)
      return;

    Set<String> tbls = new HashSet<>();

    for (Expr expr : groupExprs) {
      tbls.addAll(findAllTbls(expr));
    }

    if (tbls.size() < 1) {
      // No column involved in the group by clause, no need to rewrite.
      return;
    } else if (tbls.size() == 1) {
      String tblName = (String) tbls.toArray()[0];
      FieldLiteral S = new FieldLiteral(tblName, ColumnDefinition
              .S_COLUMN_NAME, Type.INT, true, null);

      S.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.S_COLUMN_NAME));

      for (int i = 0; i < groupExprs.size(); i++) {
        if (groupExprs.get(i).involveEncrytedCol()) {
          if (groupExprs.get(i) instanceof FieldLiteral) {
            BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
            BigInteger targetX = BigInteger.ZERO;

            BigInteger[] pqLeft = SDBEncrypt.keyUpdateClient(groupExprs.get(i)
                            .getSdbColKey
                                    ().getM(),
                    targetM, S.getSdbColKey().getM(), groupExprs.get(i).getSdbColKey()
                            .getX(), targetX,
                    S.getSdbColKey().getX(), prime1, prime2);

            groupExprs.set(i, buildSdbKeyUpdateExpr(groupExprs.get(i), S, new
                            BigIntLiteral
                            (pqLeft[0]),
                    new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM,
                    targetX));

          } else {
            UnSupportedException e = new UnSupportedException("Can not support " +
                    groupExprs.get(i).getClass().getName());
            LOG.error("There is unsupported group by attributes!", e);
            throw e;
          }
        }
      }
    } else {
      UnSupportedException e = new UnSupportedException("Can not support " +
              "group by clause involves columns from different tables!");
      LOG.error("There is unsupported group by clause!", e);
      throw e;
    }


  }

  /**
   * Rewrite the having expression.
   *
   * @param havingExpr
   * @throws UnSupportedException
   */
  protected void rewriteHavingExpr(Expr havingExpr) throws
          UnSupportedException {
    // TODO Auto-generated method stub
  }


  /**
   * Rewrite the compound predicate.
   *
   * @param compoundPred
   * @throws UnSupportedException
   */
  protected void rewriteCompoundPredicate(CompoundPredicate compoundPred) throws
          UnSupportedException {
    // No SDB encrypted column
    if (!compoundPred.involveEncrytedCol())
      return;

    LOG.debug("Rewriting compounding predicate " + compoundPred.toSql());

    Expr leftPred = compoundPred.getLeftPred();
    Expr rightPred = compoundPred.getRightPred();


    if (leftPred instanceof CompoundPredicate) {
      rewriteCompoundPredicate((CompoundPredicate) leftPred);
    } else if (leftPred instanceof NormalBinPredicate) {

      Set<String> tbls = findAllTbls((NormalBinPredicate) leftPred);
      assert (tbls != null);

      if (tbls.size() == 1) {
        String tblName = (String) tbls.toArray()[0];

        FieldLiteral R = new FieldLiteral(tblName, ColumnDefinition
                .R_COLUMN_NAME, Type.INT, true, null);
        FieldLiteral S = new FieldLiteral(tblName, ColumnDefinition
                .S_COLUMN_NAME, Type.INT, true, null);

        R.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.R_COLUMN_NAME));
        S.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.S_COLUMN_NAME));

        compoundPred.setLeftPred(rewriteNorBinPredicate((NormalBinPredicate)
                leftPred, R, S));
      } else {
        UnSupportedException e = new UnSupportedException("Can not support " +
                "predicate involves columns from different tables!");
        LOG.error("There is unsupported predicates!", e);
        throw e;
      }

    }

    if (rightPred instanceof CompoundPredicate) {
      rewriteCompoundPredicate((CompoundPredicate) rightPred);
    } else if (rightPred instanceof NormalBinPredicate) {
      Set<String> tbls = findAllTbls((NormalBinPredicate) rightPred);
      assert (tbls != null);

      if (tbls.size() == 1) {
        String tblName = (String) tbls.toArray()[0];

        FieldLiteral R = new FieldLiteral(tblName, ColumnDefinition
                .R_COLUMN_NAME, Type.INT, true, null);
        FieldLiteral S = new FieldLiteral(tblName, ColumnDefinition
                .S_COLUMN_NAME, Type.INT, true, null);

        R.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.R_COLUMN_NAME));
        S.setSdbColKey(getTableColumnKey(tblName, ColumnDefinition.S_COLUMN_NAME));

        compoundPred.setRightPred(rewriteNorBinPredicate((NormalBinPredicate)
                rightPred, R, S));
      } else {
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

    if (expr instanceof NormalArithmeticExpr) {
      tbls.addAll(findAllTbls((NormalArithmeticExpr) expr));
    } else if (expr instanceof FieldLiteral) {
      String tblName = findTbl((FieldLiteral) expr);
      if (tblName != null)
        tbls.add(tblName);
    } else if (expr instanceof NormalBinPredicate) {
      tbls.addAll(findAllTbls((NormalBinPredicate) expr));
    } else if (expr instanceof SdbCartesianExpr) {
      tbls.addAll(findAllTbls((SdbCartesianExpr) expr));
    }

    return tbls;
  }

  /**
   * Find all tables involve in a normal arithmetic expression.
   *
   * @param norArithExpr
   * @return
   */
  private Set<String> findAllTbls(NormalArithmeticExpr norArithExpr) {
    Set<String> tbls = new HashSet<>();

    Expr leftExpr = norArithExpr.getLeftExpr();
    Expr rightExpr = norArithExpr.getRightExpr();

    if (leftExpr instanceof NormalArithmeticExpr)
      tbls.addAll(findAllTbls((NormalArithmeticExpr) leftExpr));
    else if (leftExpr instanceof FieldLiteral) {
      String tblName = findTbl((FieldLiteral) leftExpr);
      if (tblName != null)
        tbls.add(tblName);
    } else if (leftExpr instanceof SdbCartesianExpr) {
      tbls.addAll(findAllTbls((SdbCartesianExpr) leftExpr));
    }

    if (rightExpr instanceof NormalArithmeticExpr)
      tbls.addAll(findAllTbls((NormalArithmeticExpr) rightExpr));
    else if (rightExpr instanceof FieldLiteral) {
      String tblName = findTbl((FieldLiteral) rightExpr);
      if (tblName != null)
        tbls.add(tblName);
    } else if (rightExpr instanceof SdbCartesianExpr) {
      tbls.addAll(findAllTbls((SdbCartesianExpr) rightExpr));
    }

    return tbls;
  }


  /**
   * Find all tables involve in a binary predicate.
   *
   * @param norBinPred
   * @return
   */
  private Set<String> findAllTbls(NormalBinPredicate norBinPred) {
    Set<String> tbls = new HashSet<>();

    Expr leftExpr = norBinPred.getLeftExpr();
    Expr rightExpr = norBinPred.getRightExpr();

    tbls.addAll(findAllTbls(leftExpr));
    tbls.addAll(findAllTbls(rightExpr));

    return tbls;
  }

  /**
   * Find all tables involve in a cartesian expression.
   *
   * @param cartesianExpr
   * @return
   */
  private Set<String> findAllTbls(SdbCartesianExpr cartesianExpr) {
    Set<String> tbls = new HashSet<>();

    for (Expr expr : cartesianExpr.getChildren()) {
      tbls.addAll(findAllTbls(expr));
    }

    return tbls;
  }

  /**
   * Find table for a column.
   *
   * @param fieldLiteral
   * @return
   */
  private String findTbl(FieldLiteral fieldLiteral) {
    // In a Cartesian transformation, S can be from different tables.
    // Because we require all sensitive columns are from the same table, to make it
    // work, we need to ignore them.
    //    if (fieldLiteral.getName().equals(ColumnDefinition.S_COLUMN_NAME))
    //      return null;

    String tblName = fieldLiteral.getTblName();
    return tblName;
  }

  /**
   * Rewrite a function call expression.
   *
   * @param funCallExpr
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteFunCallExpr(FunctionCallExpr funCallExpr, Expr S) throws
          UnSupportedException {
    FunctionName funName = funCallExpr.getFunctionName();

    if (funName.getName().equals(ParserConstant.FUNCTION_COUNT)) {
      return funCallExpr;
    } else if (funName.getName().equals(ParserConstant.FUNCTION_SUM)) {
      FunctionParams functionParams = funCallExpr.getFunctionParams();
      // The sum function can only has one parameter expression
      assert (functionParams.getExprs().size() == 1);

      Expr expr = functionParams.getExprs().get(0);

      BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
      BigInteger targetX = BigInteger.ZERO;

      BigInteger[] pqLeft = SDBEncrypt.keyUpdateClient(expr.getSdbColKey().getM(),
              targetM,
              S.getSdbColKey().getM(), expr.getSdbColKey().getX(), targetX, S.getSdbColKey
                      ().getX(), prime1, prime2);

      functionParams.getExprs().set(0, buildSdbKeyUpdateExpr(expr, S, new
                      BigIntLiteral(pqLeft[0]),
              new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM, targetX));
      functionParams.getExprs().get(0).setSdbColKey(new SdbColumnKey(targetM, targetX));
      functionParams.getExprs().add(new BigIntLiteral(n));

      funName.setName(SdbOperator.SDB_SUM.toString());
      funCallExpr.setName(funName);
      funCallExpr.setFunctionParams(functionParams);
      funCallExpr.setSdbColKey(new SdbColumnKey(targetM, targetX));
      funCallExpr.setType(functionParams.getExprs().get(0).getType());

      return funCallExpr;
    } else {
      UnSupportedException e = new UnSupportedException("Unsupported function " +
              funName);
      LOG.error("There is unsupported function call!", e);
      throw e;
    }
  }

  /**
   * TODO: We assume the arithmetic expression cannot have columns from different
   * tables.
   *
   * @param arithExpr
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteNorArithExpr(NormalArithmeticExpr arithExpr, Expr S)
          throws UnSupportedException {
    LOG.debug("Rewriting normal arithmetic expression " + arithExpr.toSql());

    Expr leftExpr = arithExpr.getLeftExpr();
    Expr rightExpr = arithExpr.getRightExpr();

    if (leftExpr instanceof NormalArithmeticExpr) {
      arithExpr.setLeftExpr(rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S));
      leftExpr = arithExpr.getLeftExpr();
    }
    if (rightExpr instanceof NormalArithmeticExpr) {
      arithExpr.setRightExpr(rewriteNorArithExpr((NormalArithmeticExpr) rightExpr,
              S));
      rightExpr = arithExpr.getRightExpr();
    }

    // EE mode
    if (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol()) {
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
    else if (leftExpr.involveEncrytedCol() || rightExpr.involveEncrytedCol()) {
      switch (arithExpr.getOp()) {
        case MULTIPLY:
          // EC mode only support Integer and Float type currently
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral ||
                  leftExpr instanceof FloatLiteral || rightExpr instanceof FloatLiteral) {
            return rewriteMultiplyEC(leftExpr, rightExpr);
          }
          //EP mode
          else {
            return rewriteMultiplyEP(leftExpr, rightExpr, S);
          }
        case ADD:
          // EC mode
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral ||
                  leftExpr instanceof FloatLiteral || rightExpr instanceof FloatLiteral) {
            return rewriteAddEC(leftExpr, rightExpr, S);
          }
          // EP mode
          else {
            return rewriteAddEP(leftExpr, rightExpr, S);
          }
        case SUBTRACT:
          //EC mode
          if (leftExpr instanceof IntLiteral || rightExpr instanceof IntLiteral ||
                  leftExpr instanceof FloatLiteral || rightExpr instanceof FloatLiteral) {
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
  protected Expr rewriteAddEE(Expr leftExpr, Expr rightExpr, Expr S) throws
          UnSupportedException {
    assert (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol());

    LOG.debug("Rewriting EE mode addition");

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr(SdbOperator.SDB_ADD);

    ScalarType leftType = (ScalarType) leftExpr.getType();
    ScalarType rightType = (ScalarType) rightExpr.getType();

    if ((leftType.getType() == PrimitiveType.INT || leftType.getType() == PrimitiveType.DECIMAL) &&
            (rightType.getType() == PrimitiveType.INT || rightType.getType() == PrimitiveType.DECIMAL)) {

      if (leftType.getType() == PrimitiveType.INT && rightType.getType() == PrimitiveType.INT) {
        sdbArithmeticExpr.setType(Type.INT);
      }

      // One of the column is with decimal type.
      // Need to take care of the scale carefully, since they have been multiplied by
      // their scale before being encrypted.
      else if (leftType.getType() == PrimitiveType.DECIMAL && rightType.getType() == PrimitiveType.DECIMAL) {
        int leftScale = leftType.getScale();
        int rightScale = rightType.getScale();
        int scale;

        int precision = leftType.getPrecision() > rightType.getPrecision() ? leftType.getPrecision() : rightType.getPrecision();

        // We scale the one with the less scale number.
        if (leftScale > rightScale) {
          int ratio = leftScale - rightScale;
          scale = leftScale;
          rightExpr = rewriteMultiplyEC(rightExpr, new IntLiteral((int) Math.pow(10, ratio)));
          rightExpr.setType(ScalarType.createDecimalType(precision, scale));
        } else if (leftScale < rightScale) {
          int ratio = rightScale - leftScale;
          scale = rightScale;
          leftExpr = rewriteMultiplyEC(leftExpr, new IntLiteral((int) Math.pow(10, ratio)));
          leftExpr.setType(ScalarType.createDecimalType(precision, scale));
        } else {
          scale = leftScale;
        }

        sdbArithmeticExpr.setType(ScalarType.createDecimalType(precision, scale));
      } else {
        int scale;
        int precision;
        // We scale the one with integer type.
        if (leftType.getType() == PrimitiveType.DECIMAL) {
          scale = leftType.getScale();
          precision = leftType.getPrecision();
          rightExpr = rewriteMultiplyEC(rightExpr, new IntLiteral((int) Math.pow(10, scale)));
        } else {
          scale = rightType.getScale();
          precision = rightType.getPrecision();
          leftExpr = rewriteMultiplyEC(leftExpr, new IntLiteral((int) Math.pow(10, scale)));
        }

        sdbArithmeticExpr.setType(ScalarType.createDecimalType(precision, scale));
      }

      Expr leftKeyUp;
      Expr rightKeyUp;
      BigInteger targetM;
      BigInteger targetX;

      // If not equal, update to the same column key.
      if (!leftExpr.getSdbColKey().equals(rightExpr.getSdbColKey())) {
        targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
        targetX = SDBEncrypt.generatePositiveRand(prime1, prime2);

        // What if we only update one side? Does it affect the security level?
        BigInteger[] pqLeft = SDBEncrypt.keyUpdateClient(leftExpr.getSdbColKey()
                        .getM(),
                targetM, S.getSdbColKey().getM(), leftExpr.getSdbColKey().getX(), targetX,


                S.getSdbColKey().getX(), prime1, prime2);

        BigInteger[] pqRight = SDBEncrypt.keyUpdateClient(rightExpr.getSdbColKey()
                        .getM(),
                targetM, S.getSdbColKey().getM(), rightExpr.getSdbColKey().getX(), targetX,
                S.getSdbColKey().getX(), prime1, prime2);

        leftKeyUp = buildSdbKeyUpdateExpr(leftExpr, S, new BigIntLiteral
                        (pqLeft[0]),
                new BigIntLiteral(pqLeft[1]), new BigIntLiteral(n), targetM, targetX);


        //        leftKeyUp = leftExpr;

        rightKeyUp = buildSdbKeyUpdateExpr(rightExpr, S, new BigIntLiteral
                        (pqRight[0]),
                new BigIntLiteral(pqRight[1]), new BigIntLiteral(n), targetM, targetX);
      } else {
        leftKeyUp = leftExpr;
        rightKeyUp = rightExpr;
        targetM = leftExpr.getSdbColKey().getM();
        targetX = leftExpr.getSdbColKey().getX();
      }


      sdbArithmeticExpr.addChild(leftKeyUp);
      sdbArithmeticExpr.addChild(rightKeyUp);
      sdbArithmeticExpr.addChild(new BigIntLiteral(n));
      sdbArithmeticExpr.setSdbColKey(new SdbColumnKey(targetM, targetX));

      return sdbArithmeticExpr;
    } else {
      throw new UnSupportedException("Unsupported Data type in addition!");
    }
  }

  /**
   * Rewrite addition for EP mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteAddEP(Expr leftExpr, Expr rightExpr, Expr S) throws
          UnSupportedException {
    // only one involves encrypted column
    LOG.debug("Rewriting EP mode addition");

    assert (leftExpr.involveEncrytedCol() ^ rightExpr.involveEncrytedCol());

    Expr E;
    Expr P;
    if (leftExpr.involveEncrytedCol()) {
      E = leftExpr;
      P = rightExpr;
    } else {
      E = rightExpr;
      P = leftExpr;
    }

    BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
    BigInteger targetX = SDBEncrypt.generatePositiveRand(prime1, prime2);

    Expr pKeyUp = keyUpdatePlainCol(P, S, targetM, targetX);

    //    BigInteger[] pq = SDBEncrypt.keyUpdateClient(E.getSdbColKey().getM(),
    //            targetM, S.getSdbColKey().getM(), E.getSdbColKey().getX(), targetX,
    //            S.getSdbColKey().getX(), prime1, prime2);

    return rewriteAddEE(pKeyUp, E, S);
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

    LOG.debug("Rewriting EC mode addition");

    if (leftExpr instanceof IntLiteral || leftExpr instanceof FloatLiteral) {
      E = rightExpr;
      C = leftExpr;
    } else if (rightExpr instanceof IntLiteral || rightExpr instanceof FloatLiteral) {
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
  protected Expr rewriteSubtractEE(Expr leftExpr, Expr rightExpr, Expr S) throws
          UnSupportedException {
    LOG.debug("Rewriting EE mode subtraction");

    assert (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol());
    BigInteger inverseM = rightExpr.getSdbColKey().getM().multiply(n.subtract
            (BigInteger.ONE)).mod(n);

    SdbColumnKey colKey = new SdbColumnKey(inverseM, rightExpr.getSdbColKey().getX());
    rightExpr.setSdbColKey(colKey);

    return rewriteAddEE(leftExpr, rightExpr, S);
  }

  /**
   * Rewrite subtraction for EP mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteSubtractEP(Expr leftExpr, Expr rightExpr, Expr S) throws UnSupportedException {
    LOG.debug("Rewriting EP mode subtraction");
    // only one involves encrypted column
    assert (leftExpr.involveEncrytedCol() ^ rightExpr.involveEncrytedCol());


    BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
    BigInteger targetX = SDBEncrypt.generatePositiveRand(prime1, prime2);

    // We need to inverse the value of the right expression
    if (leftExpr.involveEncrytedCol()) {
      // P is the right expression. Inverse P.
      rightExpr = keyUpdateInversedPlainCol(rightExpr, S, targetM, targetX);
      BigInteger[] pq = SDBEncrypt.keyUpdateClient(leftExpr.getSdbColKey().getM(),
              targetM, S.getSdbColKey().getM(), leftExpr.getSdbColKey().getX(), targetX,
              S.getSdbColKey().getX(), prime1, prime2);
      leftExpr = buildSdbKeyUpdateExpr(leftExpr, S, new BigIntLiteral(pq[0]),
              new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);
    } else {
      // P is the left expression.
      leftExpr = keyUpdatePlainCol(leftExpr, S, targetM, targetX);
      // Inverse E expression.
      BigInteger inverseM = rightExpr.getSdbColKey().getM().multiply(n.subtract
              (BigInteger.ONE)).mod(n);
      BigInteger[] pq = SDBEncrypt.keyUpdateClient(inverseM,
              targetM, S.getSdbColKey().getM(), rightExpr.getSdbColKey().getX(),
              targetX,
              S.getSdbColKey().getX(), prime1, prime2);
      rightExpr = buildSdbKeyUpdateExpr(rightExpr, S, new BigIntLiteral(pq[0]),
              new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);
    }

    return rewriteAddEE(leftExpr, rightExpr, S);
  }

  /**
   * Rewrite subtraction for EC mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteSubtractEC(Expr leftExpr, Expr rightExpr, Expr S) throws
          UnSupportedException {
    LOG.debug("Rewriting EC mode subtraction");
    Expr SC;
    if (leftExpr instanceof IntLiteral || leftExpr instanceof FloatLiteral) {
      SC = rewriteMultiplyEC(S, leftExpr);
      return rewriteSubtractEE(SC, rightExpr, S);
    } else if (rightExpr instanceof IntLiteral || rightExpr instanceof FloatLiteral) {
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
  protected Expr rewriteMultiplyEE(Expr leftExpr, Expr rightExpr) throws UnSupportedException {
    LOG.debug("Rewriting EE mode multiplication");
    assert (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol());

    if (!(leftExpr.getType() instanceof ScalarType) || !(rightExpr.getType()
            instanceof ScalarType)) {
      throw new UnSupportedException("Unsupported Data type in multiplication!");
    }

    ScalarType leftType = (ScalarType) leftExpr.getType();
    ScalarType rightType = (ScalarType) rightExpr.getType();

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr(SdbOperator.SDB_MUL);

    if ((leftType.getType() == PrimitiveType.INT || leftType.getType() == PrimitiveType.DECIMAL) &&
            (rightType.getType() == PrimitiveType.INT || rightType.getType() == PrimitiveType.DECIMAL)) {

      if (leftType.getType() == PrimitiveType.INT && rightType.getType() == PrimitiveType.INT) {
        sdbArithmeticExpr.setType(Type.INT);
      }

      // One of the column is with decimal type.
      // Need to take care of the scale carefully, since they have been multiplied by
      // their scale.
      else if (leftType.getType() == PrimitiveType.DECIMAL && rightType.getType() == PrimitiveType.DECIMAL) {
        int scale = leftType.getScale() * rightType.getScale();
        int precision = leftType.getPrecision() > rightType.getPrecision() ? leftType.getPrecision() : rightType.getPrecision();

        sdbArithmeticExpr.setType(ScalarType.createDecimalType(precision, scale));
      } else {
        int scale;
        int precision;
        if (leftType.getType() == PrimitiveType.DECIMAL) {
          scale = leftType.getScale();
          precision = leftType.getPrecision();
        } else {
          scale = rightType.getScale();
          precision = rightType.getPrecision();
        }

        sdbArithmeticExpr.setType(ScalarType.createDecimalType(precision, scale));
      }

      BigInteger m = leftExpr.getSdbColKey().getM().multiply(rightExpr.getSdbColKey().getM
              ()).mod(n);

      BigInteger x = leftExpr.getSdbColKey().getX().add(rightExpr.getSdbColKey()
              .getX()).mod(totient);

      SdbColumnKey colKey = new SdbColumnKey(m, x);

      sdbArithmeticExpr.addChild(leftExpr);
      sdbArithmeticExpr.addChild(rightExpr);
      sdbArithmeticExpr.addChild(new BigIntLiteral(n));
      sdbArithmeticExpr.setSdbColKey(colKey);

      return sdbArithmeticExpr;
    } else {
      throw new UnSupportedException("Unsupported Data type in multiplication!");
    }
  }

  /**
   * Rewrite multiplication for EP mode. Assume columns are from the same table.
   *
   * @param leftExpr
   * @param rightExpr
   * @param S
   * @return
   */
  protected Expr rewriteMultiplyEP(Expr leftExpr, Expr rightExpr, Expr S) throws UnSupportedException {
    LOG.debug("Rewriting EP mode multiplication");
    // only one involves encrypted column
    assert (leftExpr.involveEncrytedCol() ^ rightExpr.involveEncrytedCol());

    Expr E;
    Expr P;
    if (leftExpr.involveEncrytedCol()) {
      E = leftExpr;
      P = rightExpr;
    } else {
      E = rightExpr;
      P = leftExpr;
    }

    // Need to do key update for the unencrypted expr
    BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
    BigInteger targetX = SDBEncrypt.generatePositiveRand(prime1, prime2);

    Expr pKeyUp = keyUpdatePlainCol(P, S, targetM, targetX);

    return rewriteMultiplyEE(E, pKeyUp);
  }

  protected Expr rewriteMultiplyEC(Expr leftExpr, Expr rightExpr) throws
          UnSupportedException {
    LOG.debug("Rewriting EC mode multiplication");
    Expr E;
    Expr C;

    if (leftExpr instanceof IntLiteral || leftExpr instanceof FloatLiteral) {
      E = rightExpr;
      C = leftExpr;
    } else if (rightExpr instanceof IntLiteral || rightExpr instanceof FloatLiteral) {
      E = leftExpr;
      C = rightExpr;
    } else {
      throw new UnSupportedException("Unsupported Data Type in EC mode " +
              "multiplication!");
    }

    // Scale = 0 if it is an integer
    int scale = 0;
    BigInteger cValue = null;
    if (C instanceof IntLiteral) {
      cValue = BigInteger.valueOf(((IntLiteral) C).getValue());
    }
    // Scale the float data to be an integer.
    else if (C instanceof FloatLiteral) {
      float valueF = ((FloatLiteral) C).getValue();

      String[] splitter = String.valueOf(valueF).split("\\.");
      scale = splitter[1].length();

      assert (scale >= 1);
      long valueL = (long) (valueF * Math.pow(10, scale));
      cValue = BigInteger.valueOf(valueL);
    }

    // For EC multiplication, we only need to multiply the m part of column key
    BigInteger m = cValue.multiply(E.getSdbColKey().getM()).mod(n);
    BigInteger x = E.getSdbColKey().getX();

    SdbColumnKey colKey = new SdbColumnKey(m, x);

    Expr resultExpr;

    if (E instanceof FieldLiteral) {
      resultExpr = new FieldLiteral((FieldLiteral) E);

    } else if (E instanceof SdbArithmeticExpr) {
      resultExpr = new SdbArithmeticExpr((SdbArithmeticExpr) E);
    } else if (E instanceof SdbKeyUpdateExpr) {
      resultExpr = new SdbKeyUpdateExpr((SdbKeyUpdateExpr) E);
    } else {
      throw new UnSupportedException("Unsupported Expression " + E.getClass()
              .getCanonicalName() + " in EC mode multiplication!");
    }

    resultExpr.setSdbColKey(colKey);

    // It will become a Decimal type from now on.
    if (scale >= 1) {
      if (((ScalarType) E.getType()).getScale() > 0)
        resultExpr.setType(ScalarType.createDecimalType(ScalarType.DEFAULT_PRECISION, scale + ((ScalarType) E.getType()).getScale()));
      else
        resultExpr.setType(ScalarType.createDecimalType(ScalarType.DEFAULT_PRECISION, scale));
    }

    return resultExpr;
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
    LOG.debug("Building key update expression for plain column" + P.toSql());
    BigInteger pM = BigInteger.ONE;
    BigInteger pX = BigInteger.ZERO;

    BigInteger[] pq = SDBEncrypt.keyUpdateClient(pM, targetM, S.getSdbColKey().getM()
            , pX,
            targetX, S.getSdbColKey().getX(), prime1, prime2);

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
    LOG.debug("Building key update inverse expression for plain column" + P.toSql());

    BigInteger pM = n.subtract(BigInteger.ONE);
    BigInteger pX = BigInteger.ZERO;

    BigInteger[] pq = SDBEncrypt.keyUpdateClient(pM, targetM, S.getSdbColKey().getM(),
            pX, targetX, S.getSdbColKey().getX(), prime1, prime2);

    return buildSdbKeyUpdateExpr(P, S, new BigIntLiteral(pq[0]),
            new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM, targetX);

  }

  /**
   * Build a key update expression.
   *
   * @param expr
   * @param S
   * @param p
   * @param q
   * @param n
   * @param targetM
   * @param targetX
   * @return
   */
  private Expr buildSdbKeyUpdateExpr(Expr expr, Expr S, Expr p, Expr q, Expr n,
                                     BigInteger targetM, BigInteger targetX) {
    LOG.debug("Building key update expression for column" + expr.toSql());

    SdbKeyUpdateExpr keyUpdateExpr;

    if (expr.involveEncrytedCol())
      keyUpdateExpr = new SdbKeyUpdateExpr(SdbKeyUpOperator.SDB_KEYUP);
    else
      keyUpdateExpr = new SdbKeyUpdateExpr(SdbKeyUpOperator.SDB_KEYUP_PLAIN);

    keyUpdateExpr.addChild(expr);
    keyUpdateExpr.addChild(S);
    keyUpdateExpr.addChild(p);
    keyUpdateExpr.addChild(q);
    keyUpdateExpr.addChild(n);

    keyUpdateExpr.setType(expr.getType());
    keyUpdateExpr.setSdbColKey(new SdbColumnKey(targetM, targetX));

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
    LOG.debug("Rewriting normal binary predicate " + normalBinPred.toSql());

    // No SDB encrypted column.
    if (!normalBinPred.involveEncrytedCol())
      return normalBinPred;

    Expr leftExpr = normalBinPred.getLeftExpr();
    Expr rightExpr = normalBinPred.getRightExpr();

    Expr subtractExpr;
    Expr multiplyExpr;

    BigInteger targetM = BigInteger.ONE;
    BigInteger targetX = BigInteger.ZERO;

    Expr keyUpdateExpr = null;
    Expr compareExpr = new SdbComparisonExpr(normalBinPred.getOp());

    // EE mode
    if (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol()) {
      if (leftExpr instanceof NormalArithmeticExpr) {
        leftExpr = rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S);
      }

      if (rightExpr instanceof NormalArithmeticExpr) {
        rightExpr = rewriteNorArithExpr((NormalArithmeticExpr) rightExpr, S);
      }

      subtractExpr = rewriteSubtractEE(leftExpr, rightExpr, S);
      multiplyExpr = rewriteMultiplyEE(R, subtractExpr);

      BigInteger[] pq = SDBEncrypt.keyUpdateClient(multiplyExpr.getSdbColKey().getM(),
              targetM, S.getSdbColKey().getM(), multiplyExpr.getSdbColKey().getX(),
              targetX, S.getSdbColKey().getX(), prime1, prime2);

      keyUpdateExpr = buildSdbKeyUpdateExpr(multiplyExpr, S, new
              BigIntLiteral(pq[0]), new BigIntLiteral(pq[1]), new
              BigIntLiteral(n), targetM, targetX);

    } else if (leftExpr.involveEncrytedCol() || rightExpr.involveEncrytedCol
            ()) {
      // EC mode

      if (leftExpr instanceof IntLiteral || leftExpr instanceof FloatLiteral ||
              rightExpr instanceof IntLiteral || rightExpr instanceof FloatLiteral) {
        if (leftExpr instanceof NormalArithmeticExpr) {
          leftExpr = rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S);
        }

        if (rightExpr instanceof NormalArithmeticExpr) {
          rightExpr = rewriteNorArithExpr((NormalArithmeticExpr) rightExpr, S);
        }

        subtractExpr = rewriteSubtractEC(leftExpr, rightExpr, S);
        multiplyExpr = rewriteMultiplyEE(R, subtractExpr);

        BigInteger[] pq = SDBEncrypt.keyUpdateClient(multiplyExpr.getSdbColKey().getM(),
                targetM, S.getSdbColKey().getM(), multiplyExpr.getSdbColKey().getX(),
                targetX, S.getSdbColKey().getX(), prime1, prime2);

        keyUpdateExpr = buildSdbKeyUpdateExpr(multiplyExpr, S, new
                BigIntLiteral(pq[0]), new BigIntLiteral(pq[1]), new
                BigIntLiteral(n), targetM, targetX);
      }

      // EP mode
      else if (leftExpr instanceof FieldLiteral || rightExpr instanceof
              FieldLiteral) {
        if (leftExpr instanceof NormalArithmeticExpr) {
          leftExpr = rewriteNorArithExpr((NormalArithmeticExpr) leftExpr, S);
        }

        if (rightExpr instanceof NormalArithmeticExpr) {
          rightExpr = rewriteNorArithExpr((NormalArithmeticExpr) rightExpr, S);
        }

        subtractExpr = rewriteSubtractEP(leftExpr, rightExpr, S);
        multiplyExpr = rewriteMultiplyEE(R, subtractExpr);

        BigInteger[] pq = SDBEncrypt.keyUpdateClient(multiplyExpr.getSdbColKey().getM(),
                targetM, S.getSdbColKey().getM(), multiplyExpr.getSdbColKey().getX(),
                targetX, S.getSdbColKey().getX(), prime1, prime2);

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

  private Expr rewriteLikePredicate(LikePredicate likePred) {
    if(!likePred.involveEncrytedCol())
      return likePred;

    SdbLikeExpr expr = new SdbLikeExpr();

    assert(likePred.getColumn() instanceof FieldLiteral);
    assert(likePred.getPattern() instanceof StringLiteral);

    FieldLiteral column = (FieldLiteral) likePred.getColumn();
    StringLiteral keyword = (StringLiteral) likePred.getPattern();

    expr.addChild(column);
    expr.addChild(keyword);

    SecretKey pubKey = column.getSearchColKey().getPubKey();

    StringLiteral pubKeyEncoded = new StringLiteral(Base64.encodeBase64String(pubKey.getEncoded()));

    expr.addChild(pubKeyEncoded);

    return expr;
  }

  private SdbColumnKey getTableColumnKey(String tblName, String colName) {
    LOG.debug("Getting column key for column " + tblName + "." + colName);

    SdbColumnKey colKey = null;
    String key = tblName + colName;

    if (colKeyMap.containsKey(key)) {
      colKey = colKeyMap.get(key);
    } else {
      for (TableMeta tableMeta : dbMeta.getTbls()) {
        if (tableMeta.getTblName().equals(tblName)) {
          for (ColumnMeta columnMeta : tableMeta.getCols()) {
            if (columnMeta.getColName().equals(colName)) {
              BigInteger m = new BigInteger(columnMeta.getM());
              BigInteger x = new BigInteger(columnMeta.getX());
              colKey = new SdbColumnKey(m, x);
              colKeyMap.put(tblName + colName, colKey);
              return colKey;
            }
          }
        }
        // Resolve an alias to its real table name.
        else if (tableMeta.getTblName().equals(aliasTblMap.get(tblName))) {
          for (ColumnMeta columnMeta : tableMeta.getCols()) {
            if (columnMeta.getColName().equals(colName)) {
              BigInteger m = new BigInteger(columnMeta.getM());
              BigInteger x = new BigInteger(columnMeta.getX());
              colKey = new SdbColumnKey(m, x);
              colKeyMap.put(tblName + colName, colKey);
              return colKey;
            }
          }
        }
      }
    }

    if (colKey == null) {
      LOG.error("No column " + colName + " in table " + tblName + " found");
    }

    return colKey;
  }

  /**
   * Belows are fast implementation of rewriting arithmetic expression by updating
   * all columns to be the same column key <m, 0>.
   */


  /**
   * @param arithExpr
   * @param targetM
   * @return
   * @throws UnSupportedException
   */
  protected Expr rewriteNorArithExprFast(NormalArithmeticExpr arithExpr,
                                         BigInteger targetM)
          throws UnSupportedException {

    Expr leftExpr = arithExpr.getLeftExpr();
    Expr rightExpr = arithExpr.getRightExpr();

    // Need to check if expression involves columns from different table.


    if (leftExpr instanceof NormalArithmeticExpr)
      arithExpr.setLeftExpr(rewriteNorArithExprFast((NormalArithmeticExpr)
              leftExpr, targetM));
    if (rightExpr instanceof NormalArithmeticExpr)
      arithExpr.setRightExpr(rewriteNorArithExprFast((NormalArithmeticExpr)
              rightExpr, targetM));


    // EE mode
    if (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol()) {
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
    else if (leftExpr.involveEncrytedCol() || rightExpr.involveEncrytedCol()) {
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

  protected Expr rewriteAddEEFast(Expr leftExpr, Expr rightExpr, BigInteger
          targetM) throws UnSupportedException {
    assert (leftExpr.involveEncrytedCol() && rightExpr.involveEncrytedCol());
    BigInteger targetX = BigInteger.ZERO;

    SdbArithmeticExpr sdbArithmeticExpr = new SdbArithmeticExpr(SdbOperator.SDB_ADD);

    //      BigInteger targetM = SDBEncrypt.generatePositiveRand(prime1, prime2);
    //      BigInteger targetX = BigInteger.ZERO;
    //
    //      FieldLiteral eLiteral = (FieldLiteral) E;
    //      FieldLiteral pLiteral = (FieldLiteral) P;
    //
    //      FieldLiteral eS = new FieldLiteral(eLiteral.getTblName(),
    // ColumnDefinition
    // .S_COLUMN_NAME,DataType.INT);
    //      FieldLiteral pS = new FieldLiteral(pLiteral.getTblName(),
    // ColumnDefinition
    // .S_COLUMN_NAME,DataType.INT);
    //
    //      String key1 = eLiteral.getTblName() + ColumnDefinition.S_COLUMN_NAME;
    //      String key2 = pLiteral.getTblName() + ColumnDefinition.S_COLUMN_NAME;
    //      if(colKeyMap.containsKey(key1)) {
    //        eS.setSdbColKey(colKeyMap.get(key1));
    //      }
    //      else {
    //        ColumnKey sdbColKey = getTableColumnKey(eLiteral.getTblName(),
    //                ColumnDefinition.S_COLUMN_NAME);
    //        eS.setSdbColKey(sdbColKey);
    //        colKeyMap.put(key1, sdbColKey);
    //      }
    //
    //      if(colKeyMap.containsKey(key2)){
    //        pS.setSdbColKey(colKeyMap.get(key2));
    //      }
    //      else {
    //        ColumnKey sdbColKey = getTableColumnKey(pLiteral.getTblName(),
    //                ColumnDefinition.S_COLUMN_NAME);
    //        pS.setSdbColKey(sdbColKey);
    //        colKeyMap.put(key2, sdbColKey);
    //      }
    //
    //      Expr pKeyUp = keyUpdatePlainCol(P, pS, targetM, targetX);
    //
    //      BigInteger[] pq = SDBEncrypt.keyUpdateClient(E.getSdbColKey().getM(),
    //              targetM, eS.getSdbColKey().getX(), E.getSdbColKey().getX(), targetX,
    //              S.getSdbColKey().getX(), prime1, prime2);
    //
    //      Expr eKeyUp = buildSdbKeyUpdateExpr(E, eS, new BigIntLiteral
    //                      (pq[0]),
    //              new BigIntLiteral(pq[1]), new BigIntLiteral(n), targetM,
    // targetX);
    //
    //      sdbArithmeticExpr.addChild(eKeyUp);
    //      sdbArithmeticExpr.addChild(pKeyUp);
    //      sdbArithmeticExpr.addChild(new BigIntLiteral(n));
    //      sdbArithmeticExpr.setSdbColKey(new ColumnKey(targetM, targetX));

    return sdbArithmeticExpr;

  }

}
