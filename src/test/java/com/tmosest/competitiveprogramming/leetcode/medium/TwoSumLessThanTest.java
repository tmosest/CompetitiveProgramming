package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1099. Two Sum Less Than K")
class TwoSumLessThanTest {

  private TwoSumLessThan twoSumLessThan = new TwoSumLessThan();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        34, 23, 1, 24, 75, 33, 54, 8
    };
    Assertions.assertEquals(58, twoSumLessThan.twoSumLessThanK(input, 60));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        10, 20, 30
    };
    Assertions.assertEquals(-1, twoSumLessThan.twoSumLessThanK(input, 15));
  }
}
