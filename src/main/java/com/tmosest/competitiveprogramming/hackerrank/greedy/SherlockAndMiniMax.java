package com.tmosest.competitiveprogramming.hackerrank.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndMiniMax {

  public static boolean debugMode = false;

  private static void printArray(long[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  private static class Difference implements Comparable<Difference> {
    private int index;
    private long difference;

    public Difference(int index, long difference) {
      this.index = index;
      this.difference = difference;
    }

    @Override
    public int compareTo(Difference other) {
      return Long.compare(this.difference, other.difference);
    }

    public String toString() {
      return "{index: " + index + ", difference: " + difference + "} ";
    }

    public static void printArray(Difference[] arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i].toString());
      }
      System.out.println();
    }
  }

  private static boolean isContainedIn(long value, long min, long max) {
    return (min <= value) && (value <= max);
  }

  private static long optimizedApproach(long[] arr, long min, long max) {
    if (debugMode) {
      System.out.println("min: " + min + " max: " + max);
    }
    // Need to make sure that the array is sorted
    Arrays.sort(arr);
    // Handle edge case 1
    if (max < arr[0]) {
      return Math.abs(min - arr[0]);
    }
    // Handle edge case 2
    if (min > arr[arr.length - 1]) {
      return Math.abs(max - arr[arr.length - 1]);
    }
    // Otherwise
    Difference[] differenceArray = new Difference[arr.length - 1];
    for (int i = 0; i < differenceArray.length; i++) {
      long difference = Math.abs(arr[i + 1] - arr[i]);
      differenceArray[i] = new Difference(i, difference);
    }
    Arrays.sort(differenceArray);
    if (debugMode) {
      printArray(arr);
      Difference.printArray(differenceArray);
    }
    long leftOffset = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > min) {
        leftOffset =
            (leftOffset != Integer.MIN_VALUE) ? Math.min(leftOffset, Math.abs(min - arr[i]))
                : Math.abs(min - arr[i]);
        break;
      }
      leftOffset = Math.abs(min - arr[i]);
    }
    long rightOffset = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        rightOffset =
            (rightOffset != Integer.MIN_VALUE) ? Math.min(rightOffset, Math.abs(max - arr[i]))
                : Math.abs(max - arr[i]);
        break;
      }
      rightOffset = Math.abs(max - arr[i]);
    }
    Difference bestDifference = null;
    long result = max;
    for (int i = 0; i < differenceArray.length; i++) {
      int index = differenceArray[i].index;
      long difference = differenceArray[i].difference;
      long value = arr[index];
      long midPoint = arr[index] + difference / 2;
      if (debugMode) {
        System.out.println("index: " + index + " difference: " + difference + " value: " + value
            + " midPoint: " + midPoint);
      }
      if (isContainedIn(midPoint, min, max)) {
        if (debugMode) {
          System.out.println("Potential Point: " + midPoint);
        }
        if (bestDifference == null || difference > bestDifference.difference) {
          bestDifference = differenceArray[i];
          if (debugMode) {
            System.out.println("Best Difference Now: " + bestDifference.toString());
          }
        }
      }
    }
    result = arr[bestDifference.index] + bestDifference.difference / 2;
    if (debugMode) {
      System.out.println(
          "result: " + result + " leftOffset: " + leftOffset + " rightOffset: " + rightOffset);
    }
    if (leftOffset >= bestDifference.difference / 2) {
      result = min;
    }
    if (rightOffset > bestDifference.difference / 2) {
      result = max;
    }
    if (debugMode) {
      System.out.println("final result: " + result);
    }
    return result;
  }

  /**
   * Scans in an array and finds the minimax.
   * 
   * @return long integer representing the minimax value.
   */
  public static long solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    long[] arr = new long[size];
    for (int i = 0; i < size; i++) {
      arr[i] = in.nextLong();
    }
    long min = in.nextLong();
    long max = in.nextLong();
    in.close();
    return optimizedApproach(arr, min, max);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
