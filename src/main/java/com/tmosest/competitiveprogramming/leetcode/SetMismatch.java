package com.tmosest.competitiveprogramming.leetcode;

public class SetMismatch {

  /**
   * Find the dupe and missing element in an array of 1..n.
   * @param nums The array of numbers.
   * @return An array with index 0 being the dupe and index 1 being the missing.
   */
  public int[] findErrorNums(int[] nums) {
    int[] result = new int[2];
    int[] counts = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      counts[nums[i] - 1]++;
    }
    for (int i = 0; i < nums.length; i++) {
      if (counts[i] == 2) {
        result[0] = i + 1;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (counts[i] == 0) {
        result[1] = i + 1;
      }
    }
    return result;
  }
}
