package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 260. Single Number III")
class SingleNumberThreeTest {

  private SingleNumberThree singleNumberThree = new SingleNumberThree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,1,3,2,5
    };
    int[] expected = {
        3, 5
    };
    Assertions.assertArrayEquals(expected, singleNumberThree.singleNumber(input));
  }
}
