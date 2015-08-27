package controllers;

import java.lang.String;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import play.libs.Scala;
import play.mvc.*;
import views.html.*;
import models.*;

public class Client extends Controller {

  public static Result index() throws RemoteException {
    return ok(main.render("Welcome to SecureDB - Client",
            "SecureDB Client", system_info.render(), Databases.getDatabases()));
  }

  public static Result setting() throws RemoteException {

    List<Attribute> attributes = Attribute.getDefaultAttributesEmployee();

    return ok(setting.render("Welcome to SecureDB - Client",
            "Edit Priviledges", attributes, Databases.getDatabases()));
  }

  public static Result database() throws RemoteException {

    return ok(database.render("Welcome to SecureDB - Client",
            "View Database", Databases.getDatabases()));
  }

  public static Result table() throws RemoteException {

    return ok(table.render("Welcome to SecureDB - Client",
            "View Database", Databases.getDatabases()));
  }

  public static Result upload() throws RemoteException {

    return ok(upload.render("Welcome to SecureDB - Client",
            "Upload Table", Databases.getDatabases()));
  }
}
