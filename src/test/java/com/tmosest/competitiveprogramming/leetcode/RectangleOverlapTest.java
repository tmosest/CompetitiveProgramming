package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 645. Set Mismatch")
public class RectangleOverlapTest {

  RectangleOverlap rectangleOverlap = new RectangleOverlap();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] rec1 = {0,0,2,2};
    int[] rec2 = {1,1,3,3};
    Assertions.assertTrue(rectangleOverlap.isRectangleOverlap(rec1, rec2));
  }
}
