package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 451. Sort Characters By Frequency")
class SortCharactersByFrequencyTest {

  private SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("eetr", sortCharactersByFrequency.frequencySort("tree"));
  }
}
