package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1356. Sort Integers by The Number of 1 Bits")
class SortIntegersByTheNumberOfOneBitsTest {

  private SortIntegersByTheNumberOfOneBits sortIntegersByTheNumberOfOneBits =
      new SortIntegersByTheNumberOfOneBits();

  @Test
  void testCase0() {
    int[] expected = {0,1,2,4,8,3,5,6,7};
    int[] input = {0,1,2,3,4,5,6,7,8};
    Assertions.assertArrayEquals(expected, sortIntegersByTheNumberOfOneBits.sortByBits(input));
  }
}
