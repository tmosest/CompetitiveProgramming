package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 467. Unique Substrings in Wraparound String")
class UniqueSubstringsInWraparoundStringTest {

  private UniqueSubstringsInWraparoundString uniqueSubstringsInWraparoundString = new UniqueSubstringsInWraparoundString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1, uniqueSubstringsInWraparoundString.findSubstringInWraproundString("a"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(2, uniqueSubstringsInWraparoundString.findSubstringInWraproundString("cac"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(6, uniqueSubstringsInWraparoundString.findSubstringInWraproundString("zab"));
  }
}
