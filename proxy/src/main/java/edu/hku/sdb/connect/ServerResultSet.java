package edu.hku.sdb.connect;

/**
 * Created by andy on 9/23/15.
 */
public abstract class ServerResultSet {

  /**
   * Move to the next tuple.
   *
   * @return
   */
  public abstract boolean next();

  /**
   * Get a column according to the current tuple.
   * Index starts from 0.
   *
   * @param i
   * @return
   */
  public abstract Object getObject(int i);
}
