package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1387. Sort Integers by The Power Value")
class SortIntegersByThePowerValueTest {

  private SortIntegersByThePowerValue sortIntegersByThePowerValue =
      new SortIntegersByThePowerValue();

  @Test
  void testCase0() {
    Assertions.assertEquals(13, sortIntegersByThePowerValue.getKth(12, 15, 2));
  }
}
