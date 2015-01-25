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

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SdbConf {

    private ConnectionConf connectionConf;
    private DbConf metaDbConf;
    private DbConf serverDbConf;
    private DbConf clientDbConf;
    private String sdbConfPath;

    private static final String CLIENT_CONF_FILE = "sdb-client.xml";
    private static final String SERVER_CONF_FILE = "sdb-server.xml";
    private static final String METASTORE_CONF_FILE = "sdb-metastore.xml";
    private static final String CONNECTION_CONF_FILE = "sdb-connection.xml";
    private static final String SDB_CONF = "SDB_CONF";


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

    public String getSdbConfPath() {
        return sdbConfPath;
    }

    public void setSdbConfPath(String sdbConfPath) {
        this.sdbConfPath = sdbConfPath;
    }

    private void init(){
        setSdbConfPath(loadSystemSdbPath());
        initClientDbConf(sdbConfPath + "/" + CLIENT_CONF_FILE);
        initServerDbConf(sdbConfPath  + "/" + SERVER_CONF_FILE);
        initMetaDbConf(sdbConfPath  + "/" + METASTORE_CONF_FILE);
        initConnectionConf(sdbConfPath  + "/" + CONNECTION_CONF_FILE);
    }

    private void initClientDbConf(String filename){
        clientDbConf = DbConfFactory.getDbConf(filename);
    }

    private void initServerDbConf(String filename){
        serverDbConf = DbConfFactory.getDbConf(filename);
    }

    //TODO: config metastore for hive.
    private void initMetaDbConf(String filename){
        metaDbConf = DbConfFactory.getDbConf(filename);
    }

    //TODO: Change to XML format reader
    private void initConnectionConf(String filename){
        return;
    }

    private String loadSystemSdbPath(){
        Map<String, String> env = System.getenv();
        return env.get(SDB_CONF);
    }

}
