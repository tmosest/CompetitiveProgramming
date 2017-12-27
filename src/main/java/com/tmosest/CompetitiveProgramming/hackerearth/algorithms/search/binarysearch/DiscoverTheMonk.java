package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class DiscoverTheMonk {

  public static boolean debugMode = false;

  private static int binarySearch(long[] array, long searchValue) {
    int low = 0, high = array.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (array[mid] > searchValue)
        high = mid - 1;
      else if (array[mid] < searchValue)
        low = mid + 1;
      else
        return mid;
    }
    return -1;
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int arraySize = in.nextInt();
    int tests = in.nextInt();
    if (debugMode)
      System.out.println("arraySize: " + arraySize + " tests: " + tests);
    String[] results = new String[tests];
    long[] array = new long[arraySize];
    for (int i = 0; i < arraySize; i++)
      array[i] = in.nextLong();
    Arrays.sort(array);
    for (int t = 0; t < tests; t++) {
      long searchValue = in.nextLong();
      if (debugMode)
        System.out.println("Test : " + t + " Searching for: " + searchValue);
      int searchResult = binarySearch(array, searchValue);
      results[t] = (searchResult == -1) ? "NO" : "YES";
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
