package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 1020. Number of Enclaves")
class NumberOfEnclavesTest {
	/* Write code here. */

  NumberOfEnclaves numberOfEnclaves = new NumberOfEnclaves();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}
    };
    Assertions.assertEquals(3, numberOfEnclaves.numEnclaves(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] input = {
        {0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}
    };
    Assertions.assertEquals(0, numberOfEnclaves.numEnclaves(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] input = {
        {0,0,0,1,1,1,0,1,0,0},{1,1,0,0,0,1,0,1,1,1},{0,0,0,1,1,1,0,1,0,0},{0,1,1,0,0,0,1,0,1,0},{0,1,1,1,1,1,0,0,1,0},{0,0,1,0,1,1,1,1,0,1},{0,1,1,0,0,0,1,1,1,1},{0,0,1,0,0,1,0,1,0,1},{1,0,1,0,1,1,0,0,0,0},{0,0,0,0,1,1,0,0,0,1}
    };
    Assertions.assertEquals(3, numberOfEnclaves.numEnclaves(input));
  }


}
