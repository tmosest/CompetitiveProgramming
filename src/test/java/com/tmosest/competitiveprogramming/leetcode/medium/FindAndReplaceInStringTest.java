package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 833. Find And Replace in String")
class FindAndReplaceInStringTest {

  private FindAndReplaceInString findAndReplaceInString = new FindAndReplaceInString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] indexes = {
        0, 2
    };
    String[] sources = {
        "a", "cd"
    };
    String[] targets = {
        "eee", "ffff"
    };
    Assertions.assertEquals("eeebffff", findAndReplaceInString.findReplaceString("abcd", indexes, sources, targets));
  }
}
