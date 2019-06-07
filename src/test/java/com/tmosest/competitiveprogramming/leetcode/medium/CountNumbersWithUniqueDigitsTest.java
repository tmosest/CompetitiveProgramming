package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 357. Count Numbers with Unique Digits")
class CountNumbersWithUniqueDigitsTest {

  private CountNumbersWithUniqueDigits countNumbersWithUniqueDigits = new CountNumbersWithUniqueDigits();

  @Test
  @DisplayName("Test Case 0")
  void tetCase0() {
    Assertions.assertEquals(91, countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2));
  }
}
