package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 888. Fair Candy Swap")
class FairCandySwapTest {
	/* Write code here. */

  FairCandySwap fairCandySwap = new FairCandySwap();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] personA = {1, 1};
    int[] personB = {2, 2};
    int[] result = {1,2};
    Assertions.assertArrayEquals(result, fairCandySwap.fairCandySwap(personA, personB));
  }


}
