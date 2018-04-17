package com.tmosest.competitiveprogramming.hackerearth.algorithms.search.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RoundTableMeeting {

  public static boolean debugMode = false;

  private static int findMinimumTime(int[] universities, int university1, int university2) {
    if (university1 == university2) {
      return 0;
    }

    if (debugMode) {
      System.out.println("\n==============================");
      System.out.println("university1: " + university1 + " university2: " + university2);
      System.out.println("==============================");
    }
    Set<Integer> students1 = new HashSet<Integer>();
    Set<Integer> students2 = new HashSet<Integer>();
    for (int i = 0; i < universities.length; i++) {
      if (universities[i] == university1) {
        students1.add(i);
      }
      if (universities[i] == university2) {
        students2.add(i);
      }
    }
    int minimumTime = Integer.MAX_VALUE;
    for (int index1 : students1) {
      for (int index2 : students2) {
        int normalDifference = Math.abs(index2 - index1);
        int roundDifference = universities.length - normalDifference;
        int difference = Math.min(normalDifference, roundDifference);
        minimumTime = Math.min(minimumTime, (difference) / 2);
        if (debugMode) {
          System.out
              .println("index1: " + index1 + " index2: " + index2 + " minimumTime: " + minimumTime);
          System.out.println("normalDifference: " + normalDifference + " roundDifference: "
              + roundDifference + " difference: " + difference);
        }
        if (minimumTime <= 0) {
          break;
        }
      }
    }
    if (debugMode) {
      System.out.println("final time: " + minimumTime);
    }
    return (minimumTime > 0) ? minimumTime : 0;
  }

  /**
   * Test function.
   *
   * @return int array.
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int arraySize = in.nextInt();
    int queries = in.nextInt();
    int[] universities = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      universities[i] = in.nextInt();
    }
    int[] results = new int[queries];
    for (int i = 0; i < queries; i++) {
      int university1 = in.nextInt();
      int university2 = in.nextInt();
      results[i] = findMinimumTime(universities, university1, university2);
    }
    in.close();
    return results;
  }

  /**
   * Main function.
   *
   * @param args Main String array.
   */
  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
