package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("string")
@Tag("medium")
@DisplayName("LeetCode: 151. Reverse Words in a String")
public class ReverseWordsInStringTest {

  ReverseWordsInString reverseWordsInString = new ReverseWordsInString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("blue is sky the", reverseWordsInString.reverseWords("the sky is blue"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("world! hello", reverseWordsInString.reverseWords("  hello world!  "));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("example good a", reverseWordsInString.reverseWords("a good   example"));
  }
}
