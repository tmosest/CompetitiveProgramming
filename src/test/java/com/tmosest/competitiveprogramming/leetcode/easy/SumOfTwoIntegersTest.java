package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 371. Sum of Two Integers")
class SumOfTwoIntegersTest {
	/* Write code here. */

  SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, sumOfTwoIntegers.getSum(1, 2));
  }


}
