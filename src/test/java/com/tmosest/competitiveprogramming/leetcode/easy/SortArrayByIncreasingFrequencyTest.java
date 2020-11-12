package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bwc38")
@DisplayName("LeetCode: 1636. Sort Array by Increasing Frequency")
class SortArrayByIncreasingFrequencyTest {

  @Test
  void test1() {
    Assertions.assertArrayEquals(new int[] {3,1,1,2,2,2},
        new SortArrayByIncreasingFrequency().frequencySort(new int[] {1,1,2,2,2,3}));
  }
}
