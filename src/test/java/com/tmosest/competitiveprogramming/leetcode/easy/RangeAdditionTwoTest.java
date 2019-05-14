package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 598. Range Addition II")
class RangeAdditionTwoTest {
	/* Write code here. */

  RangeAdditionTwo rangeAdditionTwo = new RangeAdditionTwo();
  
  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {{2,2},{3,3}};
    Assertions.assertEquals(4, rangeAdditionTwo.maxCount(3,3, input));
  }


}
