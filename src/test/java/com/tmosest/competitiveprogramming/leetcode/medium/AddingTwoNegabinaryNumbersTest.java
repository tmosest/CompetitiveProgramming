package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1073. Adding Two Negabinary Numbers")
class AddingTwoNegabinaryNumbersTest {

  private AddingTwoNegabinaryNumbers addingTwoNegabinaryNumbers = new AddingTwoNegabinaryNumbers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] one = {
        1,1,1,1,1
    };
    int[] two = {
        1,0,1
    };
    int[] expected = {
        1,0,0,0,0
    };
    Assertions.assertArrayEquals(expected, addingTwoNegabinaryNumbers.addNegabinary(one, two));
  }
}
