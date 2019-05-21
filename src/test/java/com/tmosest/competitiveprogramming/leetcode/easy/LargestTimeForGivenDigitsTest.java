package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 949. Largest Time for Given Digits")
class LargestTimeForGivenDigitsTest {
	/* Write code here. */

  LargestTimeForGivenDigits largestTimeForGivenDigits = new LargestTimeForGivenDigits();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3,4
    };
    Assertions.assertEquals("23:41", largestTimeForGivenDigits.largestTimeFromDigits(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        5,5,5,5
    };
    Assertions.assertEquals("", largestTimeForGivenDigits.largestTimeFromDigits(input));
  }


}
