package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelSpent {
  private static double rate = 12.0;
  public static boolean debugMode = false;

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
    int hours = in.nextInt();
    int speed = in.nextInt();
    in.close();
    double gasRate = hours * speed / rate;
    String result = roundTwoDecimals(gasRate);
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
