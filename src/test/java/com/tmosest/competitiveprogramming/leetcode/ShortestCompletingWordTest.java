package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 748. Shortest Completing Word")
public class ShortestCompletingWordTest {

  ShortestCompletingWord shortestCompletingWord = new ShortestCompletingWord();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {"step", "steps", "stripe", "stepple"};
    Assertions.assertEquals(
        "steps",
        shortestCompletingWord.shortestCompletingWord("1s3 PSt", words)
    );
  }
}
