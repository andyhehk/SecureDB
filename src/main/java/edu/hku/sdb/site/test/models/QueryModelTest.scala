package models

import org.specs2.mutable.Specification

/**
 * Created by Eric Haibin Lin on 22/3/15.
 */
class QueryModelTest extends Specification {

  "Resultset" should {
    "return a the name of result columns" in {
      val queryModel = new QueryModel()
      queryModel.query = "select id from t2"
      queryModel.init
      val resultMetaName = queryModel.getResultMetaName
      resultMetaName.get(0) must not beNull
    }
    "return the execution time of server and client" in {
      val queryModel = new QueryModel()
      queryModel.query = "select id from t2"
      queryModel.init
      def clientCost = queryModel.getExecutionTime.get(0)
      def serverCost = queryModel.getExecutionTime.get(1)
      clientCost.compareTo(0L) must be_>(0)
      serverCost.compareTo(0L) must be_>(0)
    }
  }

}
