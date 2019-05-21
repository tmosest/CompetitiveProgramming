package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 643. Maximum Average Subarray I")
class ImageSmootherTest {
	/* Write code here. */

  ImageSmoother imageSmoother = new ImageSmoother();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1,1,1},
        {1,0,1},
        {1,1,1}
    };
    int[][] expected = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    };
    Assertions.assertArrayEquals(expected, imageSmoother.imageSmoother(input));
  }


}
