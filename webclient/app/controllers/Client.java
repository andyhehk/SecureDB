package controllers;

import java.lang.String;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import play.libs.Scala;
import play.mvc.*;
import views.html.*;
import models.*;

public class Client extends Controller {

  public static Result index() {
    QueryModel queryModel = new QueryModel();
    queryModel.query = "SHOW TABLES";
    queryModel.init();

    List<Database> databases = new ArrayList<Database>();

    List<List<String>> tables = queryModel.getResult();

    Database database = new Database("default");
    for(List<String> tbl : tables) {
      String tblName = tbl.get(0);

      queryModel.query = "DESCRIBE " + tblName;
      queryModel.init();

      List<List<String>> attributes = queryModel.getResult();

      Table table = new Table(tblName);
      for(List<String> attr : attributes) {
        String attName = attr.get(0);
        String type = attr.get(1);
        String isSen = attr.get(2);

        boolean isSensitive = isSen.equals("YES") ? true : false;

        Attribute attribute = new Attribute(attName, isSensitive);
        table.addAtt(attribute);
      }

      database.addTbl(table);
    }

    databases.add(database);
    return ok(main.render("Welcome to SecureDB - Client",
            "SecureDB Client", system_info.render(), databases));
  }

  public static Result setting() {

    List<Attribute> attributes = Attribute.getDefaultAttributesEmployee();

    return ok(setting.render("Welcome to SecureDB - Client",
            "Edit Priviledges", attributes, Database.getDefaultDatabases()));
  }

  public static Result database() {

    return ok(database.render("Welcome to SecureDB - Client",
            "View Database", Database.getDefaultDatabases()));
  }

  public static Result table() {

    return ok(table.render("Welcome to SecureDB - Client",
            "View Database", Database.getDefaultDatabases()));
  }

  public static Result upload() {

    return ok(upload.render("Welcome to SecureDB - Client",
            "Upload Table", Database.getDefaultDatabases()));
  }
}
