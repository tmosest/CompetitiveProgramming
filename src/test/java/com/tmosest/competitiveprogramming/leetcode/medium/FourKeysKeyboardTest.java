package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 651. 4 Keys Keyboard")
class FourKeysKeyboardTest {
	/* Write code here. */

  FourKeysKeyboard fourKeysKeyboard = new FourKeysKeyboard();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, fourKeysKeyboard.maxA(3));
  }


}
