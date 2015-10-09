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

package edu.hku.sdb.conf;

public class SdbConf {

  private ConnectionConf connectionConf;
  private MetadbConf metadbConf;
  private ServerConf serverConf;


  public SdbConf(ConnectionConf connectionConf, ServerConf serverConf, MetadbConf metadbConf) {
    this.connectionConf = connectionConf;
    this.serverConf = serverConf;
    this.metadbConf = metadbConf;
  }

  public MetadbConf getMetadbConf() {
    return metadbConf;
  }

  public void setMetadbConf(MetadbConf metadbConf) {
    this.metadbConf = metadbConf;
  }

  public ServerConf getServerConf() {
    return serverConf;
  }

  public void setServerConf(ServerConf serverConf) {
    this.serverConf = serverConf;
  }

  public ConnectionConf getConnectionConf() {
    return connectionConf;
  }

  public void setConnectionConf(ConnectionConf connectionConf) {
    this.connectionConf = connectionConf;
  }


}
