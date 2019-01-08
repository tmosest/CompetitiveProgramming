package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 367. Valid Perfect Square")
public class ValidPerfectSquareTest {

  ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(validPerfectSquare.isPerfectSquare(16));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(validPerfectSquare.isPerfectSquare(14));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertFalse(validPerfectSquare.isPerfectSquare(Integer.MAX_VALUE));
  }
}
