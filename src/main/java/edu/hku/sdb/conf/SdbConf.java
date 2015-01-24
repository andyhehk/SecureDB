/*******************************************************************************
 *    Licensed to the Apache Software Foundation (ASF) under one or more 
 *    contributor license agreements.  See the NOTICE file distributed with 
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with 
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.conf;

public class SdbConf {

    private ConnectionConf connectionConf;
    private DbConf metaDbConf;
    private DbConf serverDbConf;
    private DbConf clientDbConf;

    public DbConf getMetadbConf() {
        return metaDbConf;
    }

    public void setMetadbConf(DbConf metadbConf) {
        this.metaDbConf = metadbConf;
    }

    public DbConf getServerdbConf() {
        return serverDbConf;
    }

    public void setServerdbConf(DbConf serverdbConf) {
        this.serverDbConf = serverdbConf;
    }

    public DbConf getClientdbConf() {
        return clientDbConf;
    }

    public void setClientdbConf(DbConf clientdbConf) {
        this.clientDbConf = clientdbConf;
    }

    public ConnectionConf getConnectionConf() {
        return connectionConf;
    }

    public void setConnectionConf(ConnectionConf connectionConf) {
        this.connectionConf = connectionConf;
    }

    private void init(){

    }

    private void initClientDbConf(String filename){

    }

    private void initServerDbConf(String filename){

    }

    private void initMetaDbConf(String filename){

    }

    private void initConnectionConf(String filename){

    }

}
