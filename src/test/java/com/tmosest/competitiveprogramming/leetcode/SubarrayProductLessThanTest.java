package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 925. Long Pressed Name")
public class SubarrayProductLessThanTest {

  SubarrayProductLessThan subarrayProductLessThan = new SubarrayProductLessThan();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {10, 5, 2, 6};
    Assertions.assertEquals(8, subarrayProductLessThan.numSubarrayProductLessThanK(input, 100));
  }
}
