package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {

  public static boolean debugMode = false;
  private static double pi = 3.14159;

  private static String roundTwoDecimals(double number) {
    DecimalFormat twoDForm = new DecimalFormat("#.000");
    return twoDForm.format(number);
  }

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int radius = in.nextInt();
    in.close();
    double volume = (4 * pi * radius * radius * radius) / 3;
    String result = "VOLUME = " + roundTwoDecimals(volume);
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
