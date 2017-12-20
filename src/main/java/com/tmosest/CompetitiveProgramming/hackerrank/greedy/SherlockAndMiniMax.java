package com.tmosest.CompetitiveProgramming.hackerrank.greedy;

import java.util.Scanner;

public class SherlockAndMiniMax {

  public static boolean debugMode = false;

  private static long bruteForceMethod(long[] arr, long min, long max) {
    long maxDifference = 0;
    long result = 0;
    while(min <= max) {
      long minDifference = Long.MAX_VALUE;
      if(debugMode) {
        System.out.println("\n\nj: " + min + " minDifference: " + minDifference);
      }
      for (int i = 0; i < arr.length; i++) {
        long difference = Math.abs(arr[i] - min);
        if(debugMode) {
          System.out.println("arr[i]: " + arr[i] + " j: " + min + " difference: " + difference);
        }
        if(difference < minDifference) {
          minDifference = difference;
          if(debugMode) {
            System.out.println("minDifference: " + minDifference);
          }
          if(minDifference < maxDifference) 
            break;
        }
      }
      if(minDifference > maxDifference) {
        maxDifference = minDifference;
        result = min;
        if(debugMode) {
          System.out.println("minDifference: " + minDifference + " maxDifference: " + maxDifference + " result: " + result + "\n\n");
        }
      }
      min++;
    }
    return result;
  }

  public static long solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long arr[] = new long[n];
    for(int i = 0; i < n; i++)
      arr[i] = in.nextLong();
    long min = in.nextLong();
    long max = in.nextLong();
    in.close();
    return bruteForceMethod(arr, min, max);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
