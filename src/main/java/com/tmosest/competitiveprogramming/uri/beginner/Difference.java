package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class Difference {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int numA = in.nextInt();
    int numB = in.nextInt();
    int numC = in.nextInt();
    int numD = in.nextInt();
    in.close();
    int difference = numA * numB - numC * numD;
    return "DIFERENCA = " + difference;
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
