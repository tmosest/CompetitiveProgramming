package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 758. Bold Words in String")
class BoldWordsStringTest {
	/* Write code here. */

  BoldWordsString boldWordsString = new BoldWordsString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] inputs = {"ab", "bc"};
    Assertions.assertEquals("a<b>abc</b>d", boldWordsString.boldWords(inputs, "aabcd"));
  }


}
