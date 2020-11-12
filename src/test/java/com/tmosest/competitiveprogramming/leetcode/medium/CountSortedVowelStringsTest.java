package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc213")
@Tag("dynamic")
@DisplayName("LeetCode: 1641. Count Sorted Vowel Strings")
class CountSortedVowelStringsTest {

  @Test
  void test() {
    Assertions.assertEquals(5, new CountSortedVowelStrings().countVowelStrings(1));
  }
}
