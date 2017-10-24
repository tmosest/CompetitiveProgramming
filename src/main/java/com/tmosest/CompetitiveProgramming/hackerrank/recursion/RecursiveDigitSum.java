package com.tmosest.CompetitiveProgramming.hackerrank.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {

  public static boolean debugMode = false;

  public static int recursiveDigitSum(String number, int k) {
    // Handle one digit with k == 1;
    if(number.length() == 1 && k == 1) {
      if(debugMode)
        System.out.println("Done, returning: " + number);
      return Integer.valueOf(number);
    }
    // Else handle one digit number
    else if(number.length() == 1) {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < k; i++) 
        sb.append(number);
      number = sb.toString();
      if(debugMode)
        System.out.println("Almost, returning: " + number);
      return recursiveDigitSum(number, 1);
    }
    // Else we have to get down to one digit number.
    BigInteger bigInt = BigInteger.ZERO;
    for(int i = 0; i < number.length(); i++) {
      BigInteger bigIntToAdd = new BigInteger(number.substring(i, i + 1));
      bigInt = bigInt.add(bigIntToAdd);
      if(debugMode) {
        System.out.println("bigInt, bigIntToAdd: " + bigInt + " " + bigIntToAdd);
      }
    }
    number = bigInt.toString();
    return recursiveDigitSum(number, k);
  }

  public static int solve() {
    Scanner in = new Scanner(System.in);
    String number = in.next();
    int k = in.nextInt();
    in.close();

    if (debugMode)
      System.out.println("Start data: " + number + " : " + k);

    int result = recursiveDigitSum(number, k);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
