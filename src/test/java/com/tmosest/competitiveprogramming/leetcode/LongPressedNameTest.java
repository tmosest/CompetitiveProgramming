package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 925. Long Pressed Name")
public class LongPressedNameTest {

  LongPressedName longPressedName = new LongPressedName();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(longPressedName.isLongPressedName("alex", "aaleex"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(longPressedName.isLongPressedName("saeed", "ssaaedd"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(longPressedName.isLongPressedName("leelee", "lleeelee"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertTrue(longPressedName.isLongPressedName("laiden", "laiden"));
  }
}
