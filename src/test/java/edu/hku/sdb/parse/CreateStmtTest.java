package edu.hku.sdb.parse;

import edu.hku.sdb.catalog.ColumnKey;
import edu.hku.sdb.catalog.DataType;
import edu.hku.sdb.crypto.Crypto;
import edu.hku.sdb.util.TestQuery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CreateStmtTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testCreateStmt() throws Exception{
    CreateStmt createStmt1 = TestQuery.prepareCreateStmtAnalysed();
    CreateStmt createStmt2 = TestQuery.prepareCreateStmtAnalysed();
    assertEquals(createStmt1, createStmt2);
    //CREATE TABLE t2 (id INT, name VARCHAR(20), salary VARCHAR(2048), row_id VARCHAR(2048), r VARCHAR(2048), s VARCHAR(2048)) ROW FORMAT DELIMITED FIELDS TERMINATED BY ';';
    System.out.println(createStmt1.toSql());
  }
}