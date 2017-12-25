package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndNumbers {

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
    // if (debugMode)
    //  System.out.println("searchValue: " + searchValue);
    if (searchValue < array[0])
      return 0;
    if (searchValue > array[array.length - 1])
      return array.length;
    // Slight Binary Search
    int low = 0, high = array.length - 1, mid = 0;
    while (low <= high) {
      mid = low + (high - low) / 2;
      /*if (debugMode) {
        System.out.println("low: " + low + " high: " + high + " mid: " + mid);
        System.out.println("array[mid]: " + array[mid] + " searchValue: " + searchValue);
        if(mid - 1 > 0)
          System.out.println("array[mid - 1]: " + array[mid - 1]);
        if(mid + 1 < array.length)
          System.out.println("array[mid + 1]: " + array[mid + 1]);
      }*/
      if (searchValue > array[mid] && searchValue > array[mid + 1]) {
        // if (debugMode)
        //  System.out.println("too big");
        low = mid + 1;
      } else if (searchValue < array[mid] && searchValue < array[mid - 1]) {
        // if (debugMode)
        //   System.out.println("too small");
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

  public static long nthSmallestNumnber(long n, long[] arr, long nthSmallest) {
    int count1 = binarySearch(arr, nthSmallest);
    if(debugMode)
      System.out.println("count1 init: " + count1);
    int count2 = 0;
    while(count1 != count2) {
      count2 = binarySearch(arr, nthSmallest + count1);
      count1 = binarySearch(arr, nthSmallest + count2);
      if(debugMode)
        System.out.println("count1: " + count1 + " count2: " + count2);
    }
    nthSmallest = nthSmallest + count1;
    if(debugMode)
      System.out.println("nthSmallest: " + nthSmallest);
    nthSmallest = (nthSmallest >= n) ? -1 : nthSmallest;
    return nthSmallest;
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
      if(debugMode)
        printArray(a);
      results[t] = nthSmallestNumnber(n, a, p);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
