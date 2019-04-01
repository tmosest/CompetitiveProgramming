package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 490. The Maze")
public class TheMazeTwoTest {

  TheMazeTwo theMazeTwo = new TheMazeTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0},
        {1, 1, 0, 1, 1},
        {0, 0, 0, 0, 0},
    };
    int[] start = {
      0, 4
    };
    int[] end = {
      4, 4
    };
    Assertions.assertEquals(12, theMazeTwo.shortestDistance(input, start, end));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] input = {
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0},
        {1, 1, 0, 1, 1},
        {0, 0, 0, 0, 0},
    };
    int[] start = {
        0, 4
    };
    int[] end = {
        3, 2
    };
    Assertions.assertEquals(-1, theMazeTwo.shortestDistance(input, start, end));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] input = {
        {0,0,1,0,0}
    };
    int[] start = {
        0, 1
    };
    int[] end = {
        0, 3
    };
    Assertions.assertEquals(-1, theMazeTwo.shortestDistance(input, start, end));
  }
}
