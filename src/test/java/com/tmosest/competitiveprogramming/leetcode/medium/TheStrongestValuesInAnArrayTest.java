package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc192")
@DisplayName("LeetCode: 1471. The k Strongest Values in an Array")
class TheStrongestValuesInAnArrayTest {

  private TheStrongestValuesInAnArray strongestValuesInAnArray = new TheStrongestValuesInAnArray();

  private void test(int[] arr, int diff, int[] output) {
    Assertions.assertArrayEquals(output, strongestValuesInAnArray.getStrongest(arr, diff));
  }

  @Test
  void testCase0() {
    test(new int[] {1,2,3,4,5}, 2, new int[] {5,1});
  }

  @Test
  void testCase1() {
    test(new int[] {1,1,3,5,5}, 2, new int[] {5,5});
  }

  @Test
  void testCase2() {
    test(new int[] {6,7,11,7,6,8}, 5, new int[] {11,8,6,6,7});
  }

  @Test
  void testCase4() {
    test(new int[] {6,-3,7,2,11}, 3, new int[] {-3,11,2});
  }

  @Test
  void testCase5() {
    test(new int[] {-7,22,17,3}, 2, new int[] {22,17});
  }
}
