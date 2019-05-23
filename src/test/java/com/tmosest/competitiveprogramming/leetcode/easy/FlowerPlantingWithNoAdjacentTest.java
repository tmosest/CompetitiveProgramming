package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1042. Flower Planting With No Adjacent ")
class FlowerPlantingWithNoAdjacentTest {

  private FlowerPlantingWithNoAdjacent flowerPlantingWithNoAdjacent = new FlowerPlantingWithNoAdjacent();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {1,2,3};
    int[][] paths = {
        {1,2},{2,3},{3,1}  
    };
    Assertions.assertArrayEquals(expected, flowerPlantingWithNoAdjacent.gardenNoAdj(3, paths));
  }
}
