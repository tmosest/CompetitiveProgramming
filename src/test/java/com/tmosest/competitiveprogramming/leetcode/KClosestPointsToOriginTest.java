package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("distance")
@DisplayName("LeetCode: 973. K Closest Points to Origin")
public class KClosestPointsToOriginTest {

  KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] points = {
        {1, 3},
        {-2, 2}
    };
    int[][] expected = {
        {-2, 2}
    };
    Assertions.assertArrayEquals(expected, kClosestPointsToOrigin.numClosest(points, 1));
  }
}
