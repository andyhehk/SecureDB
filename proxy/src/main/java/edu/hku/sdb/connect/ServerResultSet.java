package edu.hku.sdb.connect;

import java.util.List;

/**
 * Created by andy on 9/23/15.
 */
public interface ServerResultSet {

  /**
   * Move to the next tuple.
   *
   * @return
   */
  boolean next();

  /**
   * Get a column according to the current tuple.
   * Index starts from 1 according to the JDBC convention.
   *
   * @return
   * @param i
   */
  Object getObject(int i);
}
