package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class SimpleSum {

  public static boolean debugMode = false;

  /**
   * Test Function.
   *
   * @return Returns SOMA = SUM.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    return "SOMA = " + (num1 + num2);
  }

  /**
   * Main function.
   *
   * @param args Main String args.
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }
}
