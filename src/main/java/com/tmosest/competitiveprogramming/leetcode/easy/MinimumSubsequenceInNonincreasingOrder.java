package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumSubsequenceInNonincreasingOrder {

  List<Integer> minSubsequence(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    int ss = 0;
    List<Integer> res = new ArrayList<>();
    for (int i = nums.length - 1; i >= 0; i--) {
      if (ss > sum - ss) {
        return res;
      } else {
        ss += nums[i];
        res.add(nums[i]);
      }
    }
    return res;
  }
}
