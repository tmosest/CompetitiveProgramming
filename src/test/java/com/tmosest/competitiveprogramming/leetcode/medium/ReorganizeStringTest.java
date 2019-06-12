package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 767. Reorganize String")
class ReorganizeStringTest {

  private ReorganizeString reorganizeString = new ReorganizeString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("aba", reorganizeString.reorganizeString("aab"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("", reorganizeString.reorganizeString("aaab"));
  }
}
