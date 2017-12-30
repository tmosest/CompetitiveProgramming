package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

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
    int employeeId = in.nextInt();
    int hours = in.nextInt();
    double payRate = in.nextDouble();
    in.close();
    String result = "NUMBER = " + employeeId + "\n";
    result += "SALARY = U$ " + roundTwoDecimals(hours * payRate);
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
