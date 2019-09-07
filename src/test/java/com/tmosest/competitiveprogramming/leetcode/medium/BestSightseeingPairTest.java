package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1014. Best Sightseeing Pair")
class BestSightseeingPairTest {

  private BestSightseeingPair bestSightseeingPair = new BestSightseeingPair();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        8,1,5,2,6
    };
    Assertions.assertEquals(11, bestSightseeingPair.maxScoreSightseeingPair(input));
  }
}
