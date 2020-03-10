package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 676. Implement Magic Dictionary")
class ImplementMagicDictionaryTest {

  private ImplementMagicDictionary implementMagicDictionary =
      new ImplementMagicDictionary();

  @Test
  void testCase0() {
    String[] dictionary = {"hello", "leetcode"};
    implementMagicDictionary.buildDict(dictionary);

    Assertions.assertFalse(implementMagicDictionary.search("hello"));
    Assertions.assertTrue(implementMagicDictionary.search("hhllo"));
  }
}
