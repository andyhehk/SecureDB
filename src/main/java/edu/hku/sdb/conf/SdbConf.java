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

    private final String CONNECTION_CONFIG = "[connection]";
    private final String MAX_CONNECTION_NUMBER = "max_connection_number";
    private final String SDB_ADDRESS = "sdb_address";
    private final String SDB_PORT = "sdb_port";


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

    public void test(){
        initConnectionConf("daf");
    }

    private void initConnectionConf(String filename){

        if (filename == null){
            filename = "/Users/Yifan/sdb/dev/securedb/target/conf/sdb.conf";
        }
        Scanner scanner = getScanner(filename, CONNECTION_CONFIG);
        Map<String, String> configMap = getConfigMap(scanner);

        Integer maxConnectionNumber = Integer.parseInt(configMap.get(MAX_CONNECTION_NUMBER));
        String sdbAddress = configMap.get(SDB_ADDRESS);
        Integer sdbPort = Integer.parseInt(configMap.get(SDB_PORT));

        connectionConf = new ConnectionConf();
        connectionConf.setMaxConnectionNumber(maxConnectionNumber);
        connectionConf.setSdbAddress(sdbAddress);
        connectionConf.setSdbPort(sdbPort);
        return;
    }

    private Map<String, String> getConfigMap(Scanner scanner) {
        Map<String, String> configMap = new HashMap<String, String>();
        while (scanner.hasNextLine()){
            String nextLine = scanner.nextLine();
            //Stop reading next line in case of a blank line
            if (nextLine.trim().equals("")){
                break;
            }
            Scanner configParser = new Scanner(nextLine);
            configParser.useDelimiter("=");
            if (configParser.hasNext()){
                String name = configParser.next().toLowerCase();
                String value = configParser.next();
                configMap.put(name.trim(), value.trim());
            }
        }
        return configMap;
    }

    private Scanner getScanner(String filename, String target) {
        Scanner scanner = null;
        File configFile = new File(filename);
        try {

            scanner = new Scanner(configFile);
            while (scanner.hasNextLine()) {
                String nextLine =  scanner.nextLine();
                if (nextLine.trim().toLowerCase().equals(target)){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return scanner;
    }

}
