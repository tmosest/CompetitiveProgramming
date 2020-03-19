package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1358. Number of Substrings Containing All Three Characters")
class NumberOfSubstringsContainingAllThreeCharactersTest {

  private NumberOfSubstringsContainingAllThreeCharacters numberOfSubstringsContainingAllThreeCharacters =
      new NumberOfSubstringsContainingAllThreeCharacters();

  @Test
  void testCase0() {
    Assertions.assertEquals(10, numberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings("abcabc"));
  }
}
