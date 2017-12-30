package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfACircle {

  private static final double pi = 3.14159;
  public static boolean debugMode = false;

  private static String roundTwoDecimals(double number) {
    DecimalFormat twoDForm = new DecimalFormat("#.0000");
    return twoDForm.format(number);
  }


  /**
   * Test function.
   *
   * @return Return string result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    double radius = in.nextDouble();
    if (debugMode) {
      System.out.println("radius: " + radius);
    }
    in.close();
    double area = pi * radius * radius;
    String result = "A=" + roundTwoDecimals(area);
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
