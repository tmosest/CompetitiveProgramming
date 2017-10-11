package commons;

import java.util.Date;

/**
 * This class represents a stop watch determining how long an algorithm takes.
 * @author tmosest
 */
public class StopWatch {

  private long startTime;
  private long stopTime;
  
  public void clear() {
    startTime = 0;
    stopTime = 0;
  }
  
  private long getTime() {
    return new Date().getTime();
  }
  
  public void start() {
    startTime = getTime();
  }
  
  public void stop() {
    stopTime = getTime();
  }
  
  public long getElapsedTime() {
    return stopTime - startTime;
  }
}
