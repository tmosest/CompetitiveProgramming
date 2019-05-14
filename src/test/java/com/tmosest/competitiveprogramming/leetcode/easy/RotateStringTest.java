package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 796. Rotate String")
class RotateStringTest {
	/* Write code here. */

  RotateString rotateString = new RotateString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(rotateString.rotateString("abcde", "cdeab"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(rotateString.rotateString("abcde", "abced"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(rotateString.rotateString(
        "bqqutquvbtgouklsayfvzewpnrbwfcdmwctusunasdbpbmhnvy",
        "wpnrbwfcdmwctusunasdbpbmhnvybqqutquvbtgouklsayfvze")
    );
  }


}
