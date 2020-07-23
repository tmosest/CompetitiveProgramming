package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc190")
@DisplayName("LeetCode: 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence")
class CheckIfWordOccursAsPrefixOfAnyWordInSentenceTest {

  private CheckIfWordOccursAsPrefixOfAnyWordInSentence checkIfWordOccursAsPrefixOfAnyWordInSentence =
      new CheckIfWordOccursAsPrefixOfAnyWordInSentence();

  private void test(String sentece, String prefix, int index) {
    Assertions.assertEquals(index, checkIfWordOccursAsPrefixOfAnyWordInSentence.isPrefixOfWord(sentece, prefix));
  }

  @Test
  void testCase0() {
    test("i love eating burger", "burg", 4);
  }

  @Test
  void testCase1() {
    test("this problem is an easy problem", "pro", 2);
  }

  @Test
  void testCase2() {
    test("i am tired", "you", -1);
  }
}
