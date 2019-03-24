package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("medium")
@DisplayName("LeetCode: 560. Subarray Sum Equals K")
public class SubarraySumEqualsTest {

  SubarraySumEquals subarraySumEquals = new SubarraySumEquals();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,1,1
    };
    Assertions.assertEquals(2, subarraySumEquals.subarraySum(input, 2));
  }
}
