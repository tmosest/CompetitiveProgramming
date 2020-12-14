package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("gameTheory")
@Tag("bwc41")
@DisplayName("LeetCode: 1686. Stone Game VI")
class StoneGameSixTest {

  private StoneGameSix stoneGameSix;

  @BeforeEach
  void setup() {
    stoneGameSix = new StoneGameSix();
  }

  private void test(int output, int[] aliceValues, int[] bobValues) {
    Assertions.assertEquals(output, stoneGameSix.stoneGame6(aliceValues, bobValues));
  }

  @Test
  void test0() {
    test(1, new int[] {1,3}, new int[] {2,1});
  }
}
