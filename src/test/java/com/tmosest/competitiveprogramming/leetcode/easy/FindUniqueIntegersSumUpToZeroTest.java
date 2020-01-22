package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1304. Find N Unique Integers Sum up to Zero")
class FindUniqueIntegersSumUpToZeroTest {

  @Test
  void testCase0() {
    int[] actual = new FindUniqueIntegersSumUpToZero().sumZero(5);
    Assertions.assertNotEquals(0, actual.length);
  }
}
