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

package edu.hku.sdb.catalog;

import static org.junit.Assert.*;

import java.util.Properties;
import java.util.Set;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import org.junit.Before;
import org.junit.Test;

public class MetaStoreTest {

  PersistenceManagerFactory pmf;
  PersistenceManager pm;
  
  @Before
  public void prepareTestObj() {
    Properties properties = new Properties();
    properties.setProperty("javax.jdo.PersistenceManagerFactoryClass", 
        "org.datanucleus.api.jdo.JDOPersistenceManagerFactory");
    properties.setProperty("javax.jdo.option.ConnectionURL","jdbc:derby:metastore_db;create=true");
    properties.setProperty("javax.jdo.option.ConnectionDriverName","org.apache.derby.jdbc.EmbeddedDriver");
    properties.setProperty("javax.jdo.option.ConnectionUserName","");
    properties.setProperty("javax.jdo.option.ConnectionPassword","");
    properties.setProperty("datanucleus.schema.autoCreateSchema","true");
    properties.setProperty("datanucleus.schema.autoCreateTables","true");
    properties.setProperty("datanucleus.schema.validateTables","false");
    properties.setProperty("datanucleus.schema.validateConstraints","false");
    
    pmf = JDOHelper.getPersistenceManagerFactory(properties);
    pm = pmf.getPersistenceManager();
  }
  
  // To do: need to clear the derby database after test
  @Test
  public void testInsertDB() {
    Transaction tx=pm.currentTransaction();
    String name = "test";
    try
    {
        tx.begin();
        MetaStore metadb = new MetaStore(name);
        
        DBMeta db = new DBMeta(name);
        metadb.getDbs().add(db);
        
        pm.makePersistent(metadb);
        tx.commit();
        
        MetaStore testmetadb = pm.getObjectById(MetaStore.class, name);
        Set<DBMeta> testdbs = testmetadb.getDbs();
        
        assertEquals(testdbs.size(), 1);
        
        for(DBMeta testdb : testdbs) {
          assertEquals(testdb.getName(), name);
        }
        
    }
    finally
    {
        if (tx.isActive())
        {
            tx.rollback();
        }
        pm.close();
    }
  }
  
  @Test
  public void testDeleteDB() {

  }
}
