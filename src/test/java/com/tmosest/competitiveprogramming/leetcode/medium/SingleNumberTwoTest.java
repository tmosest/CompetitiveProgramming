package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 137. Single Number II")
class SingleNumberTwoTest {

  private SingleNumberTwo singleNumberTwo = new SingleNumberTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2, 2, 3, 2
    };
    Assertions.assertEquals(3, singleNumberTwo.singleNumber(input));
  }
}
