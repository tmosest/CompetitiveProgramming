package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 908. Smallest Range I")
class SmallestRangeOneTest {
	/* Write code here. */

  SmallestRangeOne smallestRangeOne = new SmallestRangeOne();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1};
    Assertions.assertEquals(0, smallestRangeOne.smallestRangeI(input, 0));
  }


}
