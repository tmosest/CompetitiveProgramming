package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 5083. Occurrences After Bigram")
class OccurrencesAfterBigramTest {

  private OccurrencesAfterBigram occurrencesAfterBigram = new OccurrencesAfterBigram();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] expected = {
      "girl", "student"
    };
    Assertions.assertArrayEquals(
        expected,
        occurrencesAfterBigram.findOcurrences(
            "alice is a good girl she is a good student",
            "a",
            "good"
        )
    );
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] expected = {
        "we","rock"
    };
    Assertions.assertArrayEquals(
        expected,
        occurrencesAfterBigram.findOcurrences(
            "we will we will rock you",
            "we",
            "will"
        )
    );
  }
}
