package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1413. Minimum Value to Get Positive Step by Step Sum")
class MinimumValueToGetPositiveStepByStepSumTest {

  private MinimumValueToGetPositiveStepByStepSum minimumValueToGetPositiveStepByStepSum =
      new MinimumValueToGetPositiveStepByStepSum();

  @Test
  void testCase0() {
    Assertions.assertEquals(5, minimumValueToGetPositiveStepByStepSum.minStartValue(new int[] {
        -3,2,-3,4,2
    }));
  }
}
