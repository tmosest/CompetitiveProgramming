package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 5086. Smallest Subsequence of Distinct Characters")
class SmallestSubsequenceOfDistinctCharactersTest {

  private SmallestSubsequenceOfDistinctCharacters smallestSubsequenceOfDistinctCharacters = new SmallestSubsequenceOfDistinctCharacters();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("adbc", smallestSubsequenceOfDistinctCharacters.smallestSubsequence("cdadabcc"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("abcd", smallestSubsequenceOfDistinctCharacters.smallestSubsequence("abcd"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("eacb", smallestSubsequenceOfDistinctCharacters.smallestSubsequence("ecbacba"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals("letcod", smallestSubsequenceOfDistinctCharacters.smallestSubsequence("leetcode"));
  }
}
