package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 611. Valid Triangle Number")
class ValidTriangleNumberTest {
	/* Write code here. */

  ValidTriangleNumber validTriangleNumber = new ValidTriangleNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2,2,3,4
    };
    Assertions.assertEquals(3, validTriangleNumber.triangleNumber(input));
  }


}
