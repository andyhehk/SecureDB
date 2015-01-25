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

package edu.hku.sdb.driver;

import edu.hku.sdb.conf.ConnectionConf;
import edu.hku.sdb.conf.SdbConf;
import edu.hku.sdb.connect.Connection;
import edu.hku.sdb.connect.ConnectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SdbDriver {

    private static final Logger LOG = LoggerFactory.getLogger(SdbDriver.class);
    private static final String HELP = "help";
    private static final String START = "start";
    private static final String STOP = "stop";
    private static final String SERVICE_NAME = "ConnectionService";
    private static final String USAGE = "Usage: sdb [args] " +
            "start \t start SecureDB service" +
            "stop \t stop SecureDB service" +
            "help \t print SecureDB usage";
    private static SdbConf sdbConf;

    /**
     * @param args
     */
    //TODO: to be implemented
    public static void main(String[] args) {
        parseAndValidateInput(args);
    }

    private static void startDriver() {
        initConfig();
        try {
            ConnectionPool connectionPool = new ConnectionPool(getSdbConf());
            ConnectionConf connectionConf = getSdbConf().getConnectionConf();
            LocateRegistry.createRegistry(connectionConf.getSdbPort());
            String sdbConnectionUrl = connectionConf.getSdbAddress() + ":" + connectionConf.getSdbPort() + "/" + SERVICE_NAME;
            Naming.rebind( sdbConnectionUrl, connectionPool);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    //TODO: to be implemented
    private static void stopDriver() {

    }

    private static void printUsage(OutputStream outputStream){
        try {
            outputStream.write(USAGE.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO: to be implemented
    private static void failAndExit(String message){
        return;
    }

    //TODO: to be implemented
    private static void parseAndValidateInput(String[] argsList){

        if (argsList.length == 0){
            printUsage(System.out);
            return;
        }

        if (argsList[0].toLowerCase().equals(HELP)){
            printUsage(System.out);
            return;
        }

        if (argsList[0].toLowerCase().equals(START)){
            startDriver();
            return;
        }

        if (argsList[0].toLowerCase().equals(STOP)){
            stopDriver();
            return;
        }
    }


    public static SdbConf getSdbConf() {
        return sdbConf;
    }

    public static void setSdbConf(SdbConf sdbConf) {
        SdbDriver.sdbConf = sdbConf;
    }

    private static void initConfig(){
        setSdbConf(new SdbConf());
    }

}
