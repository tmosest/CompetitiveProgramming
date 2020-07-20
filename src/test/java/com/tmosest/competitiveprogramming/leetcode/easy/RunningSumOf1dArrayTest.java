package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc193")
@DisplayName("LeetCode: 1480. Running Sum of 1d Array")
class RunningSumOf1dArrayTest {

  private RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();

  private void test(int[] input, int[] output) {
    Assertions.assertArrayEquals(output, runningSumOf1dArray.runningSum(input));
  }

  @Test
  void testCase0() {
    test(new int[] {1,2,3,4}, new int[] {1,3,6,10});
  }

  @Test
  void testCase1() {
    test(new int[] {1,1,1,1,1}, new int[] {1,2,3,4,5});
  }

  @Test
  void testCase2() {
    test(new int[] {3,1,2,10,1}, new int[] {3,4,6,16,17});
  }
}
