package com.tmosest.CompetitiveProgramming.hackerrank.wcs.wcs12;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FactorialArray {

  public static boolean debugMode = false;
  private static BigInteger mod = new BigInteger("1000000000");

  private static BigInteger factorial(BigInteger n) {
    BigInteger result = BigInteger.ONE;

    while (!n.equals(BigInteger.ZERO)) {
      result = result.multiply(n);
      n = n.subtract(BigInteger.ONE);
    }
    if (debugMode) {
      System.out.println("factorial " + result);
    }
    return result;
  }

  private static BigInteger factorialSum(BigInteger[] nums, int l, int r) {
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
    BigInteger[] nums = new BigInteger[n];
    String line1 = in.nextLine();
    if (debugMode)
      System.out.println(line1);
    String[] array = line1.split(" ");
    for (int i = 0; i < n; i++) {
      if (debugMode) {
        System.out.print(array[i] + " ");
      }
      nums[i] = new BigInteger(array[i]);
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
            nums[i] = nums[i].add(BigInteger.ONE);
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
          nums[index] = new BigInteger(String.valueOf(value));
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
