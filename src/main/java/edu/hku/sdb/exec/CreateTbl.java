package edu.hku.sdb.exec;

import edu.hku.sdb.plan.CreateTblDesc;
import edu.hku.sdb.plan.LocalCreateDesc;

/**
 * Created by Eric Haibin Lin on 28/3/15.
 */
public class CreateTbl extends PlanNode<CreateTblDesc> {

  LocalCreate localCreate;
  RemoteUpdate remoteUpdate;

  public CreateTbl(RemoteUpdate remoteUpdate, LocalCreate localCreate) {
    setLocalCreateNode(localCreate);
    setRemoteSQL(remoteUpdate);
  }

  public LocalCreate getLocalCreateNode() {
    return localCreate;
  }

  public void setLocalCreateNode(LocalCreate localCreateNode) {
    this.localCreate= localCreateNode;
  }

  public RemoteUpdate getRemoteSQL() {
    return remoteUpdate;
  }

  public void setRemoteSQL(RemoteUpdate remoteSQL) {
    this.remoteUpdate = remoteSQL;
  }

  @Override
  public void init() {
    remoteUpdate.init();
    localCreate.init();
  }

  @Override
  public BasicTupleSlot nextTuple() {
    return null;
  }

  @Override
  public void close() {

  }
}
