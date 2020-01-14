package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1295. Find Numbers with Even Number of Digits")
class FindNumbersWithEvenNumberOfDigitsTest {

  @Test
  void findNumbers_testCase0_shouldReturn2() {
    int[] nums = {12, 345, 2, 6, 7896};
    Assertions.assertEquals(2, new FindNumbersWithEvenNumberOfDigits().findNumbers(nums));
  }
}
