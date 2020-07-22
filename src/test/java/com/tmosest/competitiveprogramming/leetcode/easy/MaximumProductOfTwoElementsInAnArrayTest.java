package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("wc192")
@DisplayName("LeetCode: 1464. Maximum Product of Two Elements in an Array")
class MaximumProductOfTwoElementsInAnArrayTest {

  private MaximumProductOfTwoElementsInAnArray maximumProductOfTwoElementsInAnArray =
      new MaximumProductOfTwoElementsInAnArray();

  @Test
  void testCase0() {
    Assertions.assertEquals(12, maximumProductOfTwoElementsInAnArray.maxProduct(new int[] {
        3,4,5,2
    }));
  }
}
