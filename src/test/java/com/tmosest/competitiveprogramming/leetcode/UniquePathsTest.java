package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@DisplayName("LeetCode: 62. Unique Paths")
public class UniquePathsTest {

  UniquePaths uniquePaths = new UniquePaths();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, uniquePaths.uniquePaths(3, 2));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(28, uniquePaths.uniquePaths(7, 3));
  }
}
