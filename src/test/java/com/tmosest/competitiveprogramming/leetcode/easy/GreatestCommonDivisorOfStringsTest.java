package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1071. Greatest Common Divisor of Strings")
class GreatestCommonDivisorOfStringsTest {

  private GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("AB", greatestCommonDivisorOfStrings.gcdOfStrings("ABAB", "ABABAB"));
  }
}
