package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 883. Projection Area of 3D Shapes")
public class ProjectionAreaOfShapesTest {
  
  ProjectionAreaOfShapes projectionAreaOfShapes = new ProjectionAreaOfShapes();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {2}
    };
    Assertions.assertEquals(5, projectionAreaOfShapes.projectionArea(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] input = {
        {1, 2},
        {3, 4}
    };
    Assertions.assertEquals(17, projectionAreaOfShapes.projectionArea(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] input = {
        {1, 0},
        {0, 2}
    };
    Assertions.assertEquals(8, projectionAreaOfShapes.projectionArea(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[][] input = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    Assertions.assertEquals(14, projectionAreaOfShapes.projectionArea(input));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    int[][] input = {
        {2, 2, 2},
        {2, 1, 2},
        {2, 2, 2}
    };
    Assertions.assertEquals(21, projectionAreaOfShapes.projectionArea(input));
  }
}
