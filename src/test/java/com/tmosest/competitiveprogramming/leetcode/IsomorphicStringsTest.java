package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 205. Isomorphic Strings")
public class IsomorphicStringsTest {
  IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertFalse(isomorphicStrings.isIsomorphic("aba", "baa"));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertFalse(isomorphicStrings.isIsomorphic("ab", "aa"));
  }
}
