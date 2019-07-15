package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1119. Remove Vowels from a String")
class RemoveVowelsFromStringTest {

  private RemoveVowelsFromString removeVowelsFromString = new RemoveVowelsFromString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("ltcdscmmntyfrcdrs", removeVowelsFromString.removeVowels("leetcodeisacommunityforcoders"));
  }
}
