package com.tmosest.competitiveprogramming.leetcode.medium;

class LongestMountainInArray {

  /**
   * Determine the length of the longest mountain.
   *
   * @param arr The array of values.
   * @return The length of the longest mountain.
   */
  int longestMountain(int[] arr) {
    int len = arr.length;
    int ans = 0;
    int base = 0;
    while (base < len) {
      int end = base;
      // if base is a left-boundary
      if (end + 1 < len && arr[end] < arr[end + 1]) {
        // set end to the peak of this potential mountain
        while (end + 1 < len && arr[end] < arr[end + 1]) {
          end++;
        }

        // if end is really a peak..
        if (end + 1 < len && arr[end] > arr[end + 1]) {
          // set end to the right-boundary of mountain
          while (end + 1 < len && arr[end] > arr[end + 1]) {
            end++;
          }
          // record candidate answer
          ans = Math.max(ans, end - base + 1);
        }
      }

      base = Math.max(end, base + 1);
    }

    return ans;
  }
}
