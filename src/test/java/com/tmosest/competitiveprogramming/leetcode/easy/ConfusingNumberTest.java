package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1056. Confusing Number")
class ConfusingNumberTest {

  private ConfusingNumber confusingNumber = new ConfusingNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(confusingNumber.confusingNumber(6));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(confusingNumber.confusingNumber(89));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase2() {
    Assertions.assertFalse(confusingNumber.confusingNumber(11));
  }
}
