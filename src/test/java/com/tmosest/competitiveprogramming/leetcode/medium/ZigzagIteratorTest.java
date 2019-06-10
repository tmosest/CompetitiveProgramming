package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 281. Zigzag Iterator")
class ZigzagIteratorTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] one = {
        1,2
    };
    Integer[] two = {
        3,4,5,6
    };
    Integer[] expected = {
        1,3,2,4,5,6
    };
    int index = 0;
    for (Integer num : new ZigzagIterator(Arrays.asList(one), Arrays.asList(two))) {
      Assertions.assertEquals(expected[index++], num);
    }
  }
}
