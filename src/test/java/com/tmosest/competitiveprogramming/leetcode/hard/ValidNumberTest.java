package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 65. Valid Number")
class ValidNumberTest {

  private ValidNumber validNumber = new ValidNumber();

  @Test
  void testCase0() {
    Assertions.assertTrue(validNumber.isNumber("0"));
  }

  @Test
  void testCase1() {
    Assertions.assertFalse(validNumber.isNumber("e3"));
  }
}
