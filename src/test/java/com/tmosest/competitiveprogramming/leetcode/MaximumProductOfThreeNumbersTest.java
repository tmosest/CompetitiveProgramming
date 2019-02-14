package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 628. Maximum Product of Three Numbers")
public class MaximumProductOfThreeNumbersTest {

  MaximumProductOfThreeNumbers maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3
    };
    Assertions.assertEquals(6, maximumProductOfThreeNumbers.maximumProduct(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        1,2,3,4
    };
    Assertions.assertEquals(24, maximumProductOfThreeNumbers.maximumProduct(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        -4,-3,-2,-1,60
    };
    Assertions.assertEquals(720, maximumProductOfThreeNumbers.maximumProduct(input));
  }
}
