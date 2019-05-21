package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("interval")
@Tag("medium")
@DisplayName("LeetCode: 33. Search in Rotated Sorted Array")
class SearchInRotatedSortedArrayTest {
	/* Write code here. */

  SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4,5,6,7,0,1,2
    };
    Assertions.assertEquals(4, searchInRotatedSortedArray.search(input, 0));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        4,5,6,7,0,1,2
    };
    Assertions.assertEquals(-1, searchInRotatedSortedArray.search(input, 3));
  }


}
