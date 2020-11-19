package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc211")
@DisplayName("LeetCode: 1625. Lexicographically Smallest String After Applying Operations")
class LexicographicallySmallestStringAfterApplyingOperationsTest {

  @Test
  void test1() {
    Assertions.assertEquals("2050", new LexicographicallySmallestStringAfterApplyingOperations()
        .findLexSmallestString("5525", 9, 2));
  }
}
