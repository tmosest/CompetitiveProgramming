package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 808. Soup Servings")
class SoupServingsTest {

  private SoupServings soupServings = new SoupServings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(soupServings.soupServings(50) <= .64);
  }
}
