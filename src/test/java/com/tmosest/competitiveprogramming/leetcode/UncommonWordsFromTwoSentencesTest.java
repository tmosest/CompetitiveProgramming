package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 884. Uncommon Words from Two Sentences")
public class UncommonWordsFromTwoSentencesTest {

  UncommonWordsFromTwoSentences uncommonWordsFromTwoSentences = new UncommonWordsFromTwoSentences();

  void test(String[] expected, String sentenceA, String sentenceB) {
    String[] actual =  uncommonWordsFromTwoSentences.uncommonFromSentences(
        sentenceA,
        sentenceB
    );
    Arrays.sort(expected);
    Arrays.sort(actual);
    Assertions.assertArrayEquals(
        expected,
        actual
    );
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] expected = {"sweet","sour"};
    test(expected, "this apple is sweet", "this apple is sour");
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] expected = {"banana"};
    test(expected, "apple apple", "banana");
  }
}
