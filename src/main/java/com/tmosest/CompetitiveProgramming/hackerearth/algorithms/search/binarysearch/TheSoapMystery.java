package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class TheSoapMystery {

  public static boolean debugMode = false;

  private static int binarySearch(long[] array, long searchValue) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] >= searchValue)
        return i;
    }
    return array.length;
  }

  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    long[] array = new long[size];
    for (int i = 0; i < size; i++)
      array[i] = in.nextLong();
    Arrays.sort(array);
    int queries = in.nextInt();
    int[] results = new int[queries];
    for (int q = 0; q < queries; q++)
      results[q] = binarySearch(array, in.nextLong());
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
