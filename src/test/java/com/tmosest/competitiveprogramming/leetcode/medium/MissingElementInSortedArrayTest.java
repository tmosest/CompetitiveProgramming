package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1060. Missing Element in Sorted Array")
class MissingElementInSortedArrayTest {

  private MissingElementInSortedArray missingElementInSortedArray = new MissingElementInSortedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] inputs = {
        4,7,9,10
    };
    Assertions.assertEquals(5, missingElementInSortedArray.missingElement(inputs, 1));
  }
}
