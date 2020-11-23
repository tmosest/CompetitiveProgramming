package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc210")
@DisplayName("LeetCode: 1617. Count Subtrees With Max Distance Between Cities")
class CountSubtreesWithMaxDistanceBetweenCitiesTest {

  private CountSubtreesWithMaxDistanceBetweenCities countSubtreesWithMaxDistanceBetweenCities =
      new CountSubtreesWithMaxDistanceBetweenCities();

  @Test
  void test1() {
    Assertions.assertArrayEquals(new int[] {3, 4, 0}, countSubtreesWithMaxDistanceBetweenCities.countSubgraphsForEachDiameter(
      4, new int[][] {{1,2}, {2,3}, {2,4}}
    ));
  }
}
