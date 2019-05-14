package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 80. Remove Duplicates from Sorted Array II")
class RemoveDuplicatesFromSortedArrayTwoTest {
	/* Write code here. */

  private RemoveDuplicatesFromSortedArrayTwo removeDuplicatesFromSortedArrayTwo = new RemoveDuplicatesFromSortedArrayTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] nums = {
        1,1,1,2,2,3
    };
    int[] expected = {
        1,1,2,2,3,3
    };
    Assertions.assertEquals(5, removeDuplicatesFromSortedArrayTwo.removeDuplicates(nums));
    Assertions.assertArrayEquals(expected, nums);
  }


}
