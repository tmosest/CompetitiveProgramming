package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LeetCode: 211. Add and Search Word - Data structure design")
public class WordDictionaryTest {
  WordDictionary wordDictionary;

  @BeforeEach
  void setup() {
    wordDictionary = new WordDictionary();
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    wordDictionary.addWord("bad");
    wordDictionary.addWord("dad");
    wordDictionary.addWord("mad");
    Assertions.assertFalse(wordDictionary.search("pad"));
    Assertions.assertTrue(wordDictionary.search("bad"));
    Assertions.assertTrue(wordDictionary.search(".ad"));
    Assertions.assertTrue(wordDictionary.search("b.."));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    wordDictionary.addWord("at");
    wordDictionary.addWord("an");
    wordDictionary.addWord("and");
    wordDictionary.addWord("add");
    Assertions.assertFalse(wordDictionary.search("a"));
    Assertions.assertFalse(wordDictionary.search(".at"));
    wordDictionary.addWord("bat");
    Assertions.assertTrue(wordDictionary.search(".at"));
    Assertions.assertTrue(wordDictionary.search("an."));
    Assertions.assertFalse(wordDictionary.search("a.d."));
    Assertions.assertFalse(wordDictionary.search("b."));
    Assertions.assertTrue(wordDictionary.search("an."));
    Assertions.assertTrue(wordDictionary.search("a.d"));
    Assertions.assertFalse(wordDictionary.search("."));
  }
}
