package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc199")
@DisplayName("LeetCode: 1529. Bulb Switcher IV")
class BulbSwitcherFourTest {

  private BulbSwitcherFour bulbSwitcherFour = new BulbSwitcherFour();

  @Test
  void test0() {
    Assertions.assertEquals(3, bulbSwitcherFour.minFlips("10111"));
  }
}
