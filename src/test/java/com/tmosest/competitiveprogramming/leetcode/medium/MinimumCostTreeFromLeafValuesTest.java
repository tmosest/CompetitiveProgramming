package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 1130. Minimum Cost Tree From Leaf Values")
class MinimumCostTreeFromLeafValuesTest {

  private MinimumCostTreeFromLeafValues minimumCostTreeFromLeafValues =
      new MinimumCostTreeFromLeafValues();

  @Test
  void testCase0() {
    Assertions.assertEquals(32, minimumCostTreeFromLeafValues.mctFromLeafValues(
        new int[] {6, 2, 4}
    ));
  }
}
