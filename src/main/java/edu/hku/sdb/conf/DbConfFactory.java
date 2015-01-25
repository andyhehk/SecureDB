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
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressioness or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

package edu.hku.sdb.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class DbConfFactory {

  private static final Logger LOG = LoggerFactory
      .getLogger(DbConfFactory.class);
  private static final String MYSQL_DB = "mysql";
  private static final String SPARK_DB = "spark";
  private static final String DB_TYPE = "edu.hku.sdb.conf.driver.type";
  private static final String USERNAME = "edu.hku.sdb.conf.database.username";
  private static final String PASSWORD = "edu.hku.sdb.conf.database.password";
  private static final String DATABASE_NAME = "edu.hku.sdb.conf.database.name";
  private static final String DRIVER = "edu.hku.sdb.conf.jdbc.drivername";
  private static final String URL = "edu.hku.sdb.conf.jdbc.url";

  static public DbConf getDbConf(String filename) {
    DbConf dbConf = null;
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true);
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(filename);
      XPathFactory xFactory = XPathFactory.newInstance();
      XPath xpath = xFactory.newXPath();
      XPathExpression expression = xpath.compile("//property[name='" + DB_TYPE
          + "']/value/text()");
      NodeList nodes = (NodeList) expression.evaluate(document,
          XPathConstants.NODESET);
      String propertyValue = nodes.item(0).getNodeValue();

      if (propertyValue.toLowerCase().equals(MYSQL_DB)) {
        dbConf = new MysqlDbConf();
        LOG.debug("Create MysqlDbConf ... ");
      } else if (propertyValue.toLowerCase().equals(SPARK_DB)) {
        dbConf = new SparksqlDbConf();
        LOG.debug("Create SparkDbConf ... ");
      } else {
        LOG.debug("DB Type not recognized.");
      }
      dbConf = getConfProperty(dbConf, document, xpath);

    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (XPathExpressionException e) {
      e.printStackTrace();
    }
    return dbConf;
  }

  private static DbConf getConfProperty(DbConf dbConf, Document document,
      XPath xpath) throws XPathExpressionException {
    XPathExpression expression;
    NodeList nodes;
    String propertyValue;

    expression = xpath.compile("//property[name='" + USERNAME
        + "']/value/text()");
    nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
    propertyValue = nodes.item(0).getNodeValue();
    if (propertyValue != null) {
      dbConf.setUsername(propertyValue);
    }

    expression = xpath.compile("//property[name='" + PASSWORD
        + "']/value/text()");
    nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
    propertyValue = nodes.item(0).getNodeValue();
    if (propertyValue != null) {
      dbConf.setPassword(propertyValue);
    }

    expression = xpath.compile("//property[name='" + DATABASE_NAME
        + "']/value/text()");
    nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
    propertyValue = nodes.item(0).getNodeValue();
    if (propertyValue != null) {
      dbConf.setDatabaseName(propertyValue);
    }

    expression = xpath
        .compile("//property[name='" + DRIVER + "']/value/text()");
    nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
    propertyValue = nodes.item(0).getNodeValue();
    if (propertyValue != null) {
      dbConf.setJdbcDriverName(propertyValue);
    }

    expression = xpath.compile("//property[name='" + URL + "']/value/text()");
    nodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
    propertyValue = nodes.item(0).getNodeValue();
    if (propertyValue != null) {
      dbConf.setJdbcUrl(propertyValue);
    }

    return dbConf;
  }
  /*
   * //Load DbConf using XML instead of XPATH private static DbConf
   * loadXMLConfig(String configFile, DbConf dbConf) { try { XMLInputFactory
   * inputFactory = XMLInputFactory.newInstance(); InputStream in = new
   * FileInputStream(configFile); XMLEventReader eventReader =
   * inputFactory.createXMLEventReader(in); while (eventReader.hasNext()) {
   * XMLEvent event = eventReader.nextEvent(); if (event.isStartElement()) {
   * StartElement startElement = event.asStartElement();
   * 
   * if (event.isStartElement()) { if
   * (event.asStartElement().getName().getLocalPart() .equals(USERNAME)) { event
   * = eventReader.nextEvent();
   * dbConf.setUsername(event.asCharacters().getData()); continue; } } if
   * (event.isStartElement()) { if
   * (event.asStartElement().getName().getLocalPart() .equals(PASSWORD)) { event
   * = eventReader.nextEvent();
   * dbConf.setPassword(event.asCharacters().getData()); continue; } } } } }
   * catch (FileNotFoundException e) { e.printStackTrace(); } catch
   * (XMLStreamException e) { e.printStackTrace(); } return dbConf; }
   */

}
