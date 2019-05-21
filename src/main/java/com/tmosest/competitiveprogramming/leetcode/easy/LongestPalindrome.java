package com.tmosest.competitiveprogramming.leetcode.easy;

class LongestPalindrome {
  /* Write code here. */

  /**
   * Determine the longest palindrome in a string.
   *
   * @param str The string to look through.
   * @return The length of the longest palindrome in the string.
   */
  public int longestPalindrome(String str) {
    int[] count = new int[128];
    for (char c : str.toCharArray()) {
      count[c]++;
    }

    int ans = 0;
    for (int v : count) {
      ans += v / 2 * 2;
      if (ans % 2 == 0 && v % 2 == 1) {
        ans++;
      }
    }
    return ans;
  }


}
