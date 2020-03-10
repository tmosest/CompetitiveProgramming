package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 898. Bitwise ORs of Subarrays")
class BitwiseOrsOfSubarraysTest {

  private BitwiseOrsOfSubarrays bitwiseOrsOfSubarrays =
      new BitwiseOrsOfSubarrays();

  @Test
  void testCase0() {
    int[] input = {0};
    Assertions.assertEquals(1, bitwiseOrsOfSubarrays.subarrayBitwiseORs(input));
  }
}
