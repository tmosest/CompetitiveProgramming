package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndNumbers {

  public static boolean debugMode = false;

  public static long nthSmallestNumnber(long n, long[] arr, long nthSmallest) {
    if(debugMode) {
      System.out.println("\n==================================");
      System.out.println("n: " + n + " nthSmallest: " + nthSmallest);
    }
    int arr_index = 0;
    long index = 1;
    long smallestCount = 0;
    while (index < n) {
      if (debugMode) {
        System.out.println("index: " + index + " n: " + n);
        if(arr_index < arr.length)
          System.out.println("arr[arr_index]: " + arr[arr_index]);
      }
      if (arr_index < arr.length && arr[arr_index] == index) {
        if (debugMode)
          System.out.println("arr_index: " + arr_index + " arr[arr_index]: " + arr[arr_index]);
        arr_index++;
      } else {
        smallestCount++;
        if (debugMode)
          System.out.println("smallestCount: " + smallestCount + " nthSmallest: " + nthSmallest);
        if (nthSmallest == smallestCount)
          return index;
      }
      index++;
    }
    return -1;
  }

  public static long[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    long[] results = new long[tests];
    for (int t = 0; t < tests; t++) {
      long n = in.nextLong();
      int k = in.nextInt();
      long p = in.nextInt();
      long[] a = new long[k];
      for (int i = 0; i < k; i++)
        a[i] = in.nextLong();
      Arrays.sort(a);
      results[t] = nthSmallestNumnber(n, a, p);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
