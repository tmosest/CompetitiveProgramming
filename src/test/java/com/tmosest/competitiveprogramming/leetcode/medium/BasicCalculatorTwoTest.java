package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 227. Basic Calculator II")
class BasicCalculatorTwoTest {
	/* Write code here. */

  BasicCalculatorTwo basicCalculatorTwo = new BasicCalculatorTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(7, basicCalculatorTwo.calculate("3+2*2"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(1, basicCalculatorTwo.calculate("3/2"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(5, basicCalculatorTwo.calculate(" 3+5 / 2 "));
  }


}
