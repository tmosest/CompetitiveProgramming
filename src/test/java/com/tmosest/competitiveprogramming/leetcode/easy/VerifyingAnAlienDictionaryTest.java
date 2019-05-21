package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 953. Verifying an Alien Dictionary")
class VerifyingAnAlienDictionaryTest {
	/* Write code here. */

  VerifyingAnAlienDictionary verifyingAnAlienDictionary = new VerifyingAnAlienDictionary();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {"hello", "leetcode"};
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    Assertions.assertTrue(verifyingAnAlienDictionary.isAlienSorted(words, order));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] words = {"word", "world", "row"};
    String order = "worldabcefghijkmnpqstuvxyz";
    Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(words, order));
  }


}
