package controllers;

import java.util.List;

import play.libs.Scala;
import play.mvc.*;
import views.html.*;
import models.*;

public class Client extends Controller {

	public static Result index() {
		return ok(main.render("Welcome to SecureDB - Client",
				"SecureDB Client", Database.getDefaultDatabases()));
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
