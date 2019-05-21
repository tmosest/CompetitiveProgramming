package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@Tag("trie")
@DisplayName("LeetCode: 720. Longest Word in Dictionary")
class LongestWordInDictionaryTest {
	/* Write code here. */

  LongestWordInDictionary longestWordInDictionary = new LongestWordInDictionary();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {"w","wo","wor","worl", "world"};
    Assertions.assertEquals("world", longestWordInDictionary.longestWord(words));
  }


}
