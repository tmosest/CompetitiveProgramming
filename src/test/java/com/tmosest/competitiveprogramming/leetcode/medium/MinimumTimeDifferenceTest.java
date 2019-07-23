package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 539. Minimum Time Difference")
class MinimumTimeDifferenceTest {

  private MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] times = {
      "23:59", "00:00"
    };
    Assertions.assertEquals(1, minimumTimeDifference.findMinDifference(Arrays.asList(times)));
  }
}
