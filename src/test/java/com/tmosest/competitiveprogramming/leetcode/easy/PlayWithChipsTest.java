package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1217. Play with Chips")
class PlayWithChipsTest {

  private PlayWithChips playWithChips = new PlayWithChips();

  @Test
  void testCase0() {
    int[] arr = {1,2,3};
    Assertions.assertEquals(1, playWithChips.minCostToMoveChips(arr));
  }
}
