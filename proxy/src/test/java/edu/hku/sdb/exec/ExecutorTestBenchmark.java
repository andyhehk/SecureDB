//package edu.hku.sdb.exec;
//
//import edu.hku.sdb.utility.ProfileUtil;
//import org.junit.Test;
//
//import java.rmi.RemoteException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertNotNull;
//
//public class ExecutorTestBenchmark {
//
//
//
//  private void testEnc(){
//    List<String> queries;
//    edu.hku.sdb.connect.Statement statement;
//    ResultSet resultSet;
//    String DB_URL = "//localhost:2019/ConnectionService";
//    int repeatition = 1;
//
//    queries = new ArrayList<>();
//    queries.add("select a,b,c from demo where a < 10");
//    queries.add("select c from enc_200 where a < 2");
//    queries.add("select c from enc_200 where a < 105");
//
//    for (String query : queries) {
//      try {
//        System.out.println(query);
//        long totalTime = 0;
//        long serverTotalTime = 0;
//        long clientTotalTime = 0;
//        long clientParseTime = 0;
//        long clientAnalyseTime = 0;
//        long clientRewriteTime = 0;
//        long clientExecuteTime = 0;
//
//        for (int i = 0; i < repeatition; i++) {
//          edu.hku.sdb.connect.Connection connection = ConnectionManager.getConnection(DB_URL, "", "");
//          statement = connection.createStatement();
//          resultSet = statement.executeQuery(query);
//
////          while (resultSet.next()){
////            System.out.println("size" + resultSet.getString(1));
////          }
//          Profiler profiler = statement.getProfiler();
//          totalTime += profiler.getTotalTime();
//          serverTotalTime += profiler.getServerTotalTime();
//          clientTotalTime += profiler.getClientTotalTime();
//          clientParseTime += profiler.getClientParseTime();
//          clientAnalyseTime += profiler.getClientAnalyseTime();
//          clientRewriteTime += profiler.getClientRewriteTime();
//          clientExecuteTime += profiler.getClientExecutionTime();
//        }
//        System.out.println(totalTime / repeatition);
//        System.out.println(serverTotalTime / repeatition);
//        System.out.println(clientTotalTime / repeatition);
//        System.out.println(clientParseTime / repeatition);
//        System.out.println(clientAnalyseTime / repeatition);
//        System.out.println(clientRewriteTime / repeatition);
//        System.out.println(clientExecuteTime / repeatition);
//        System.out.println();
//
//      } catch (RemoteException e) {
//        e.printStackTrace();
//      }
//    }
//  }
//
//  @Test
//  public void testExecute() throws Exception{
//    testPlain();
////    testEnc();
////    testPlainLocal();
//  }
//
//  public void testPlain() throws Exception{
//
//    String HiveDriverName = "org.apache.hive.jdbc.HiveDriver";
//    String serverConnectionURL = "jdbc:hive2://galaxy046:10000/default";
//    try {
//      Class.forName(HiveDriverName);
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//      System.exit(1);
//    }
//    Connection con = DriverManager.getConnection(serverConnectionURL, "haibin", "3199130E");
//    Statement stmt = con.createStatement();
//
//    //Test spark-sql
//    List<String> queries;
//    int repeatition = 3;
//
//    queries = new ArrayList<>();
//    queries.add("select a,b,c from demo where a < 10");
//    queries.add("select a,b,c from demo where a < 10");
//    queries.add("select * from lineitem_200k_origin where l_extendedprice < 2");
//    queries.add("select * from lineitem_origin_s where l_extendedprice < 2");
//
//    for (String query : queries) {
//      System.out.println(query);
//      long time = 0;
//
//      for (int i=0; i<repeatition; i++) {
//        ProfileUtil profileUtil = new ProfileUtil();
//        java.sql.ResultSet res = con.createStatement().executeQuery(query);
////        while (res.next()) {
////          System.out.println("size" + res.getObject(1));
////        }
//        time += profileUtil.getDuration();
//      }
//      System.out.println(time/repeatition);
//      System.out.println();
//    }
//  }
//
//  public void testPlainLocal() throws Exception{
//
//    String HiveDriverName = "org.apache.hive.jdbc.HiveDriver";
//    String serverConnectionURL = "jdbc:hive2://localhost:10000/default";
//    try {
//      Class.forName(HiveDriverName);
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//      System.exit(1);
//    }
//    Connection con = DriverManager.getConnection(serverConnectionURL, "Yifan", "3199130E");
//    Statement stmt = con.createStatement();
//
//    //Test spark-sql
//    List<String> queries;
//    int repeatition = 3;
//
//    queries = new ArrayList<>();
//    queries.add("select a,b,c from origin_5 where a < 2");
//
//    for (String query : queries) {
//      System.out.println(query);
//      long time = 0;
//
//      for (int i=0; i<repeatition; i++) {
//        ProfileUtil profileUtil = new ProfileUtil();
//        java.sql.ResultSet res = con.createStatement().executeQuery(query);
////        while (res.next()) {
////          System.out.println("size" + res.getObject(1));
////        }
//        time += profileUtil.getDuration();
//      }
//      System.out.println(time/repeatition);
//      System.out.println();
//    }
//  }
//
//
//}