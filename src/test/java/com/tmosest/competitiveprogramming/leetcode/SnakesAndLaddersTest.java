package com.tmosest.competitiveprogramming.leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

@Tag("leetcode")
@Tag("medium")
@Tag("breadthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 443. String Compression")
public class SnakesAndLaddersTest {

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

  /*
  @Test
  @DisplayName("Test Case 0")
  public void testCase1() {
    int[][] board = {
        {-1,1,2,-1},
        {2,13,15,-1},
        {-1,10,-1,-1},
        {-1,6,2,8}
    };
    Assertions.assertEquals(2, snakesAndLadders.snakesAndLadders(board));
  }
  */
}
