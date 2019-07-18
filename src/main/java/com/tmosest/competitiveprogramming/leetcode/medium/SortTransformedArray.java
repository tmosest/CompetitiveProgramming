package com.tmosest.competitiveprogramming.leetcode.medium;

class SortTransformedArray {

  private int one;
  private int two;
  private int three;

  int[] sortTransformedArray(int[] nums, int one1, int two1, int three1) {
    int[] ret = new int[nums.length];
    one = one1;
    two = two1;
    three = three1;
    if (one1 > 0) {
      for (int i = 0, j = nums.length - 1, k = nums.length - 1; k >= 0; k--) {
        if (getVal(nums[i]) > getVal(nums[j])) {
          ret[k] = getVal(nums[i]);
          i++;
        } else {
          ret[k] = getVal(nums[j]);
          j--;
        }
      }
    } else {
      for (int i = 0, j = nums.length - 1, k = 0; k < nums.length; k++) {
        if (getVal(nums[i]) < getVal(nums[j])) {
          ret[k] = getVal(nums[i]);
          i++;
        } else {
          ret[k] = getVal(nums[j]);
          j--;
        }
      }
    }
    return ret;
  }

  int getVal(int num) {
    return one * num * num + two * num + three;
  }
}
