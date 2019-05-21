package com.tmosest.competitiveprogramming.leetcode.easy;

class DeleteColumnsToMakeSorted {
  /* Write code here. */

  /**
   * Determine the number of columns to delete to make sorted.
   *
   * @param arr The input array of strings.
   * @return The number of deletes.
   */
  public int minDeletionSize(String[] arr) {
    int result = 0;
    for (int c = 0; c < arr[0].length(); ++c) {
      for (int r = 0; r < arr.length - 1; ++r) {
        if (arr[r].charAt(c) > arr[r + 1].charAt(c)) {
          result++;
          break;
        }
      }
    }
    return result;
  }


}
