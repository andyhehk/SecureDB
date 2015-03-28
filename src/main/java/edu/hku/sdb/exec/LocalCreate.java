package edu.hku.sdb.exec;

import edu.hku.sdb.catalog.DBMeta;
import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.catalog.TableMeta;
import edu.hku.sdb.parse.TableName;
import edu.hku.sdb.plan.LocalCreateDesc;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class LocalCreate extends PlanNode<LocalCreateDesc> {


  public LocalCreate(MetaStore metaStore, TableName tableName) {
    nodeDesc = new LocalCreateDesc();
    nodeDesc.setMetaStore(metaStore);
    nodeDesc.setTableName(tableName);
  }

  @Override
  public void init() {
    
  }

  @Override
  public BasicTupleSlot nextTuple() {
    return null;
  }

  @Override
  public void close() {

  }
}
