package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 5087. Letter Tile Possibilities")
class LetterTilePossibilitiesTest {

  private LetterTilePossibilities letterTilePossibilities = new LetterTilePossibilities();

  @Test
  @DisplayName("AAB has 8 possible sequences")
  void testCase0() {
    Assertions.assertEquals(8, letterTilePossibilities.numTilePossibilities("AAB"));
  }

  @Test
  @DisplayName("AAABBC has 188 possible sequences")
  void testCase1() {
    Assertions.assertEquals(188, letterTilePossibilities.numTilePossibilities("AAABBC"));
  }
}
