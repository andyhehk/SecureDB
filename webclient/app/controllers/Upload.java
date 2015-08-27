package controllers;

import models.*;
import play.data.Form;
import play.libs.Scala;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.sql_edit;
import views.html.table_create;
import views.html.table_upload;

import java.rmi.RemoteException;

import static play.data.Form.form;

/**
 * Created by Eric Haibin Lin on 29/3/15.
 */
public class Upload extends Controller {

  static Form<UploadTableModel> uploadTableModelForm = form(UploadTableModel.class);

  public static Result edit() throws RemoteException {
    return ok(table_create.render("Create Table | SecureDB", "Create Table Editor", Databases.getDatabases(), Scala.Option((UploadTableModel) null)));
  }

  public static Result create() throws RemoteException {
    return ok(table_upload.render("Choose Data Source | SecureDB", "Upload Data", Databases.getDatabases(), Scala.Option((UploadTableModel) null)));
  }

  public static Result upload() throws RemoteException {
    UploadTableModel uploadTableModel = uploadTableModelForm.bindFromRequest().get();
    uploadTableModel.init();
    return ok(sql_edit.render("Edit Query | SecureDB", "SQL Editor", Databases.getDatabases(), Scala.Option((QueryModel) null)));
  }
}
