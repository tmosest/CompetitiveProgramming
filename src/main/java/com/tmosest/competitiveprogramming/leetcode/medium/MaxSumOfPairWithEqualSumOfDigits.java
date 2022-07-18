package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

class MaxSumOfPairWithEqualSumOfDigits {

  int maximumSum(int[] nums) {
    Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

    for (int num : nums) {
      int sum = digiSum(num);
      PriorityQueue<Integer> list = map
          .getOrDefault(sum, new PriorityQueue<>(10, Collections.reverseOrder()));
      list.add(num);
      map.put(sum, list);
    }

    List<Integer> sumCandidates = new ArrayList<>();

    for (Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
      if (entry.getValue().size() > 1) {
        sumCandidates.add(entry.getKey());
      }
    }

    if (sumCandidates.size() < 1) {
      return -1;
    }

    int maxSum = 0;

    for (int candidate : sumCandidates) {
      PriorityQueue<Integer> queue = map.get(candidate);
      int sum = 0;
      sum += queue.poll();
      sum += queue.poll();
      maxSum = Math.max(sum, maxSum);
    }

    return maxSum;
  }

  private int digiSum(int num) {
    int sum = 0;

    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }

    return sum;
  }
}
