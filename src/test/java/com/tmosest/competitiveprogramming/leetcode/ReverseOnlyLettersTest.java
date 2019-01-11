package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 917. Reverse Only Letters")
public class ReverseOnlyLettersTest {

  ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("dc-ba", reverseOnlyLetters.reverseOnlyLetters("ab-cd"));
  }
}
