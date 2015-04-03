package edu.hku.sdb.utility;

/**
 * Created by Eric Haibin Lin on 3/4/15.
 */
public class ProfileUtil {

  long start;
  long end;

  public ProfileUtil() {
    start = System.currentTimeMillis();
  }

  private void end(){
    end = System.currentTimeMillis();
  }

  public long getDuration(){
    end();
    return end - start;
  }
}
