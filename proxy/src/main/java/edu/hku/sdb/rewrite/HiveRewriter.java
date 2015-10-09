package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.*;
import edu.hku.sdb.crypto.SDBEncrypt;
import edu.hku.sdb.crypto.SearchEncrypt;
import edu.hku.sdb.parse.*;
import edu.hku.sdb.utility.ParserConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by andy on 10/6/15.
 */
public class HiveRewriter extends AbstractRewriter {

  private static final Logger LOG = LoggerFactory
          .getLogger(HiveRewriter.class);

  public HiveRewriter(DBMeta dbMeta) {
    super(dbMeta);
  }

  @Override
  public void rewrite(ParseNode parseTree) throws RewriteException {
    rewriteInternal(parseTree);
  }

  /**
   * Internal rewrite function. All rewriting should be involved by this
   * function.
   *
   * @param parseTree
   * @return
   */
  protected void rewriteInternal(ParseNode parseTree)
          throws RewriteException {
    if (parseTree instanceof CreateStmt) {
      rewriteCreateStmt((CreateStmt) parseTree);
    }
  }

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
      tableRowFormat.setColletionDelimiter(ParserConstant
              .DEFAULT_COLLETION_DELIMETER);
      createStmt.setTableRowFormat(tableRowFormat);
    }
  }

  private void rewriteCreateFieldLists(List<ColumnDefinition> fieldList) throws
          UnSupportedException {

    for (ColumnDefinition colDefinition : fieldList) {
      if (colDefinition.involveEncrytedCol()) {
        Type originType = colDefinition.getOriginType();

        if (originType instanceof ScalarType) {
          int index = fieldList.indexOf(colDefinition);
          Type type;
          switch (((ScalarType) originType).getType()) {
            case INT:
            case BIGINT:
            case TINYINT:
            case DECIMAL:
              type = ScalarType.createVarcharType(SDBEncrypt.defaultRandLength);
              colDefinition.setRewrittenType(type);
              break;
            case CHAR:
            case VARCHAR:
            case STRING:
              String name = colDefinition.getName();
              // No need to rewrite auxiliary columns.
              if (name.equals(ColumnDefinition.ROW_ID_COLUMN_NAME) || name.equals
                      (ColumnDefinition.R_COLUMN_NAME) ||
                      name.equals(ColumnDefinition.S_COLUMN_NAME))
                break;
              type = new ArrayType(ScalarType.createVarcharType(SearchEncrypt
                      .DEAULTT_LENGTH));
              colDefinition.setRewrittenType(type);
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
  }
}
