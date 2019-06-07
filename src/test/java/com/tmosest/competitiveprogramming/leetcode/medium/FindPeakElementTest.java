package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 162. Find Peak Element")
class FindPeakElementTest {

  private FindPeakElement findPeakElement = new FindPeakElement();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 2, 3, 1
    };
    Assertions.assertEquals(2, findPeakElement.findPeakElement(input));
  }
}
