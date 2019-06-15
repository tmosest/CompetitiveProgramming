package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1057. Campus Bikes")
class CampusBikesTest {

  private CampusBikes campusBikes = new CampusBikes();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] workers = {{0,0},{1,1},{2,0}};
    int[][] bikes = {{1,0},{2,2},{2,1}};
    int[] expected = {
      0, 2, 1
    };
    Assertions.assertArrayEquals(expected, campusBikes.assignBikes(workers, bikes));
  }
}
