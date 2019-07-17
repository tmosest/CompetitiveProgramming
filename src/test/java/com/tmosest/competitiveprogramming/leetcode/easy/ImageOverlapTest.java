package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 835. Image Overlap")
class ImageOverlapTest {

  private ImageOverlap imageOverlap = new ImageOverlap();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] A = {
        {1,1,0},
        {0,1,0},
        {0,1,0}
    };
    int[][] B = {
        {0,0,0},
        {0,1,1},
        {0,0,1}
    };
    Assertions.assertEquals(3, imageOverlap.largestOverlap(A, B));
  }
}
