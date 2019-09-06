package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1175. Prime Arrangements")
class PrimeArrangementsTest {

  private PrimeArrangements primeArrangements = new PrimeArrangements();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(12, primeArrangements.numPrimeArrangements(5));
  }
}
