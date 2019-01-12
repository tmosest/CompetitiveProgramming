package com.tmosest.competitiveprogramming.leetcode;

public class PeakIndexMountainArray {

  /**
   * Find the max peak size.
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
