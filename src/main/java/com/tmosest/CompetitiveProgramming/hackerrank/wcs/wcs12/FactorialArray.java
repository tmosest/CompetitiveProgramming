package com.tmosest.CompetitiveProgramming.hackerrank.wcs.wcs12;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

// http://mishadoff.com/blog/fast-factorial/
// https://www.hackerrank.com/challenges/extra-long-factorials/editorial
// http://www.geeksforgeeks.org/factorial-large-number/
public class FactorialArray {

  public static boolean debugMode = false;
  private static BigInteger mod = new BigInteger("1000000000");

  private static BigInteger factorial(long l) {
    BigInteger result = BigInteger.ONE;
    BigInteger n = new BigInteger(String.valueOf(l));
    while (!n.equals(BigInteger.ZERO)) {
      result = result.multiply(n);
      n = n.subtract(BigInteger.ONE);
    }
    if (debugMode) {
      System.out.println("factorial " + result);
    }
    return result;
  }

  private static BigInteger factorialSum(long[] nums, int l, int r) {
    BigInteger sum = BigInteger.ZERO;
    for (int i = l; i < r; i++) {
      sum = sum.add(factorial(nums[i]));
      if (debugMode) {
        System.out.println("factorial sum" + sum);
      }
    }
    return sum.mod(mod);
  }

  public static void solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int qs = in.nextInt();
    in.nextLine();
    long[] nums = new long[n];
    for (int i = 0; i < n; i++) {
      nums[i] = in.nextLong();
    }
    if (debugMode)
      System.out.println();
    int l = 0;
    int r = 0;
    for (int q = 0; q < qs; q++) {
      int op = in.nextInt();
      if (debugMode)
        System.out.println("op: " + op);
      switch (op) {
        case 1:
          l = (in.nextInt() - 1);
          r = in.nextInt();
          if (debugMode)
            System.out.println("op: " + op + " l: " + l + " r: " + r);
          for (int i = l; i < r; i++) {
            ++nums[i];
          }
          if (debugMode) {
            for (int i = 0; i < nums.length; i++) {
              System.out.print(nums[i] + " ");
            }
            System.out.println();
          }
          break;
        case 2:
          l = (in.nextInt() - 1);
          r = in.nextInt();
          if (debugMode)
            System.out.println("op: " + op + " l: " + l + " r: " + r);
          System.out.println(factorialSum(nums, l, r));
          break;
        case 3:
          int index = in.nextInt() - 1;
          long value = in.nextLong();
          if (debugMode)
            System.out.println("op: " + op + " index: " + index + " value: " + value);
          nums[index] = value;
          if (debugMode) {
            for (int i = 0; i < nums.length; i++) {
              System.out.print(nums[i] + " ");
            }
            System.out.println();
          }
          break;
      }
    }
    in.close();
  }

  public static void main(String[] args) {
    solve();
  }
}
