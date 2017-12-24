package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class TheSoapMystery {

  public static boolean debugMode = false;

  private static void printArray(long[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
      if (i > 0 && i % 10 == 0)
        System.out.println();
    }
    System.out.println();
  }

  private static int binarySearch(long[] array, long searchValue) {
    if (debugMode)
      System.out.println("searchValue: " + searchValue);
    if (searchValue < array[0])
      return 0;
    if (searchValue > array[array.length - 1])
      return array.length;
    // Slight Binary Search
    int low = 0, high = array.length - 1, mid = 0;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (debugMode) {
        System.out.println("low: " + low + " high: " + high + " mid: " + mid);
        System.out.println("array[mid]: " + array[mid] + " searchValue: " + searchValue);
        if(mid - 1 > 0)
          System.out.println("array[mid - 1]: " + array[mid - 1]);
        if(mid + 1 < array.length)
          System.out.println("array[mid + 1]: " + array[mid + 1]);
      }
      if (searchValue > array[mid] && searchValue > array[mid + 1]) {
        if (debugMode)
          System.out.println("too big");
        low = mid + 1;
      } else if (searchValue < array[mid] && searchValue < array[mid - 1]) {
        if (debugMode)
          System.out.println("too small");
        high = mid - 1;
      } else if (searchValue > array[mid] && searchValue <= array[mid + 1]) {
        return mid + 1; 
      } else {
        break;
      }
    }
    for(int i = mid - 100; i < mid + 100; i++) {
      if(i >= 0 && i < array.length)
        if(array[i] >= searchValue) {
          mid = i;
          break;
        }
    }
    return mid;
  }

  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    if (debugMode)
      System.out.println("size: " + size);
    long[] array = new long[size];
    for (int i = 0; i < size; i++)
      array[i] = in.nextLong();
    Arrays.sort(array);
    if (debugMode)
      printArray(array);
    int queries = in.nextInt();
    if (debugMode)
      System.out.println("queries: " + queries);
    int[] results = new int[queries];
    for (int q = 0; q < queries; q++) {
      if (debugMode) {
        System.out.println("\n=================================");
        System.out.println("q: " + q);
      }
      results[q] = binarySearch(array, in.nextLong());
      if (debugMode) {
        System.out.println("\n=================================");
      }
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
