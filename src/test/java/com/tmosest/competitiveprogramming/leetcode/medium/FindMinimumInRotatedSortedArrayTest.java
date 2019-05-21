package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 153. Find Minimum in Rotated Sorted Array")
class FindMinimumInRotatedSortedArrayTest {
	/* Write code here. */

  FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3,4,5,1,2
    };
    Assertions.assertEquals(1, findMinimumInRotatedSortedArray.findMin(input));
  }


}
