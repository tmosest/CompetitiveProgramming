package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.math.BigInteger;
import java.util.Scanner;

// http://mishadoff.com/blog/fast-factorial/
// https://www.hackerrank.com/challenges/extra-long-factorials/editorial
// http://www.geeksforgeeks.org/factorial-large-number/
public class FactorialArray {

  public static boolean debugMode = false;
  private static BigInteger mod = new BigInteger("1000000000");

  private static BigInteger factorial(long lon) {
    BigInteger result = BigInteger.ONE;
    BigInteger num = new BigInteger(String.valueOf(lon));
    while (!num.equals(BigInteger.ZERO)) {
      result = result.multiply(num);
      num = num.subtract(BigInteger.ONE);
    }
    if (debugMode) {
      System.out.println("factorial " + result);
    }
    return result;
  }

  private static BigInteger factorialSum(long[] nums, int left, int right) {
    BigInteger sum = BigInteger.ZERO;
    for (int i = left; i < right; i++) {
      sum = sum.add(factorial(nums[i]));
      if (debugMode) {
        System.out.println("factorial sum" + sum);
      }
    }
    return sum.mod(mod);
  }

  /**
   * Function to test the solution.
   */
  public static void solve() {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int qs = in.nextInt();
    in.nextLine();
    long[] nums = new long[num];
    for (int i = 0; i < num; i++) {
      nums[i] = in.nextLong();
    }
    int left = 0;
    int right = 0;
    for (int q = 0; q < qs; q++) {
      int op = in.nextInt();
      if (debugMode) {
        System.out.println("op: " + op);
      }
      switch (op) {
        case 1:
          left = (in.nextInt() - 1);
          right = in.nextInt();
          if (debugMode) {
            System.out.println("op: " + op + " l: " + left + " r: " + right);
          }
          for (int i = left; i < right; i++) {
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
          left = (in.nextInt() - 1);
          right = in.nextInt();
          if (debugMode) {
            System.out.println("op: " + op + " l: " + left + " r: " + right);
          }
          System.out.println(factorialSum(nums, left, right));
          break;
        case 3:
          int index = in.nextInt() - 1;
          long value = in.nextLong();
          if (debugMode) {
            System.out.println("op: " + op + " index: " + index + " value: " + value);
          }
          nums[index] = value;
          if (debugMode) {
            for (int i = 0; i < nums.length; i++) {
              System.out.print(nums[i] + " ");
            }
            System.out.println();
          }
          break;
        default:
          break;
      }
    }
    in.close();
  }

  /**
   * Main function.
   *
   * @param args String array.
   */
  public static void main(String[] args) {
    solve();
  }
}
