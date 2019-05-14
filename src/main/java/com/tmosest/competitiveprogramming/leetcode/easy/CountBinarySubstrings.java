package com.tmosest.competitiveprogramming.leetcode.easy;

class CountBinarySubstrings {
  /* Write code here. */

  /**
   * Counts the number of binary substrings.
   *
   * @param string The input string.
   * @return The number of binary substrings.
   */
  public int countBinarySubstrings(String string) {
    int result = 0;
    int prev = 0;
    int cur = 1;

    for (int i = 1; i < string.length(); i++) {
      if (string.charAt(i - 1) != string.charAt(i)) {
        result += Math.min(prev, cur);
        prev = cur;
        cur = 1;
      } else {
        cur++;
      }
    }

    return result + Math.min(prev, cur);
  }


}
