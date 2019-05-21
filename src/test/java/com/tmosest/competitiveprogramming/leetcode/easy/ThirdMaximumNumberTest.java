package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 414. Third Maximum Number")
class ThirdMaximumNumberTest {
	/* Write code here. */

  ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3, 2, 1
    };
    Assertions.assertEquals(1, thirdMaximumNumber.thirdMax(input));
  }


}
