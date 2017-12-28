package com.tmosest.competitiveprogramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndNumbers {

  public static boolean debugMode = false;

  private static int binarySearch(long[] array, long searchValue) {
    if (searchValue < array[0])
      return 0;
    if (searchValue > array[array.length - 1])
      return array.length;
    // Slight Binary Search
    int low = 0, high = array.length - 1, mid = 0;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (searchValue > array[mid] && searchValue > array[mid + 1]) {
        low = mid + 1;
      } else if (searchValue < array[mid] && searchValue < array[mid - 1]) {
        high = mid - 1;
      } else if (searchValue > array[mid] && searchValue < array[mid + 1]) {
        return mid + 1;
      } else if (searchValue == array[mid + 1]) {
        return mid + 2;
      } else if (searchValue == array[mid]) {
        return mid + 3;
      } else {
        break;
      }
    }
    return mid;
  }

  public static long nthSmallestNumnber(long n, long[] arr, long nthSmallest) {
    if (debugMode)
      System.out.println("n: " + n + " nthSmallest: " + nthSmallest);
    int binarySearch = binarySearch(arr, nthSmallest);
    int binarySearch2 = binarySearch(arr, binarySearch + nthSmallest);
    while (binarySearch != binarySearch2) {
      if (debugMode)
        System.out.println("binarySearch: " + binarySearch + " binarySearch2: " + binarySearch2);
      binarySearch = binarySearch(arr, nthSmallest + binarySearch2);
      binarySearch2 = binarySearch(arr, nthSmallest + binarySearch);
    }
    if (debugMode) {
      System.out.println(
          "binarySearch final: " + binarySearch + " binarySearch2 final: " + binarySearch2);
    }
    return (nthSmallest + binarySearch > n) ? -1 : nthSmallest + binarySearch;
  }

  public static long[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    long[] results = new long[tests];
    for (int t = 0; t < tests; t++) {
      if (debugMode) {
        System.out.println("\n==============================");
        System.out.println("t: " + t);
      }
      long n = in.nextLong();
      int k = in.nextInt();
      long p = in.nextInt();
      long[] a = new long[k];
      for (int i = 0; i < k; i++)
        a[i] = in.nextLong();
      Arrays.sort(a);
      results[t] = nthSmallestNumnber(n, a, p);
      if (debugMode)
        System.out.println("result: " + results[t]);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
