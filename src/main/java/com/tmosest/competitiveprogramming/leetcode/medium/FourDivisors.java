package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class FourDivisors {

  int sumFourDivisors(int[] nums) {
    Arrays.sort(nums);
    return getFactorsForNums(nums)
        .stream()
        .filter(set -> set.size() == 4)
        .mapToInt(set -> set.stream().reduce(Integer::sum).orElse(0))
        .reduce(Integer::sum)
        .orElse(0);
  }

  private List<Set<Integer>> getFactorsForNums(int[] nums) {
    List<Set<Integer>> factors = constructFactors(nums[nums.length - 1]);
    return Arrays.stream(nums).mapToObj((num) -> factors.get(num)).collect(Collectors.toList());
  }

  private List<Set<Integer>> constructFactors(int num) {
    List<Set<Integer>> factors = new ArrayList<>();

    for (int i = 0; i <= num; i++) {
      factors.add(new HashSet<>());
    }

    if (num < 1) {
      return factors;
    }

    factors.get(1).add(1);

    for (int i = 1; i * i <= num; i++) {
      for (int j = 1; j * i <= num; j++) {
        int val = i * j;
        Set<Integer> set = factors.get(val);
        set.add(i);
        set.add(j);
      }
    }

    return factors;
  }
}
