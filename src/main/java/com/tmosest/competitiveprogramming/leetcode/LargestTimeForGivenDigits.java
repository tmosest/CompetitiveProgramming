package com.tmosest.competitiveprogramming.leetcode;

public class LargestTimeForGivenDigits {

  /**
   * Given an array of numbers determine the largest time.
   * @param input The input array.
   * @return The largest time.
   */
  public String largestTimeFromDigits(int[] input) {
    int ans = -1;
    // Choose different indices i, j, k, l as a permutation of 0, 1, 2, 3
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 4; ++j) {
        if (j != i) {
          for (int k = 0; k < 4; ++k) {
            if (k != i && k != j) {
              int len = 6 - i - j - k;
              // For each permutation of input[i], read out the time and
              // record the largest legal time.
              int hours = 10 * input[i] + input[j];
              int mins = 10 * input[k] + input[len];
              if (hours < 24 && mins < 60) {
                ans = Math.max(ans, hours * 60 + mins);
              }
            }
          }
        }
      }
    }
    return ans >= 0 ? String.format("%02d:%02d", ans / 60, ans % 60) : "";
  }
}
