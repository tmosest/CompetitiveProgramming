package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("bigInteger")
@Tag("string")
@DisplayName("LeetCode: 415. Add Strings")
class AddStringsTest {

  private AddStrings addStrings = new AddStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("123", addStrings.addStrings("120", "3"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("100", addStrings.addStrings("99", "1"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("2", addStrings.addStrings("1", "1"));
  }
}
