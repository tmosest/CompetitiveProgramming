package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc216")
@DisplayName("LeetCode: 1664. Ways to Make a Fair Array")
class WaysToMakeFairArrayTest {

  private WaysToMakeFairArray waysToMakeFairArray = new WaysToMakeFairArray();

  private void test(int expected, int[] input) {
    Assertions.assertEquals(expected, waysToMakeFairArray.waysToMakeFair(input));
  }

  @Test
  void test1() {
    test(1, new int[] {2, 1, 6, 4});
  }

  @Test
  void test2() {
    test(3, new int[] {1, 1, 1});
  }
}
