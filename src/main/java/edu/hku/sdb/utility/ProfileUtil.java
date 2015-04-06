package edu.hku.sdb.utility;

/**
 * Created by Eric Haibin Lin on 3/4/15.
 */
public class ProfileUtil {

  long start;
  long end;
  boolean isPrecise = false;

  public ProfileUtil() {
    start = isPrecise ? System.nanoTime() : System.currentTimeMillis();
  }

  public ProfileUtil(boolean isPrecise){
    this.isPrecise = isPrecise;
    start = isPrecise ? System.nanoTime() : System.currentTimeMillis();
  }

  public long getDuration(){
    end = isPrecise ? System.nanoTime() : System.currentTimeMillis();
    return end - start;
  }
}
