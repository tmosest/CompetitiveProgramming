package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc35")
@DisplayName("LeetCode: 1589. Maximum Sum Obtained of Any Permutation")
class MaximumSumObtainedOfAnyPermutationTest {

  private MaximumSumObtainedOfAnyPermutation maximumSumObtainedOfAnyPermutation;

  @BeforeEach
  void setup() {
    maximumSumObtainedOfAnyPermutation = new MaximumSumObtainedOfAnyPermutation();
  }

  private void test(int output, int[] nums, int[][] requests) {
    Assertions
        .assertEquals(output, maximumSumObtainedOfAnyPermutation.maxSumRangeQuery(nums, requests));
  }

  @Test
  void test0() {
    test(19, new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 1}});
  }

}
