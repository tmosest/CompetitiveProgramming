package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc185")
@DisplayName("LeetCode: 1419. Minimum Number of Frogs Croaking")
class MinimumNumberOfFrogsCroakingTest {

  private MinimumNumberOfFrogsCroaking minimumNumberOfFrogsCroaking =
      new MinimumNumberOfFrogsCroaking();

  @Test
  void testCase0() {
    Assertions.assertEquals(1,
        minimumNumberOfFrogsCroaking.minNumberOfFrogs("croakcroak"));
  }
}
