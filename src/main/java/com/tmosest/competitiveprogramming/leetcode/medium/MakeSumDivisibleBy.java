package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class MakeSumDivisibleBy {

  int minSubarray(int[] nums, int target) {
    int remainder = 0;
    int prefixSum = 0;
    int len = nums.length;
    int minLen = len;
    for (int num : nums) {
      remainder = (remainder + num) % target;
    }
    Map<Integer, Integer> prefixSumToIndex = new HashMap<>();
    prefixSumToIndex.put(prefixSum, -1);
    for (int i = 0; i < len; ++i) {
      prefixSum = (prefixSum + nums[i]) % target;
      prefixSumToIndex.put(prefixSum, i);
      int key = (prefixSum - remainder + target) % target;
      if (prefixSumToIndex.containsKey(key)) {
        minLen = Math.min(minLen, i - prefixSumToIndex.get(key));
      }
    }
    return minLen == len ? -1 : minLen;
  }
}
