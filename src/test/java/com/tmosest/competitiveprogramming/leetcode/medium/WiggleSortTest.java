package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 280. Wiggle Sort")
class WiggleSortTest {
	/* Write code here. */

  WiggleSort wiggleSort = new WiggleSort();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3,5,2,1,6,4
    };
    wiggleSort.wiggleSort(input);
    for (int i = 1; i < input.length - 1; i += 2) {
      Assertions.assertTrue(input[i - 1] <= input[i]);
      Assertions.assertTrue(input[i] >= input[i + 1]);
    }
  }


}
