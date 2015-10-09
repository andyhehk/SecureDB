package edu.hku.sdb.rewrite;

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.ScalarType;
import edu.hku.sdb.catalog.Type;
import edu.hku.sdb.parse.ColumnDefinition;
import edu.hku.sdb.parse.CreateStmt;
import edu.hku.sdb.parse.ParseNode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by andy on 10/6/15.
 */
public class ODPSRewriter extends AbstractRewriter {

  private static final Logger LOG = LoggerFactory
          .getLogger(ODPSRewriter.class);

  public ODPSRewriter(DBMeta dbMeta) {
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
    createStmt.setTableRowFormat(null);
  }

  private void rewriteCreateFieldLists(List<ColumnDefinition> fieldList) throws
          UnSupportedException {

    UnSupportedException e;
    for (ColumnDefinition colDefinition : fieldList) {

      Type originType = colDefinition.getOriginType();

      if (originType instanceof ScalarType) {
        int index = fieldList.indexOf(colDefinition);
        Type type;
        switch (((ScalarType) originType).getType()) {
          case DECIMAL:
            if (colDefinition.involveEncrytedCol()) {
              type = ScalarType.STRING;
              colDefinition.setRewrittenType(type);
            }
            break;
          case BIGINT:
          case DOUBLE:
          case STRING:
          case BOOLEAN:
          case DATE:
            if(colDefinition.involveEncrytedCol()) {
              e = new UnSupportedException("Can not support " +
                      "sdb encryption for data type " + originType);
              LOG.error("There is unsupported data type!", e);
              throw e;
            }
            break;
          case INT:
            LOG.warn("Cannot support type: " + originType);
            if (colDefinition.involveEncrytedCol()) {
              type = ScalarType.STRING;
              colDefinition.setRewrittenType(type);
            }
            else {
              type = ScalarType.BIGINT;
              colDefinition.setRewrittenType(type);
            }

            break;
          default:
            e = new UnSupportedException("Can not support " +
                    " data type " + originType + " by the server!");
            LOG.error("There is unsupported data type!", e);
            throw e;
        }
        fieldList.set(index, colDefinition);
      }
    }

  }
}
