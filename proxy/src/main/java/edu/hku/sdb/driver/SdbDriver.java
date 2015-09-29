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

package edu.hku.sdb.driver;

import edu.hku.sdb.conf.*;
import edu.hku.sdb.util.XMLPropParser;
import org.apache.commons.cli.*;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SdbDriver {

  private static final Logger LOG = LoggerFactory.getLogger(SdbDriver.class);
  private static final String SERVICE_NAME = "ConnectionService";
  private static final String USAGE = "Usage: sdb [args] [--options]\n"
          + "start \t start SecureDB service\n" + "\t\t\t --sdbconf pathToSdbConfigurationFile \n"
          + "stop \t stop SecureDB service\n" + "help \t print SecureDB usage";


  // Main parsing options
  private static String START = "start";
  private static String CONF = "conf";
  private static String HELP = "help";

  private static void printUsage(PrintStream out) {

    out.println();
    out.println("Usage: start-sdb.sh");
    out.println(" -start							Start the SDB proxy");
    out.println(" -conf <dir>			  	Sdb configuration directory");
    out.println(" -help								Print this usage");
    out.println("");

  }

  /**
   *
   * @return
   */
  @SuppressWarnings("static-access")
  private static Options buildOptions() {

    // Build the options
    Option startOption = OptionBuilder.withArgName(START).create(START);

    Option confOption = OptionBuilder.withArgName(CONF).hasArg()
            .withDescription("The configuration directory").create(CONF);

    Option property  = OptionBuilder.withArgName("property=value")
            .hasArgs(2)
            .withValueSeparator()
            .withDescription( "use value for given property" )
            .create( "D" );

    Option helpOption = OptionBuilder.withArgName(HELP).create(HELP);

    // Declare the options
    Options opts = new Options();
    opts.addOption(startOption);
    opts.addOption(helpOption);
    opts.addOption(confOption);
    opts.addOption(property);

    return opts;
  }

  private static void failAndExit(String msg) {
    System.err.println();
    System.err.println(msg);
    System.err.println();
    printUsage(System.err);
    System.exit(-1);
  }

  private static CommandLine parseAndValidateInput(String[] args) {

    // Make sure we have some
    if (args == null || args.length == 0) {
      //printUsage(System.out);
      //System.exit(0);
    }

    // Parse the arguments
    Options opts = buildOptions();
    CommandLineParser parser = new GnuParser();
    CommandLine line = null;
    try {
      line = parser.parse(opts, args, true);
    } catch (ParseException e) {
      failAndExit("Unable to parse the input arguments:\n"
              + e.getMessage());
    }

    // Ensure we don't have any extra input arguments
    if (line.getArgs() != null && line.getArgs().length > 0) {
      System.err.println("Unsupported input arguments:");
      for (String arg : line.getArgs()) {
        System.err.println(arg);
      }
      failAndExit("");
    }

    // If the user asked for help, nothing else to do
    if (line.hasOption(HELP)) {
      return line;
    }

    if (!line.hasOption(START)) {
      printUsage(System.out);
      failAndExit("");
    }

    if (!line.hasOption(CONF)) {
      printUsage(System.out);
      failAndExit("");
    }

    return line;
  }



  private static void startConnectionPool(SdbConf sdbConf) {
    try {
      ConnectionPool connectionPool = new ConnectionPool(sdbConf);
      ConnectionConf connectionConf = sdbConf.getConnectionConf();
      LocateRegistry.createRegistry(connectionConf.getSdbPort());
      String sdbConnectionUrl = connectionConf.getSdbAddress() + ":"
              + connectionConf.getSdbPort() + "/" + SERVICE_NAME;

      LOG.info("Starting SDB Proxy");
      Naming.rebind(sdbConnectionUrl, connectionPool);

    } catch (RemoteException | MalformedURLException e) {
      e.printStackTrace();
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    CommandLine line = parseAndValidateInput(args);

    Properties properties = line.getOptionProperties("D");

    File sdbConnectionConfigFile = new File(properties.getProperty(CONF) + "/" + ConnectionConf.CONF_FILE);
    File sdbServerConfigFile = new File(properties.getProperty(CONF) + "/"  + ServerConf.CONF_FILE);
    File sdbMetadbConfigFile = new File(properties.getProperty(CONF) + "/" + MetadbConf.CONF_FILE);

    XMLPropParser propParser = new XMLPropParser();
    // Parse all the sdb connection config
    Map<String, String> prop = propParser.importXML(sdbConnectionConfigFile);
    // Parse all the server config
    prop.putAll(propParser.importXML(sdbServerConfigFile));
    // Parse all the metadb config
    prop.putAll(propParser.importXML(sdbMetadbConfigFile));

    // Override the config if any
    Set<Object> states = properties.keySet(); // get set-view of keys
    for (Object object : states) {
      String key = (String) object;
      String value = properties.getProperty(key);
      prop.put(key, value);
    }

    // Cet log4j config
    PropertyConfigurator.configure(properties.getProperty(CONF) + "/" + "log4j.properties");

    ServerConf serverConf = ServerConfFactory.createServerConf(prop);
    MetadbConf metadbConf = MetadbConfFactory.createMetadbConf(prop);
    ConnectionConf connectionConf = new ConnectionConf(prop);

    SdbConf sdbConf = new SdbConf(connectionConf, serverConf, metadbConf);

    // Start the SDB proxy
    startConnectionPool(sdbConf);
  }



}
