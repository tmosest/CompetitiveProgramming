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
      result = result.multiply(n).mod(mod);
      n = n.subtract(BigInteger.ONE);
    }
    if (debugMode) {
      System.out.println("factorial " + result);
    }
    return result.mod(mod);
  }

  private static BigInteger factorialSum(BigInteger[] nums) {
    BigInteger sum = BigInteger.ZERO;
    for (int i = 0; i < nums.length; i++) {
      sum = sum.add(factorial(nums[i])).mod(mod);
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
    for (int q = 0; q < qs; q++) {
      String line = in.nextLine();
      int[] ops = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
      switch (ops[0]) {
        case 1:
          for (int i = ops[1] - 1; i < ops[2]; i++) {
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
          System.out.println(factorialSum(nums));
          break;
        case 3:
          nums[ops[1] - 1] = new BigInteger(String.valueOf(ops[2]));
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
