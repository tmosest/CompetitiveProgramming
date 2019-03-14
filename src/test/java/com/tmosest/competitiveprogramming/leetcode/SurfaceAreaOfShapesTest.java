package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 892. Surface Area of 3D Shapes")
public class SurfaceAreaOfShapesTest {

  SurfaceAreaOfShapes surfaceAreaOfShapes = new SurfaceAreaOfShapes();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {2}
    };
    Assertions.assertEquals(10, surfaceAreaOfShapes.surfaceArea(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] input = {
        {1, 2},
        {3, 4}
    };
    Assertions.assertEquals(34, surfaceAreaOfShapes.surfaceArea(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] input = {
        {1, 0},
        {0, 2}
    };
    Assertions.assertEquals(16, surfaceAreaOfShapes.surfaceArea(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[][] input = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    Assertions.assertEquals(32, surfaceAreaOfShapes.surfaceArea(input));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    int[][] input = {
        {2, 2, 2},
        {2, 1, 2},
        {2, 2, 2}
    };
    Assertions.assertEquals(46, surfaceAreaOfShapes.surfaceArea(input));
  }
}
