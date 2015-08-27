package controllers;

import models.*;
import play.data.Form;
import play.libs.Scala;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.sql;
import views.html.sql_edit;

import java.rmi.RemoteException;

import static play.data.Form.form;

public class Query extends Controller {

  static Form<models.QueryModel> queryModelForm = form(QueryModel.class);

  public static Result edit() throws RemoteException {
    return ok(sql_edit.render("Edit Query | SecureDB", "SQL Editor", Databases
            .getDatabases(), Scala.Option((QueryModel) null)));
  }

  public static Result execute() throws RemoteException {
    QueryModel queryModel = queryModelForm.bindFromRequest().get();
    queryModel.init();

    return ok(sql.render("Execute Query | SecureDB", "SQL Editor", Databases.getDatabases(), Scala.Option(queryModel)));
  }
}
