package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1128. Number of Equivalent Domino Pairs")
class NumberOfEquivalentDominoPairsTest {

  private NumberOfEquivalentDominoPairs numberOfEquivalentDominoPairs = new NumberOfEquivalentDominoPairs();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] dominoes =
        {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
    Assertions.assertEquals(1, numberOfEquivalentDominoPairs.numEquivDominoPairs(dominoes));
  }
}
