package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1317. Convert Integer to the Sum of Two No-Zero Integers")
class ConvertIntegerToTheSumOfTwoNozeroIntegersTest {

  @Test
  void testCase0() {
    int[] actual = new ConvertIntegerToTheSumOfTwoNozeroIntegers().getNoZeroIntegers(2);
    int[] expected = {1, 1};
    Assertions.assertArrayEquals(expected, actual);
  }
}
