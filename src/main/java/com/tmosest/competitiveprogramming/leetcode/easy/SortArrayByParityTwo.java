package com.tmosest.competitiveprogramming.leetcode.easy;

class SortArrayByParityTwo {
  /* Write code here. */

  /**
   * Sort even numbers into even indexes and odd into odd.
   *
   * @param nums An array of numbers.
   * @return The new sorted array.
   */
  public int[] sortArrayByParity(int[] nums) {
    int[] result = new int[nums.length];

    int oddIndex = 1;
    int evenIndex = 0;

    for (int num : nums) {
      if (num % 2 == 0) {
        result[evenIndex] = num;
        evenIndex += 2;
      } else {
        result[oddIndex] = num;
        oddIndex += 2;
      }
    }

    return result;
  }


}
