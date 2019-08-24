package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 525. Contiguous Array")
class ContiguousArrayTest {

  private ContiguousArray contiguousArray = new ContiguousArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
      0, 1
    };
    Assertions.assertEquals(2, contiguousArray.findMaxLength(input));
  }
}
