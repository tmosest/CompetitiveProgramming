package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 910. Smallest Range II")
class SmallestRangeTwoTest {
	/* Write code here. */

  private SmallestRangeTwo smallestRangeTwo = new SmallestRangeTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
      1
    };
    Assertions.assertEquals(0, smallestRangeTwo.smallestRangeTwo(input, 0));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        0, 10
    };
    Assertions.assertEquals(6, smallestRangeTwo.smallestRangeTwo(input, 2));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        1,3,6
    };
    Assertions.assertEquals(3, smallestRangeTwo.smallestRangeTwo(input, 3));
  }


}
