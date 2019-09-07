package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 462. Minimum Moves to Equal Array Elements II")
class MinimumMovesToEqualArrayElementsTwoTest {

  private MinimumMovesToEqualArrayElementsTwo minimumMovesToEqualArrayElementsTwo = new MinimumMovesToEqualArrayElementsTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] nums = {
        1,2,3
    };
    Assertions.assertEquals(2, minimumMovesToEqualArrayElementsTwo.minMoves2(nums));
  }
}
