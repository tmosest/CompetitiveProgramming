package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class TimeConversion {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int time = in.nextInt();
    in.close();
    int hours = time / 3600;
    int minutes = (time % 3600) / 60;
    int seconds = time % 60;
    String result = hours + ":" + minutes + ":" + seconds;
    return result;
  }

  /**
   * Main function.
   *
   * @param args String array.
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }

}
