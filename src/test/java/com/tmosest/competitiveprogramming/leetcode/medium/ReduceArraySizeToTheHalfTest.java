package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc174")
@DisplayName("LeetCode: 1338. Reduce Array Size to The Half")
class ReduceArraySizeToTheHalfTest {

  private ReduceArraySizeToTheHalf reduceArraySizeToTheHalf = new ReduceArraySizeToTheHalf();

  private void test(int[] input, int output) {
    Assertions.assertEquals(output, reduceArraySizeToTheHalf.minSetSize(input));
  }

  @Test
  void testCase0() {
    test(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}, 2);
  }

  @Test
  void testCase1() {
    test(new int[]{7, 7, 7, 7, 7, 7}, 1);
  }

  @Test
  void testCase2() {
    test(new int[]{1, 9}, 1);
  }

  @Test
  void testCase3() {
    test(new int[]{1000, 1000, 3, 7}, 1);
  }

  @Test
  void testCase4() {
    test(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
  }
}
