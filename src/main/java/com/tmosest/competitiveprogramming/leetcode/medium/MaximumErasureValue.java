package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class MaximumErasureValue {

  int maximumUniqueSubarray(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int start = 0;
    int end = 0;

    int curSum = 0;
    int maxSum = 0;
    while (end < nums.length) {
      map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
      curSum += nums[end];
      while (end - start + 1 != map.size()) {
        map.put(nums[start], map.get(nums[start]) - 1);
        if (map.get(nums[start]) == 0) {
          map.remove(nums[start]);
        }
        curSum -= nums[start];
        start++;
      }
      maxSum = Math.max(maxSum, curSum);
      end++;
    }
    return maxSum;
  }
}
