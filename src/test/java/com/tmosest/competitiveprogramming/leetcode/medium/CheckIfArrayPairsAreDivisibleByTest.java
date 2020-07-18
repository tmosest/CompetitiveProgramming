package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc195")
@DisplayName("LeetCode: 1497. Check If Array Pairs Are Divisible by k")
class CheckIfArrayPairsAreDivisibleByTest {

  private CheckIfArrayPairsAreDivisibleBy checkIfArrayPairsAreDivisibleBy = new CheckIfArrayPairsAreDivisibleBy();

  @Test
  void testCase0() {
    Assertions.assertTrue(checkIfArrayPairsAreDivisibleBy.canArrange(new int[]{
        1, 2, 3, 4, 5, 10, 6, 7, 8, 9
    }, 5));
  }
}
