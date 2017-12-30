package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculate {

  public static boolean debugMode = false;

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
    in.nextInt();
    int count1 = in.nextInt();
    double price1 = in.nextDouble();
    in.nextInt();
    int count2 = in.nextInt();
    double price2 = in.nextDouble();
    in.close();
    double amount = count1 * price1 + count2 * price2;
    String result = "VALOR A PAGAR: R$ " + roundTwoDecimals(amount);
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
