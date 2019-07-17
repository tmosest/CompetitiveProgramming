package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 576. Out of Boundary Paths")
class OutOfBoundaryPathsTest {

  private OutOfBoundaryPaths outOfBoundaryPaths = new OutOfBoundaryPaths();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(6, outOfBoundaryPaths.findPaths(2, 2, 2, 0, 0));
  }
}
