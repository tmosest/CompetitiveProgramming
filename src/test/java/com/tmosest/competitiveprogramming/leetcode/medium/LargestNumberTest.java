package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 179. Largest Number")
class LargestNumberTest {

  private LargestNumber largestNumber = new LargestNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] nums = {
        10, 2
    };
    Assertions.assertEquals("210", largestNumber.largestNumber(nums));
  }
}
