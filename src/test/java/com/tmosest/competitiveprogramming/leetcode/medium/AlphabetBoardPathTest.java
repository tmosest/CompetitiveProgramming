package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1138. Alphabet Board Path")
class AlphabetBoardPathTest {

  private AlphabetBoardPath alphabetBoardPath = new AlphabetBoardPath();

  @Test
  void testCase0() {
    Assertions.assertEquals("DDR!UURRR!!DDD!", alphabetBoardPath.alphabetBoardPath("leet"));
  }
}
