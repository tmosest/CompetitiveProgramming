package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 421. Maximum XOR of Two Numbers in an Array")
class MaximumXorOfTwoNumbersInAnArrayTest {

  private MaximumXorOfTwoNumbersInAnArray maximumXorOfTwoNumbersInAnArray = new MaximumXorOfTwoNumbersInAnArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3, 10, 5, 25, 2, 8
    };
    Assertions.assertEquals(28, maximumXorOfTwoNumbersInAnArray.findMaximumXor(input));
  }
}
