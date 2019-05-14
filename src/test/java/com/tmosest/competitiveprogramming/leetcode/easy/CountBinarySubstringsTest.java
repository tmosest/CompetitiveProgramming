package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 696. Count Binary Substrings")
class CountBinarySubstringsTest {
	/* Write code here. */

  CountBinarySubstrings countBinarySubstrings = new CountBinarySubstrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(6, countBinarySubstrings.countBinarySubstrings("00110011"));
  }


}
