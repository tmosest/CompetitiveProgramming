package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence")
class CheckIfWordOccursAsPrefixOfAnyWordInSentenceTest {

  private CheckIfWordOccursAsPrefixOfAnyWordInSentence checkIfWordOccursAsPrefixOfAnyWordInSentence =
      new CheckIfWordOccursAsPrefixOfAnyWordInSentence();

  @Test
  void testCase0() {
    Assertions.assertEquals(4,
        checkIfWordOccursAsPrefixOfAnyWordInSentence.isPrefixOfWord("i love eating burger", "burg")
    );
  }
}
