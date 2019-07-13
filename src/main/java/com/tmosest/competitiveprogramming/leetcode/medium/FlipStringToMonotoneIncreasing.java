package com.tmosest.competitiveprogramming.leetcode.medium;

class FlipStringToMonotoneIncreasing {

  /**
   * Determine the number of moves for monotonic increasing.
   *
   * @param str The string.
   * @return The number of moved to make monotonic increasing.
   */
  int minFlipsMonoIncr(String str) {
    int len = str.length();
    int[] elen = new int[len + 1];
    for (int i = 0; i < len; ++i) {
      elen[i + 1] = elen[i] + (str.charAt(i) == '1' ? 1 : 0);
    }

    int ans = Integer.MAX_VALUE;
    for (int j = 0; j <= len; ++j) {
      ans = Math.min(ans, elen[j] + len - j - (elen[len] - elen[j]));
    }

    return ans;
  }
}
