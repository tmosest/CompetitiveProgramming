package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryWithBonus {

  public static boolean debugMode = false;
  private static final double rate = 0.15;

  private static String roundTwoDecimals(double number) {
    DecimalFormat twoDForm = new DecimalFormat("#.00");
    return twoDForm.format(number);
  }

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    in.next();
    double basePay = in.nextDouble();
    double salesPay = in.nextDouble();
    double amount = basePay + salesPay * rate;
    in.close();
    String result = "TOTAL = R$ " + roundTwoDecimals(amount);
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
