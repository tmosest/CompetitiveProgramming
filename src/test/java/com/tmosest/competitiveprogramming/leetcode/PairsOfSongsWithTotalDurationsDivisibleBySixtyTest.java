package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("easy")
@DisplayName("LeetCode: 54. Spiral Matrix")
public class PairsOfSongsWithTotalDurationsDivisibleBySixtyTest {

  PairsOfSongsWithTotalDurationsDivisibleBySixty pairsOfSongsWithTotalDurationsDivisibleBySixty
      = new PairsOfSongsWithTotalDurationsDivisibleBySixty();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        30,20,150,100,40
    };
    Assertions.assertEquals(3, pairsOfSongsWithTotalDurationsDivisibleBySixty.numPairsDivisibleBy60(input));
  }
}
