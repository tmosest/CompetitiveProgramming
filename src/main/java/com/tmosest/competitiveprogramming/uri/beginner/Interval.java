package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class Interval {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    String result = "";
    Scanner in = new Scanner(System.in);
    double number = in.nextDouble();
    in.close();
    if (number < 0.0 || number > 100.0) {
      result = "Fora de intervalo";
    } else if (number <= 25.0) {
      result = "Intervalo [0,25]";
    } else if (number <= 50.0) {
      result = "Intervalo (25,50]";
    } else {
      result = "Intervalo (75,100]";
    }
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
