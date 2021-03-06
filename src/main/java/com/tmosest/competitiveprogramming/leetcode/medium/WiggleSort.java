package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class WiggleSort {
  /* Write code here. */

  /**
   * Wiggle sort the array of numbers.
   *
   * @param nums The numbers.
   */
  public void wiggleSort(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length - 1; i += 2) {
      swap(nums, i, i + 1);
    }
  }

  private void swap(int[] nums, int indexOne, int indexTwo) {
    int temp = nums[indexOne];
    nums[indexOne] = nums[indexTwo];
    nums[indexTwo] = temp;
  }


}
