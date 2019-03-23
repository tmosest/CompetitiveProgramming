package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("matrix")
@Tag("medium")
@DisplayName("LeetCode: 289. Game of Life")
public class GameOfLifeTest {

  GameOfLife gameOfLife = new GameOfLife();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0,1,0},
        {0,0,1},
        {1,1,1},
        {0,0,0}
    };
    int[][] expected = {
        {0,0,0},
        {1,0,1},
        {0,1,1},
        {0,1,0}
    };
    gameOfLife.gameOfLife(input);
    Assertions.assertArrayEquals(expected, input);
  }
}
