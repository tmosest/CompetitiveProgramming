package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 299. Bulls and Cows")
class BullsAndCowsTest {

  private BullsAndCows bullsAndCows = new BullsAndCows();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("1A3B", bullsAndCows.getHint("1807", "7810"));
  }
}
