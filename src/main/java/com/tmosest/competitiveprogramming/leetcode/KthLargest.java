package com.tmosest.competitiveprogramming.leetcode;

public class KthLargest {
  int[] maxes;

  private void setAndShift(int num) {
    int index = 0;
    int prev = 0;
    while (index < maxes.length) {
      if (maxes[index] <= num) {
        prev = maxes[index];
        maxes[index] = num;
        ++index;
        break;
      }
      ++index;
    }
    while (index < maxes.length) {
      int temp = maxes[index];
      maxes[index++] = prev;
      prev = temp;
    }
  }

  /**
   * Class to determine the kth largest in a stream.
   * @param largestK The kth largest number we will be looking for.
   * @param nums An array of numbers
   */
  public KthLargest(int largestK, int[] nums) {
    maxes = new int[largestK];
    for (int i = 0; i < maxes.length; i++) {
      maxes[i] = Integer.MIN_VALUE;
    }
    for (int num : nums) {
      setAndShift(num);
    }
  }

  /**
   * Add a new number to the stream.
   * @param val The integer to add.
   * @return The kth largest number so far.
   */
  public int add(int val) {
    setAndShift(val);
    return maxes[maxes.length - 1];
  }
}
