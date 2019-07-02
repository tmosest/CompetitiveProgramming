package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 413. Arithmetic Slices")
class ArithmeticSlicesTest {

  private ArithmeticSlices arithmeticSlices = new ArithmeticSlices();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 2, 3, 4
    };
    Assertions.assertEquals(3, arithmeticSlices.numberOfArithmeticSlices(input));
  }
}
