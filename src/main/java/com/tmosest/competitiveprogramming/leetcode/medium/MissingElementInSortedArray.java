package com.tmosest.competitiveprogramming.leetcode.medium;

class MissingElementInSortedArray {

  /**
   * Determine the kth missing element.
   *
   * @param nums The ordered nummbers.
   * @param kth Looking for kth missing one.
   * @return The kth missing element.
   */
  int missingElement(int[] nums, int kth) {
    int len = nums.length;
    // If kth missing number is larger than
    // the last element of the array
    if (kth > missing(len - 1, nums)) {
      return nums[len - 1] + kth - missing(len - 1, nums);
    }

    int idx = 1;
    // find idx such that
    // missing(idx - 1) < k <= missing(idx)
    while (missing(idx, nums) < kth) {
      idx++;
    }

    // kth missing number is larger than nums[idx - 1]
    // and smaller than nums[idx]
    return nums[idx - 1] + kth - missing(idx - 1, nums);
  }

  private int missing(int idx, int[] nums) {
    return nums[idx] - nums[0] - idx;
  }
}
