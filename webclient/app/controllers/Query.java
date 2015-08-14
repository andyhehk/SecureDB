package controllers;

import models.Database;
import models.QueryModel;
import play.data.Form;
import play.libs.Scala;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.sql;
import views.html.sql_edit;

import static play.data.Form.form;

public class Query extends Controller {

  static Form<models.QueryModel> queryModelForm = form(QueryModel.class);

  public static Result edit() {
    return ok(sql_edit.render("Edit Query | SecureDB", "SQL Editor", Database.getDefaultDatabases(), Scala.Option((QueryModel) null)));
  }

  public static Result execute() {
    QueryModel queryModel = queryModelForm.bindFromRequest().get();
    queryModel.init();

    return ok(sql.render("Execute Query | SecureDB", "SQL Editor", Database.getDefaultDatabases(), Scala.Option(queryModel)));
  }
}
