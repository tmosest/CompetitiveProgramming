package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 540. Single Element in a Sorted Array")
class SingleElementInSortedArrayTest {

  private SingleElementInSortedArray singleElementInSortedArray = new SingleElementInSortedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,1,2,3,3,4,4,8,8
    };
    Assertions.assertEquals(2, singleElementInSortedArray.singleNonDuplicate(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        3,3,7,7,10,11,11
    };
    Assertions.assertEquals(10, singleElementInSortedArray.singleNonDuplicate(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        3,3,7,7,10
    };
    Assertions.assertEquals(10, singleElementInSortedArray.singleNonDuplicate(input));
  }
}
