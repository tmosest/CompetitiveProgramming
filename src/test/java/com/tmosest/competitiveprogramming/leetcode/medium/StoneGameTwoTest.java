package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1140. Stone Game II")
class StoneGameTwoTest {

  private StoneGameTwo stoneGame = new StoneGameTwo();

  @Test
  void testCase0() {
    int[] stones = {2,7,9,4,4};
    Assertions.assertEquals(10, stoneGame.stoneGameTwo(stones));
  }
}
