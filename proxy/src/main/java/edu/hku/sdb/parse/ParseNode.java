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
package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.MetaStore;

public interface ParseNode {

  /**
   * Perform semantic analysis of node and all of its children. Throw exception
   * if any errors found. Two major tasks:
   * <p/>
   * 1. Resolve the table name of a field. It may throw ambiguous exception if
   * the table name cannot be uniquely identified or not found exception if the
   * table name cannot be resolved.
   * <p/>
   * 2. Set the column keys of all sensitive columns.
   *
   * @param metaDB
   * @param fieldSources
   * @throws SemanticException
   */
  public void analyze(MetaStore metaDB, ParseNode... fieldSources)
          throws SemanticException;

  /**
   * @return SQL syntax corresponding to this node
   */
  public String toSql();

  public boolean involveSdbEncrytedCol();
}
