package com.tmosest.competitiveprogramming.leetcode.easy;

class RangeAdditionTwo {
  /* Write code here. */

  /**
   * Range addition on a matrix.
   *
   * @param rows Number of rows.
   * @param cols Number of columns.
   * @param ops The ops performed.
   * @return The max.
   */
  public int maxCount(int rows, int cols, int[][] ops) {
    for (int[] op : ops) {
      rows = Math.min(rows, op[0]);
      cols = Math.min(cols, op[1]);
    }
    return rows * cols;
  }


}
