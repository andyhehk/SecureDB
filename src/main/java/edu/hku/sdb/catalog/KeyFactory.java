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

import java.util.StringTokenizer;

public class KeyFactory {

  public static Key stringToKey(String keyString) {
    Key key = null;
    
    StringTokenizer token = new StringTokenizer(keyString, "::");
    
    String clazz = token.nextToken(); 
    
    if(clazz.equals(DBMeta.DBPK.class.getName())) {
      key = new DBMeta.DBPK(keyString);
    }
    
    else if(clazz.equals(TableMeta.TablePK.class.getName())) {
      key = new TableMeta.TablePK(keyString);
    }
    
    else if(clazz.equals(ColumnMeta.ColumnPK.class.getName())) {
      key = new ColumnMeta.ColumnPK(keyString);
    }
    
    else {
      throw new RuntimeException("Unsupported Primary key: " + clazz);
    }
    
    return key;
    
  }
}
