package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 393. UTF-8 Validation")
class Utf8ValidationTest {

  private Utf8Validation utf8Validation = new Utf8Validation();

  @Test
  void testCase0() {
    int[] data = {197, 130, 1};
    Assertions.assertTrue(utf8Validation.validUtf8(data));
  }
}
