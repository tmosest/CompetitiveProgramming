package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc213")
@DisplayName("LeetCode: 1642. Furthest Building You Can Reach")
class FurthestBuildingYouCanReachTest {

  @Test
  void test1() {
    Assertions.assertEquals(4, new FurthestBuildingYouCanReach().furthestBuilding(
        new int[] {4,2,7,6,9,14,12},
        5,
        1
    ));
  }
}
