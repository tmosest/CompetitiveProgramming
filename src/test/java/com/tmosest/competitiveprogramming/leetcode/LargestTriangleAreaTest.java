package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 812. Largest Triangle Area")
public class LargestTriangleAreaTest {

  LargestTriangleArea largestTriangleArea = new LargestTriangleArea();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {{0,0},{0,1},{1,0},{0,2},{2,0}};
    Assertions.assertEquals(2, largestTriangleArea.largestTriangleArea(input));
  }
}
