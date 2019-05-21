package com.tmosest.competitiveprogramming.leetcode.easy;

class ConstructTheRectangle {
  /* Write code here. */

  /**
   * Construct a rectangle with the given area and width not greater than length.
   *
   * @param area The area that the rectangle needs to have.
   * @return The length and width of the rectangle.
   */
  public int[] constructRectangle(int area) {
    int sqRoot = (int) Math.sqrt(area);
    int num = sqRoot;
    for (; num > 0; num--) {
      if (area % num == 0) {
        return new int[]{area / num, num};
      }
    }
    return new int[]{area / num, num};
  }


}
