package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 718. Maximum Length of Repeated Subarray")
class MaximumLengthOfRepeatedSubarrayTest {

  private MaximumLengthOfRepeatedSubarray maximumLengthOfRepeatedSubarray =
      new MaximumLengthOfRepeatedSubarray();

  @Test
  void testCase0() {
    int[] one = {1,2,3,2,1};
    int[] two = {3,2,1,4,7};
    Assertions.assertEquals(3, maximumLengthOfRepeatedSubarray.findLength(one, two));
  }
}
