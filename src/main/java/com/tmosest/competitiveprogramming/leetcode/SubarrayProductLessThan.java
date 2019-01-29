package com.tmosest.competitiveprogramming.leetcode;

public class SubarrayProductLessThan {

  /**
   * Determine the number of contiguous sub-arrays with a product less than k.
   * @param nums An array of integers.
   * @param product Must be less than this product.
   * @return Number of sub-arrays.
   */
  public int numSubarrayProductLessThanK(int[] nums, int product) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      int localProduct = nums[i];
      if (localProduct < product) {
        ++result;
        for (int j = i - 1; j >= 0; j--) {
          localProduct *= nums[j];
          if (localProduct >= product) {
            break;
          }
          ++result;
        }
      }
    }
    return result;
  }
}
