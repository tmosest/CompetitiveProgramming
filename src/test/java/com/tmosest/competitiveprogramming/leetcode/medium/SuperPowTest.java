package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 372. Super Pow")
class SuperPowTest {

  private SuperPow superPow = new SuperPow();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] pow = {
        3
    };
    Assertions.assertEquals(8, superPow.superPow(2, pow));
  }
}
