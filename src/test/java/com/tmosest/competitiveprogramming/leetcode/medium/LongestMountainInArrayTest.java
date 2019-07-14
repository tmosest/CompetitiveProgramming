package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 845. Longest Mountain in Array")
class LongestMountainInArrayTest {

  private LongestMountainInArray longestMountainInArray = new LongestMountainInArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] arr = {
        2,1,4,7,3,2,5
    };
    Assertions.assertEquals(5, longestMountainInArray.longestMountain(arr));
  }
}
