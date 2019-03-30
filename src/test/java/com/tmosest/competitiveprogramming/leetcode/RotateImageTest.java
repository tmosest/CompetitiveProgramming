package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@DisplayName("LeetCode: 48. Rotate Image")
public class RotateImageTest {

  RotateImage rotateImage = new RotateImage();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] output = {
        {7,4,1},
        {8,5,2},
        {9,6,3}
    };
    rotateImage.rotate(input);
    Assertions.assertArrayEquals(output, input);
  }
}
