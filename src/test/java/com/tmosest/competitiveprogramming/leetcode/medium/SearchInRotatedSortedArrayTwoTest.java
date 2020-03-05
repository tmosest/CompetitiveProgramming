package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 81. Search in Rotated Sorted Array II")
class SearchInRotatedSortedArrayTwoTest {

  private SearchInRotatedSortedArrayTwo searchInRotatedSortedArrayTwo =
      new SearchInRotatedSortedArrayTwo();

  @Test
  void testCase0() {
    int[] input = {2,5,6,0,0,1,2};
    Assertions.assertTrue(searchInRotatedSortedArrayTwo.search(input, 0));
  }
}
