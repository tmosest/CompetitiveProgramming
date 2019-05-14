package com.tmosest.competitiveprogramming.leetcode.easy;

class PeakIndexMountainArray {
  /* Write code here. */

  /**
   * Find the max peak size.
   *
   * @param mountain An array of mountain sizes.
   * @return The max peak size.
   */
  public int peakIndexInMountainArray(int[] mountain) {
    int max = 0;
    while (mountain[max] < mountain[max + 1]) {
      max++;
    }
    return max;
  }


}
