package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1086. High Five")
class HighFiveTest {

  private HighFive highFive = new HighFive();

  @Test
  @DisplayName("Test Case 0")
  void testCase() {
    int[][] input = 
      {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};

    int[][] expected =
      {{1,87},{2,88}};

    Assertions.assertArrayEquals(expected, highFive.highFive(input));
  }
}
