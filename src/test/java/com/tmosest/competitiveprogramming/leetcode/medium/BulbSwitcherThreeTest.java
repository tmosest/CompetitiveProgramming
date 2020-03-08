package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("wc179")
@DisplayName("LeetCode: 5353. Bulb Switcher III")
class BulbSwitcherThreeTest {

  private BulbSwitcherThree bulbSwitcherThree = new BulbSwitcherThree();

  @Test
  void testCase0() {
    int[] input = {2,1,3,5,4};
    Assertions.assertEquals(3, bulbSwitcherThree.numTimesAllBlue(input));
  }

  @Test
  void testCase1() {
    int[] input = {3,2,4,1,5};
    Assertions.assertEquals(2, bulbSwitcherThree.numTimesAllBlue(input));
  }

  @Test
  void testCase2() {
    int[] input = {4,1,2,3};
    Assertions.assertEquals(1, bulbSwitcherThree.numTimesAllBlue(input));
  }

  @Test
  void testCase3() {
    int[] input = {2,1,4,3,6,5};
    Assertions.assertEquals(3, bulbSwitcherThree.numTimesAllBlue(input));
  }
}
