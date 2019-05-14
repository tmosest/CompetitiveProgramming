package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class ValidTriangleNumber {
  /* Write code here. */

  /**
   * Determine the number of triangles that could be created.
   *
   * @param nums An array of numbers.
   * @return The number of triangles.
   */
  public int triangleNumber(int[] nums) {
    int count = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      int temp = i + 2;
      for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
        while (temp < nums.length && nums[i] + nums[j] > nums[temp]) {
          temp++;
        }
        count += temp - j - 1;
      }
    }
    return count;
  }


}
