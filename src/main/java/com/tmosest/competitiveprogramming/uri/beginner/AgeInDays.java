package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class AgeInDays {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int numDays = in.nextInt();
    in.close();
    int years = numDays / 365;
    int months = (numDays % 365) / 30;
    int days = numDays % 365 % 30;
    String result = years + " ano(s)\n"
        + months + " mes(es)\n"
        + days + " dia(s)";
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
