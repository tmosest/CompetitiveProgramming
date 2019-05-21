package com.tmosest.competitiveprogramming.leetcode.easy;

class DiStringMatch {
  /* Write code here. */

  /**
   * DI string match.
   *
   * @param str The string to search.
   * @return An array of indexes.
   */
  public int[] diStringMatch(String str) {
    int size = str.length();
    int lo = 0;
    int hi = size;
    int[] ans = new int[size + 1];
    for (int i = 0; i < size; ++i) {
      if (str.charAt(i) == 'I') {
        ans[i] = lo++;
      } else {
        ans[i] = hi--;
      }
    }
    ans[size] = lo;
    return ans;
  }


}
