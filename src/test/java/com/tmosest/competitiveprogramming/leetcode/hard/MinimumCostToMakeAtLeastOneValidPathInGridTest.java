package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("matrix")
@Tag("wc177")
@Tag("depthFirstSearch")
@DisplayName("LeetCode: 1368. Minimum Cost to Make at Least One Valid Path in a Grid")
class MinimumCostToMakeAtLeastOneValidPathInGridTest {

  private MinimumCostToMakeAtLeastOneValidPathInGrid minimumCostToMakeAtLeastOneValidPathInGrid =
      new MinimumCostToMakeAtLeastOneValidPathInGrid();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(
        new int[] {3,3},
        minimumCostToMakeAtLeastOneValidPathInGrid.closestDivisors(8)
    );
  }
}
