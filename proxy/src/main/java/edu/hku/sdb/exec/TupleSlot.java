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

package edu.hku.sdb.exec;

import java.util.ArrayList;
import java.util.List;

public class TupleSlot extends BasicTupleSlot {

  private List<List<Object>> rows = new ArrayList<>();
  private int rowIndex = -1;

  public void addRow(List<Object> row) {
    rows.add(row);
  }

  public void setRows(List<List<Object>> rows) {
    this.rows = rows;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.hku.sdb.exec.BasicTupleSlot#nextTuple()
   */
  @Override
  public List<Object> nextTuple() {
    rowIndex++;
    if (rowIndex < rows.size()) {
      return rows.get(rowIndex);
    }
    else {
      if(rows.size() > 0)
        rows.clear();
      rowIndex = -1;
      return null;
    }
  }
}
