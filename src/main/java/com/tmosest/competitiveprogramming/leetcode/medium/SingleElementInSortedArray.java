package com.tmosest.competitiveprogramming.leetcode.medium;

class SingleElementInSortedArray {

  /**
   * Find single non-dupe.
   *
   * @param nums The nums.
   * @return The one element without a dupe.
   */
  int singleNonDuplicate(int[] nums) {
    for (int i = 0; i < nums.length - 1; i += 2) {
      if (nums[i] != nums[i + 1]) {
        return nums[i];
      }
    }
    return nums[nums.length - 1];
  }
}
