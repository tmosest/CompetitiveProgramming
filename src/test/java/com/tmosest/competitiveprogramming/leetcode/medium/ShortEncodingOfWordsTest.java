package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 820. Short Encoding of Words")
class ShortEncodingOfWordsTest {

  private ShortEncodingOfWords shortEncodingOfWords = new ShortEncodingOfWords();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {
        "time", "me", "bell"
    };
    Assertions.assertEquals(10, shortEncodingOfWords.minimumLengthEncoding(words));
  }
}
