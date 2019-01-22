package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 520. Detect Capital")
public class DetectCapitalTest {

  DetectCapital detectCapital = new DetectCapital();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(detectCapital.detectCapitalUse("USA"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(detectCapital.detectCapitalUse("FlaG"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertFalse(detectCapital.detectCapitalUse("ffffffffffffffffffffF"));
  }
}
