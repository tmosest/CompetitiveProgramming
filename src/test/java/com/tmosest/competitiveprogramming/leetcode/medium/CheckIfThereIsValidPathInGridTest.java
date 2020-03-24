package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("wc181")
@DisplayName("LeetCode: 1391. Check if There is a Valid Path in a Grid")
class CheckIfThereIsValidPathInGridTest {

  private CheckIfThereIsValidPathInGrid checkIfThereIsValidPathInGrid =
      new CheckIfThereIsValidPathInGrid();

  @Test
  void testCase0() {
    Assertions.assertTrue(checkIfThereIsValidPathInGrid.hasValidPath(
        new int[][] {{2,4,3},{6,5,2}}
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertTrue(checkIfThereIsValidPathInGrid.hasValidPath(
        new int[][] {{4,1},{6,1}}
    ));
  }
}
