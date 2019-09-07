package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 712. Minimum ASCII Delete Sum for Two Strings")
class MinimumAsciiDeleteSumForTwoStringsTest {

  private MinimumAsciiDeleteSumForTwoStrings minimumAsciiDeleteSumForTwoStrings = new MinimumAsciiDeleteSumForTwoStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(231, minimumAsciiDeleteSumForTwoStrings.minimumDeleteSum("sea", "eat"));
  }
}
