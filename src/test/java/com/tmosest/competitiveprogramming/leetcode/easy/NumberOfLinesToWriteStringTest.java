package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 717. 1-bit and 2-bit Characters")
class NumberOfLinesToWriteStringTest {
	/* Write code here. */

  NumberOfLinesToWriteString numberOfLinesToWriteString = new NumberOfLinesToWriteString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    int[] expected = {3, 60};
    Assertions.assertArrayEquals(expected, numberOfLinesToWriteString.numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz"));
  }


}
