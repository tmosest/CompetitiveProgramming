package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 633. Sum of Square Numbers")
class SumOfSquareNumbersTest {
	/* Write code here. */

  SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSum(5));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(sumOfSquareNumbers.judgeSquareSum(3));
  }


}
