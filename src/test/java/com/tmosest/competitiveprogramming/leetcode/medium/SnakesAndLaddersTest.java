package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

@Tag("leetcode")
@Tag("medium")
@Tag("breadthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 443. String Compression")
class SnakesAndLaddersTest {
	/* Write code here. */

  SnakesAndLadders snakesAndLadders = new SnakesAndLadders();

  @Test
  @DisplayName("Test Case 0")
  public void testCase0() {
    int[][] board = {
        {-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1},
        {-1,35,-1,-1,13,-1},
        {-1,-1,-1,-1,-1,-1},
        {-1,15,-1,-1,-1,-1}
    };
    Assertions.assertEquals(4, snakesAndLadders.snakesAndLadders(board));
  }

  @Test
  @DisplayName("Test Case 1")
  public void testCase1() {
    int[][] board = {
        {-1,1,2,-1},
        {2,13,15,-1},
        {-1,10,-1,-1},
        {-1,6,2,8}
    };
    Assertions.assertEquals(2, snakesAndLadders.snakesAndLadders(board));
  }

  @Test
  @DisplayName("Test Case 2")
  public void testCase2() {
    int[][] board = {
        {-1, 4, -1},
        {6, 2, 6},
        {-1, 3, -1}
    };
    Assertions.assertEquals(2, snakesAndLadders.snakesAndLadders(board));
  }

  @Test
  @DisplayName("Test Case 3")
  public void testCase3() {
    int[][] board = {
        {-1,15,9,1,-1},
        {-1,-1,10,5,19},
        {18,-1,23,9,-1},
        {1,13,-1,16,20},
        {-1,10,10,25,13}
    };
    Assertions.assertEquals(1, snakesAndLadders.snakesAndLadders(board));
  }

  @Test
  @DisplayName("Test Case 4")
  public void testCase4() {
    int[][] board = {
        {-1,-1,2,21,-1},
        {16,-1,24,-1,4},
        {2,3,-1,-1,-1},
        {-1,11,23,18,-1},
        {-1,-1,-1,23,-1}
    };
    Assertions.assertEquals(2, snakesAndLadders.snakesAndLadders(board));
  }


}
