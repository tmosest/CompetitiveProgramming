package com.tmosest.competitiveprogramming.leetcode;

public class PairsOfSongsWithTotalDurationsDivisibleBySixty {

  /**
   * Determine the number of pairs whose sum is divisible by 60.
   * @param time An array of times.
   * @return The number of paris divisible by sixty.
   */
  public int numPairsDivisibleBy60(int[] time) {
    int result = 0;
    for (int i = 0; i < time.length - 1; i++) {
      for (int j = i + 1; j < time.length; j++) {
        if ((time[i] + time[j]) % 60 == 0) {
          ++result;
        }
      }
    }
    return result;
  }
}
