package com.tmosest.competitiveprogramming.leetcode.medium;

class RangeAddition {

  /**
   * Get array after a number of modifications.
   *
   * @param length The length of the array.
   * @param updates An array of the updates.
   * @return Final array.
   */
  int[] getModifiedArray(int length, int[][] updates) {
    if (length <= 0) {
      return new int[0];
    }
    int[] ans = new int[length];
    for (int i = 0; i < updates.length; i++) {
      int start = updates[i][0];
      int end = updates[i][1];
      int inc = updates[i][2];
      ans[start] += inc;
      if (end + 1 < length) {
        ans[end + 1] -= inc;
      }
    }
    for (int i = 1; i < ans.length; i++) {
      ans[i] += ans[i - 1];
    }
    return ans;
  }
}
