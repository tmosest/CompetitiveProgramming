package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("string")
@Tag("medium")
@DisplayName("LeetCode: 139. Word Break")
public class WordBreakTest {

  WordBreak wordBreak = new WordBreak();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {
        "leet", "code"
    };
    Assertions.assertTrue(wordBreak.wordBreak("leetcode", Arrays.asList(words)));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] words = {
        "apple", "pen"
    };
    Assertions.assertTrue(wordBreak.wordBreak("applepenapple", Arrays.asList(words)));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] words = {
        "cats", "dog", "sand", "and", "cat"
    };
    Assertions.assertFalse(wordBreak.wordBreak("catsandog", Arrays.asList(words)));
  }
}
