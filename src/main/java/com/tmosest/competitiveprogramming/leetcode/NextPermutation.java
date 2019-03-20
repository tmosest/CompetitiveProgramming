package com.tmosest.competitiveprogramming.leetcode;

public class NextPermutation {

  /**
   * Find next largest permutation in place.
   * @param nums An array of numbers.
   */
  public void nextPermutation(int[] nums) {
    int one = nums.length - 2;
    while (one >= 0 && nums[one + 1] <= nums[one]) {
      one--;
    }
    if (one >= 0) {
      int two = nums.length - 1;
      while (two >= 0 && nums[two] <= nums[one]) {
        two--;
      }
      swap(nums, one, two);
    }
    reverse(nums, one + 1);
  }

  private void reverse(int[] nums, int start) {
    int one = start;
    int two = nums.length - 1;
    while (one < two) {
      swap(nums, one, two);
      one++;
      two--;
    }
  }

  private void swap(int[] nums, int one, int two) {
    int temp = nums[one];
    nums[one] = nums[two];
    nums[two] = temp;
  }
}
