package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc195")
@DisplayName("LeetCode: 1496. Path Crossing")
class PathCrossingTest {

  private PathCrossing pathCrossing = new PathCrossing();

  @Test
  void testCase0() {
    Assertions.assertFalse(pathCrossing.isPathCrossing("NES"));
  }

  @Test
  void testCase1(){
    Assertions.assertTrue(pathCrossing.isPathCrossing("NESWW"));
  }
}
