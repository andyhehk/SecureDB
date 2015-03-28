package edu.hku.sdb.plan;

import edu.hku.sdb.catalog.MetaStore;
import edu.hku.sdb.parse.TableName;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class LocalCreateDesc extends PlanNodeDesc  {

  MetaStore metaStore;
  TableName tableName;

  public TableName getTableName() {
    return tableName;
  }

  public void setTableName(TableName tableName) {
    this.tableName = tableName;
  }

  public MetaStore getMetaStore() {
    return metaStore;
  }

  public void setMetaStore(MetaStore metaStore) {
    this.metaStore = metaStore;
  }

}
