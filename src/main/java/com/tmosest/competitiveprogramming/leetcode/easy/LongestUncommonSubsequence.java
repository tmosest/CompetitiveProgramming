package com.tmosest.competitiveprogramming.leetcode.easy;

class LongestUncommonSubsequence {
  /* Write code here. */

  /**
   * Determine longest uncommon sequence between two strings.
   *
   * @param one String one.
   * @param two String two.
   * @return The length of the LUS.
   */
  public int findLUsLength(String one, String two) {
    if (one.equals(two)) {
      return -1;
    }
    return Math.max(one.length(), two.length());
  }


}
