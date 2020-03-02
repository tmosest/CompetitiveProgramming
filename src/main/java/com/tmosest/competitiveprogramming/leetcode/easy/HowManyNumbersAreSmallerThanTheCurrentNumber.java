package com.tmosest.competitiveprogramming.leetcode.easy;

class HowManyNumbersAreSmallerThanTheCurrentNumber {

  int[] smallerNumbersThanCurrent(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (i != j && nums[j] < nums[i]) {
          ++count;
        }
      }
      result[i] = count;
    }

    return result;
  }
}
