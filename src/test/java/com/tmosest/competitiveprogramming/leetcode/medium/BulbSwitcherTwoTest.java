package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 672. Bulb Switcher II")
class BulbSwitcherTwoTest {

  private BulbSwitcherTwo bulbSwitcher = new BulbSwitcherTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(2, bulbSwitcher.flipLights(1, 1));
  }
}
