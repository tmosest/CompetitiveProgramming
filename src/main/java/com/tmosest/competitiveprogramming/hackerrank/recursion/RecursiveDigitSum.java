package com.tmosest.competitiveprogramming.hackerrank.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {

  public static boolean debugMode = false;

  private static int recursiveDigitSum(String number, int kill) {
    // Handle one digit with k == 1;
    if (number.length() == 1 && kill == 1) {
      if (debugMode) {
        System.out.println("Done, returning: " + number);
      }
      return Integer.valueOf(number);
    } else if (number.length() == 1) {
      // Else handle one digit number
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < kill; i++) {
        sb.append(number);
      }
      number = sb.toString();
      if (debugMode) {
        System.out.println("Almost, returning: " + number);
      }
      return recursiveDigitSum(number, 1);
    }
    // Else we have to get down to one digit number.
    BigInteger bigInt = BigInteger.ZERO;
    for (int i = 0; i < number.length(); i++) {
      BigInteger bigIntToAdd = new BigInteger(number.substring(i, i + 1));
      bigInt = bigInt.add(bigIntToAdd);
      if (debugMode) {
        System.out.println("bigInt, bigIntToAdd: " + bigInt + " " + bigIntToAdd);
      }
    }
    number = bigInt.toString();
    return recursiveDigitSum(number, kill);
  }

  /**
   * Function for testing.
   *
   * @return Int.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    String number = in.next();
    int kill = in.nextInt();
    in.close();

    if (debugMode) {
      System.out.println("Start data: " + number + " : " + kill);
    }

    int result = recursiveDigitSum(number, kill);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
