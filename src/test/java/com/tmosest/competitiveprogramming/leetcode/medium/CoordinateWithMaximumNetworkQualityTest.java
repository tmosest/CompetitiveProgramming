package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc37")
@DisplayName("LeetCode: 1620. Coordinate With Maximum Network Quality")
class CoordinateWithMaximumNetworkQualityTest {

  private CoordinateWithMaximumNetworkQuality coordinateWithMaximumNetworkQuality = new CoordinateWithMaximumNetworkQuality();

  @Test
  void test1() {
    Assertions.assertArrayEquals(
        new int[] {2,1},
        coordinateWithMaximumNetworkQuality.bestCoordinate(new int[][] {{1,2,5}, {2,1,7}, {3,1,9}}, 2)
    );
  }
}
