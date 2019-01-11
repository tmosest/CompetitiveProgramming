package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 804. Unique Morse Code Words")
public class UniqueMorseCodeWordsTest {

  UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {"gin", "zen", "gig", "msg"};
    Assertions.assertEquals(2, uniqueMorseCodeWords.uniqueMorseRepresentations(words));
  }
}
