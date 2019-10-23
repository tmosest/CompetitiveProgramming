package com.tmosest.competitiveprogramming.leetcode.easy;

class SplitStringInBalancedStrings {

  /**
   * Determine max number of splits.
   * @param str The string.
   * @return The max number of balanced splits.
   */
  int balancedStringSplit(String str) {
    int res = 0;
    int count = 0;
    for (char c : str.toCharArray()) {
      if (c == 'L') {
        count++;
      } else {
        count--;
      }
      if (count == 0) {
        res++;
      }
    }
    return res;
  }
}
