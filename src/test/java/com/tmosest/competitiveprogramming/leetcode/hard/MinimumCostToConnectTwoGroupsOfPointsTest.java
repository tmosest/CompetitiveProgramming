package com.tmosest.competitiveprogramming.leetcode.hard;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("graph")
@Tag("wc208")
@DisplayName("LeetCode: 1595. Minimum Cost to Connect Two Groups of Points")
class MinimumCostToConnectTwoGroupsOfPointsTest {
  private MinimumCostToConnectTwoGroupsOfPoints minimumCostToMakeAtLeastOneValidPathInGrid =
      new MinimumCostToConnectTwoGroupsOfPoints();

  @Test
  void test1() {
    Assertions.assertEquals(17,
        minimumCostToMakeAtLeastOneValidPathInGrid.
            connectTwoGroups(MatrixListAdapter.toList(new Integer[][] {{15, 96}, {36, 2}})));
  }
}
