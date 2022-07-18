package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class MaximumNumberOfPairsInArray {

  int[] numberOfPairs(int[] nums) {
    Map<Integer, Long> occurrences =
        Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

    int[] result = {0, 0};

    for (long val : occurrences.values()) {
      result[0] += val / 2;
      result[1] += val % 2;
    }

    return result;
  }
}
