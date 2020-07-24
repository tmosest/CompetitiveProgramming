package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc189")
@DisplayName("LeetCode: 1451. Rearrange Words in a Sentence")
class RearrangeWordsInSentenceTest {

  private RearrangeWordsInSentence rearrangeWordsInSentence = new RearrangeWordsInSentence();

  @Test
  void testCase0() {
    Assertions.assertEquals("Is cool leetcode", rearrangeWordsInSentence.arrangeWords("Leetcode is cool"));
  }
}
