package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class SimpleProduct {

  public static boolean debugMode = false;

  /**
   * Test Function.
   *
   * @return PROD = PROD.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    String result = "PROD = " + (num1 * num2);
    in.close();
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
