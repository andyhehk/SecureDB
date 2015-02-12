package edu.hku.sdb.upload;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UploadHandlerTest {


  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testUpload() throws Exception {

    UploadHandler uploadHandler = new UploadHandler();
    uploadHandler.setHDFS_URL("hdfs://localhost:9000");
    uploadHandler.setHDFS_FILE_PATH("hdfs://localhost:9000/user/yifan/test.txt");

  }
}