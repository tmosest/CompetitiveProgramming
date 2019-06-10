package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 370. Range Addition")
class RangeAdditionTest {

  private RangeAddition rangeAddition = new RangeAddition();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {
        -2,0,3,5,3
    };
    int[][] updates = {
        {1,3,2},{2,4,3},{0,2,-2}
    };
    Assertions.assertArrayEquals(expected, rangeAddition.getModifiedArray(5, updates));
  }
}
