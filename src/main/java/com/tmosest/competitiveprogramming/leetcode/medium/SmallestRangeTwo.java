package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class SmallestRangeTwo {
  /* Write code here. */

  /**
   * Return the smallest distance from min to max.
   *
   * @param arr The array of values.
   * @param toAdd The value we can add or subtract from each value in the array.
   * @return The smallest difference between the min and the max.
   */
  int smallestRangeTwo(int[] arr, int toAdd) {
    int length = arr.length;
    Arrays.sort(arr);
    int ans = arr[length - 1] - arr[0];

    for (int i = 0; i < arr.length - 1; ++i) {
      int curr = arr[i];
      int next = arr[i + 1];
      int high = Math.max(arr[length - 1] - toAdd, curr + toAdd);
      int low = Math.min(arr[0] + toAdd, next - toAdd);
      ans = Math.min(ans, high - low);
    }

    return ans;
  }


}
