package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 728. Self Dividing Numbers")
public class BaseSevenTest {

  BaseSeven baseSeven = new BaseSeven();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("202", baseSeven.convertToBase7(100));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("-10", baseSeven.convertToBase7(-7));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("0", baseSeven.convertToBase7(0));
  }
}
