package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc173")
@Tag("array")
@DisplayName("LeetCode: 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance")
class FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistanceTest {

  private FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistance cityWithTheSmallestNumberOfNeighborsAtThresholdDistance =
      new FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistance();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, cityWithTheSmallestNumberOfNeighborsAtThresholdDistance.findTheCity(
        4,
        new int[][] {{0,1,3},{1,2,1},{1,3,4},{2,3,1}},
        4
    ));
  }
}
