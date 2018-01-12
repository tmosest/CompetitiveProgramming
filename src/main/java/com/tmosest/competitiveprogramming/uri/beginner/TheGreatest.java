package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class TheGreatest {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    while (in.hasNextInt()) {
      int num = in.nextInt();
      max = Math.max(max, num);
    }
    in.close();
    String result = max + " eh o maior";
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
