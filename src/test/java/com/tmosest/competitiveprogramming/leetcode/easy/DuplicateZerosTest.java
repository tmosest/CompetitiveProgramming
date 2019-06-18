package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1089. Duplicate Zeros")
class DuplicateZerosTest {

  private DuplicateZeros duplicateZeros = new DuplicateZeros();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 0, 2, 3, 0, 4, 5, 0
    };
    int[] outpt = {
        1, 0, 0, 2, 3, 0, 0, 4
    };
    duplicateZeros.duplicateZeros(input);
    Assertions.assertArrayEquals(outpt, input);
  }
}
