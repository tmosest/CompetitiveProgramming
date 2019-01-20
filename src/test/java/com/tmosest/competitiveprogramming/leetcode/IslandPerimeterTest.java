package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 463. Island Perimeter")
public class IslandPerimeterTest {

  IslandPerimeter islandPerimeter = new IslandPerimeter();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0,1,0,0},
        {1,1,1,0},
        {0,1,0,0},
        {1,1,0,0}
    };
    Assertions.assertEquals(16, islandPerimeter.islandPerimeter(input));
  }
}
