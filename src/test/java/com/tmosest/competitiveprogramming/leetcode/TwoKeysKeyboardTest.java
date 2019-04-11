package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 650. 2 Keys Keyboard")
public class TwoKeysKeyboardTest {

  TwoKeysKeyboard twoKeysKeyboard = new TwoKeysKeyboard();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, twoKeysKeyboard.minSteps(3));
  }
}
