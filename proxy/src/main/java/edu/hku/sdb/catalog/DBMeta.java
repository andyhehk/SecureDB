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

package edu.hku.sdb.catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.jdo.annotations.*;


@PersistenceCapable(objectIdClass = DBMeta.DBPK.class)
public class DBMeta {

  public static String defaultDbName = "default";

  @PrimaryKey
  private String dbName = null;

  @Persistent(mappedBy = "dbMeta")
  @Join
  private List<TableMeta> tbls = new ArrayList<TableMeta>();

  // The big primary number n
  @Column(length = 2048)
  private String n = null;

  // The big primary number p to generate n
  @Column(length = 1024)
  private String p = null;

  // The big primary number p to generate n
  @Column(length = 1024)
  private String q = null;

  // The secrete number g
  @Column(length = 1024)
  private String g = null;

  // The random seed to generate row ids
  @Column(length = 2048)
  private String seed = null;

  public static class DBPK extends Key {

    private static final long serialVersionUID = 1L;
    public String dbName;

    public DBPK() {
    }

    public DBPK(String value) {
      StringTokenizer token = new StringTokenizer(value, "::");
      token.nextToken(); // className
      this.dbName = token.nextToken(); // db name
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof DBPK)) {
        return false;
      }
      DBPK c = (DBPK) obj;

      return dbName.equals(c.dbName);
    }

    @Override
    public int hashCode() {
      return this.dbName.hashCode();
    }

    @Override
    public String toString() {
      // Give output expected by String constructor
      return this.getClass().getName() + "::" + this.dbName;
    }

  }

  public DBMeta(String name) {
    // database name should be case insensitive
    this.setName(name);
  }

  /**
   * @return the tbls
   */
  public List<TableMeta> getTbls() {
    return tbls;
  }

  /**
   * @param tbls the tbls to set
   */
  public void setTbls(List<TableMeta> tbls) {
    this.tbls = tbls;
  }

  /**
   * @return the name
   */
  public String getName() {
    return dbName;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.dbName = name.toLowerCase();
  }


  /**
   * @return the n
   */
  public String getN() {
    return n;
  }

  /**
   * @param n the n to set
   */
  public void setN(String n) {
    this.n = n;
  }

  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public String getP() {
    return p;
  }

  public void setP(String p) {
    this.p = p;
  }

  /**
   * @return the g
   */
  public String getG() {
    return g;
  }

  /**
   * @param g the g to set
   */
  public void setG(String g) {
    this.g = g;
  }

  /**
   * @return the seed
   */
  public String getSeed() {
    return seed;
  }

  /**
   * @param seed the seed to set
   */
  public void setSeed(String seed) {
    this.seed = seed;
  }


  public void add(TableMeta tbl) {
    getTbls().add(tbl);
  }


  /**
   * Remove a table by name.
   *
   * @param tblName
   */
  public void remove(String tblName) {
    // case insensitive.
  }


  /**
   * Number of tables.
   *
   * @return
   */
  public int size() {
    return getTbls().size();
  }
}
