package com.tmosest.competitiveprogramming.leetcode.easy;

class RectangleOverlap {
  /* Write code here. */

  /**
   * Determine if two rectangles overlap or not.
   *
   * @param rec1 The 1rst rectangle as an array.
   * @param rec2 The 2nd rectangle as an array.
   * @return True if they overlap.
   */
  boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    return !(rec1[2] <= rec2[0]
        || rec1[3] <= rec2[1]
        || rec1[0] >= rec2[2]
        || rec1[1] >= rec2[3]
      );
  }
}
