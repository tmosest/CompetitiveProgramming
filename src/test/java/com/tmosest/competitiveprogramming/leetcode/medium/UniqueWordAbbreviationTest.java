package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 288. Unique Word Abbreviation")
class UniqueWordAbbreviationTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] dict = {
        "deer", "door", "cake", "card"
    };
    UniqueWordAbbreviation uniqueWordAbbreviation = new UniqueWordAbbreviation(dict);
    Assertions.assertTrue(uniqueWordAbbreviation.isUnique("cart"));
    Assertions.assertFalse(uniqueWordAbbreviation.isUnique("dear"));
  }
}
