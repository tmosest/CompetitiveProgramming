package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 935. Knight Dialer")
class KnightDialerTest {

  private KnightDialer knightDialer = new KnightDialer();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(10, knightDialer.knightDialer(1));
  }
}
