package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("interval")
@Tag("medium")
@DisplayName("LeetCode: 33. Search in Rotated Sorted Array")
class NextPermutationTest {
	/* Write code here. */

  NextPermutation nextPermutation = new NextPermutation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3
    };
    int[] output = {
        1,3,2
    };
    nextPermutation.nextPermutation(input);
    Assertions.assertArrayEquals(output, input);
  }


}
