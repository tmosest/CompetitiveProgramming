package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 377. Combination Sum IV")
class CombinationSumFourTest {

  private CombinationSumFour combinationSumFour = new CombinationSumFour();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] nums = {
        1, 2, 3
    };
    Assertions.assertEquals(7, combinationSumFour.combinationSum4(nums, 4));
  }
}
