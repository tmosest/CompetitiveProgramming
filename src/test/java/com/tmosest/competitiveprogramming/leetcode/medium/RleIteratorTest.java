package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 900. RLE Iterator")
class RleIteratorTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] data = {
        3,8,0,9,2,5
    };
    int[] times = {
      2,1,1,2
    };
    int[] expected = {
        8,8,5,-1
    };
    RleIterator rleIterator = new RleIterator(data);
    int[] actual = new int[expected.length];
    for (int i = 0; i < actual.length; i++) {
      actual[i] = rleIterator.next(times[i]);
    }
    Assertions.assertArrayEquals(expected, actual);
  }
}
