package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 290. Word Pattern")
class WordPatternTest {
	/* Write code here. */

  WordPattern wordPattern = new WordPattern();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertFalse(wordPattern.wordPattern("abba", "dog dog dog dog"));
  }


}
