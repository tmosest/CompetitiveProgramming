package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 319. Bulb Switcher")
class BulbSwitcherTest {

  private BulbSwitcher bulbSwitcher = new BulbSwitcher();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1, bulbSwitcher.bulbSwitch(3));
  }
}
