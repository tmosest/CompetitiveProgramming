package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 395. Longest Substring with At Least K Repeating Characters")
class LongestSubstringWithAtLeastRepeatingCharactersTest {

  private LongestSubstringWithAtLeastRepeatingCharacters longestSubstringWithAtLeastRepeatingCharacters =
      new LongestSubstringWithAtLeastRepeatingCharacters();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, longestSubstringWithAtLeastRepeatingCharacters.longestSubstring("aaabb", 3));
  }
}
