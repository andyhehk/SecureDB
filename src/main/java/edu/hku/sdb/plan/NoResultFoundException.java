package edu.hku.sdb.plan;

import edu.hku.sdb.parse.ParseError;

import java.util.ArrayList;

/**
 * Created by Eric Haibin Lin on 23/3/15.
 */
public class NoResultFoundException extends Exception {

  private static final long serialVersionUID = 11323L;
  String error;

  public NoResultFoundException(String error) {
    super();
    this.error = error;
  }

  @Override
  public String getMessage() {
    return error;
  }

}
