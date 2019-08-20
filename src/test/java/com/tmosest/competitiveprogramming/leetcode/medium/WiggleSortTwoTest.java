package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 324. Wiggle Sort II")
class WiggleSortTwoTest {

  private WiggleSortTwo wiggleSortTwo = new WiggleSortTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 5, 1, 1, 6, 4
    };
    wiggleSortTwo.wiggleSort(input);
  }
}
