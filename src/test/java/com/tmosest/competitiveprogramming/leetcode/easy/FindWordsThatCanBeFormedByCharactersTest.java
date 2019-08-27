package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1160. Find Words That Can Be Formed by Characters")
class FindWordsThatCanBeFormedByCharactersTest {

  private FindWordsThatCanBeFormedByCharacters findWordsThatCanBeFormedByCharacters = new FindWordsThatCanBeFormedByCharacters();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {
        "cat","bt","hat","tree"
    };
    String chars = "atach";
    Assertions.assertEquals(6, findWordsThatCanBeFormedByCharacters.countCharacters(words, chars));
  }
}
