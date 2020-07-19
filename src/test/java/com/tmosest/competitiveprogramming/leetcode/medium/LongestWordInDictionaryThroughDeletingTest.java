package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 524. Longest Word in Dictionary through Deleting")
class LongestWordInDictionaryThroughDeletingTest {
	/* Write code here. */

  private LongestWordInDictionaryThroughDeleting longestWordInDictionaryThroughDeleting
      = new LongestWordInDictionaryThroughDeleting();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] dictionary = {
        "ale","apple","monkey","plea"
    };
    Assertions.assertEquals("apple",longestWordInDictionaryThroughDeleting.findLongestWord("abpcplea",
        Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] dictionary = {
        "a","b","letter"
    };
    Assertions.assertEquals("a",longestWordInDictionaryThroughDeleting.findLongestWord("abpcplea",
        Arrays.asList(dictionary)));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] dictionary = {
        "ba","ab","a","b"
    };
    Assertions.assertEquals("ab",longestWordInDictionaryThroughDeleting.findLongestWord("bab",
        Arrays.asList(dictionary)));
  }


}
