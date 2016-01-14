package controllers;

import models.*;
import play.data.Form;
import play.libs.Scala;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.sql;
import views.html.sql_edit;

import java.lang.System;
import java.rmi.RemoteException;

import static play.data.Form.form;

public class Query extends Controller {

  static Form<QueryInfo> queryInfoForm = form(QueryInfo.class);
  static QueryModel queryModel = new QueryModel();

  public static Result edit() throws RemoteException {
    return ok(sql_edit.render("Edit Query | SecureDB", "SQL Editor", Databases
            .getDatabases(), Scala.Option((QueryModel) null), Scala.Option((QueryInfo) null)));
  }

  public static Result execute() throws RemoteException {

    QueryInfo queryInfo = queryInfoForm.bindFromRequest().get();

    queryModel.executeQuery(queryInfo.getQuery());

    return ok(sql.render("Execute Query | SecureDB", "SQL Editor", Databases
            .getDatabases(), Scala.Option(queryModel), Scala.Option(queryInfo)));
  }
}
