package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("map")
@Tag("wc220")
@Tag("array")
@DisplayName("LeetCode: 1695. Maximum Erasure Value")
class MaximumErasureValueTest {

  private MaximumErasureValue maximumErasureValue;

  @BeforeEach
  void setup() {
    maximumErasureValue = new MaximumErasureValue();
  }

  private void test(int output, int[] nums) {
    Assertions.assertEquals(output, maximumErasureValue.maximumUniqueSubarray(nums));
  }

  @Test
  void test0() {
    test(17, new int[]{4, 2, 4, 5, 6});
  }
}
