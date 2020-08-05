package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc200")
@DisplayName("LeetCode: 1536. Minimum Swaps to Arrange a Binary Grid")
class MinimumSwapsToArrangeBinaryGridTest {

  private MinimumSwapsToArrangeBinaryGrid minimumSwapsToArrangeBinaryGrid =
      new MinimumSwapsToArrangeBinaryGrid();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, minimumSwapsToArrangeBinaryGrid.minSwaps(
        new int[][]{{0, 0, 1}, {1, 1, 0}, {1, 0, 0}}
    ));
  }
}
