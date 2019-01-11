package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 819. Most Common Word")
public class MostCommonWordTest {

  MostCommonWord mostCommonWord = new MostCommonWord();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] bannedWords = {"hit"};
    Assertions.assertEquals("ball",
        mostCommonWord.mostCommonWord(
            "Bob hit a ball, the hit BALL flew far after it was hit.",
            bannedWords
        )
    );
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] bannedWords = {"a"};
    Assertions.assertEquals("b",
        mostCommonWord.mostCommonWord(
            "a, a, a, a, b,b,b,c, c",
            bannedWords
        )
    );
  }
}
