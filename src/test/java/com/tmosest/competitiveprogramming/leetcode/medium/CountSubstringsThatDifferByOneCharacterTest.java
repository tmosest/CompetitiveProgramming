package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("bwc38")
@DisplayName("LeetCode: 1638. Count Substrings That Differ by One Character")
class CountSubstringsThatDifferByOneCharacterTest {

  @Test
  void test1() {
    Assertions.assertEquals(6, new CountSubstringsThatDifferByOneCharacter().countSubstrings(
        "aba", "baba"
    ));
  }
}
