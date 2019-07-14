package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1122. Relative Sort Array")
class RelativeSortArrayTest {

  private RelativeSortArray relativeSortArray = new RelativeSortArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] arr1 = {
        2,3,1,3,2,4,6,7,9,2,19
    };
    int[] arr2 = {
        2,1,4,3,9,6
    };
    int[] expected = {
        2,2,2,1,4,3,3,9,6,7,19
    };
    Assertions.assertArrayEquals(expected, relativeSortArray.relativeSortArray(arr1, arr2));
  }
}
