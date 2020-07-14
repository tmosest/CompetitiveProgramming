package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc196")
@DisplayName("LeetCode: 1503. Last Moment Before All Ants Fall Out of a Plank")
class LastMomentBeforeAllAntsFallOutOfPlankTest {

  private LastMomentBeforeAllAntsFallOutOfPlank lastMomentBeforeAllAntsFallOutOfPlank =
      new LastMomentBeforeAllAntsFallOutOfPlank();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, lastMomentBeforeAllAntsFallOutOfPlank.getLastMoment(
        4, new int[]{4, 3}, new int[]{0, 1}
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(7, lastMomentBeforeAllAntsFallOutOfPlank.getLastMoment(
        7, new int[]{}, new int[]{0, 1, 2, 3, 4, 5, 6, 7}
    ));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(7, lastMomentBeforeAllAntsFallOutOfPlank.getLastMoment(
        7, new int[]{0, 1, 2, 3, 4, 5, 6, 7}, new int[]{}
    ));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals(5, lastMomentBeforeAllAntsFallOutOfPlank.getLastMoment(
        9, new int[]{5}, new int[]{4}
    ));
  }
}
