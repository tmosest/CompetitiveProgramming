package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc215")
@DisplayName("LeetCode: 1657. Determine if Two Strings Are Close")
class DetermineIfTwoStringsAreCloseTest {

  @Test
  void test1() {
    Assertions.assertTrue(new DetermineIfTwoStringsAreClose().closeStrings("abc", "bca"));
  }
}
