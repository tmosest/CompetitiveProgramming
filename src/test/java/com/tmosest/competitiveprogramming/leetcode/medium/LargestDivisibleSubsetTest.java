package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 368. Largest Divisible Subset")
class LargestDivisibleSubsetTest {

  private LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3
    };

    List<Integer> results = largestDivisibleSubset.largestDivisibleSubset(input);

    for (int i = 0; i < results.size(); i++) {
      for (int j = 0; j < results.size(); j++) {
        if (i == j) {
          continue;
        }
        int one = results.get(i);
        int two = results.get(j);
        Assertions.assertTrue(one % two == 0 || two % one == 0);
      }
    }
  }
}
