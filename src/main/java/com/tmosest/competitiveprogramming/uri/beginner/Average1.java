package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average1 {

  public static boolean debugMode = false;

  private static String roundTwoDecimals(double number) {
    DecimalFormat twoDForm = new DecimalFormat("#.00000");
    return twoDForm.format(number);
  }

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    double num1 = in.nextDouble() * 3.5;
    double num2 = in.nextDouble() * 7.5;
    in.close();
    double avg = (num1 + num2) / 11;
    String result = "MEDIA = " + roundTwoDecimals(avg);
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
