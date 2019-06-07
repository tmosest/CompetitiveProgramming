package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 161. One Edit Distance")
class OneEditDistanceTest {

  private OneEditDistance oneEditDistance = new OneEditDistance();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(oneEditDistance.isOneEditDistance("ab", "acb"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(oneEditDistance.isOneEditDistance("cab", "ad"));
  }
}
