package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 532. K-diff Pairs in an Array")
class KdiffPairsInAnArrayTest {
	/* Write code here. */

  KdiffPairsInAnArray kdiffPairsInAnArray = new KdiffPairsInAnArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3, 1, 4, 1, 5
    };
    Assertions.assertEquals(2, kdiffPairsInAnArray.findPairs(input, 2));
  }


}
