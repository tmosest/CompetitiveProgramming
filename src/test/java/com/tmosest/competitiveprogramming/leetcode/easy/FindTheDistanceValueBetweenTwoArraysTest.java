package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1385. Find the Distance Value Between Two Arrays")
class FindTheDistanceValueBetweenTwoArraysTest {

  private FindTheDistanceValueBetweenTwoArrays findTheDistanceValueBetweenTwoArrays =
      new FindTheDistanceValueBetweenTwoArrays();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        2,
        findTheDistanceValueBetweenTwoArrays.findTheDistanceValue(
            new int[] {4,5,8},
            new int[] {10, 9, 1, 8},
            2
        ));
  }
}
