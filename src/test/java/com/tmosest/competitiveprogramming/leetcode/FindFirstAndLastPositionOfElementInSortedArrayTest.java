package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("binarySearch")
@DisplayName("LeetCode: 34. Find First and Last Position of Element in Sorted Array")
public class FindFirstAndLastPositionOfElementInSortedArrayTest {

  FindFirstAndLastPositionOfElementInSortedArray findFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] nums = {5,7,7,8,8,10};
    int[] expected = {3, 4};
    Assertions.assertArrayEquals(expected, findFirstAndLastPositionOfElementInSortedArray.searchRange(nums, 8));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] nums = {5,7,7,8,8,10};
    int[] expected = {-1, -1};
    Assertions.assertArrayEquals(expected, findFirstAndLastPositionOfElementInSortedArray.searchRange(nums, 6));
  }
}
