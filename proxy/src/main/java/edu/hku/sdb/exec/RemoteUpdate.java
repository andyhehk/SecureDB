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

import edu.hku.sdb.connect.ServerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RemoteUpdate extends RemoteSQL {

  boolean initialized = false;

  private static final Logger LOG = LoggerFactory
          .getLogger(RemoteUpdate.class);

  public RemoteUpdate(String query, ServerConnection connection) {
    super(query, connection);
  }

  @Override
  public void init() {
    if(initialized)
      return;

    long startTimeStamp = System.currentTimeMillis();
    String query = nodeDesc.getQuery();

    if(query != null)
      nodeDesc.getConnection().executeUpdate(query);

    // profile server query execution time
    long endTimeStamp = System.currentTimeMillis();
    setServerExecutionTime(endTimeStamp - startTimeStamp);

    initialized = true;
  }

  @Override
  public List<Object> nextTuple() {
    init();
    return null;
  }
}
