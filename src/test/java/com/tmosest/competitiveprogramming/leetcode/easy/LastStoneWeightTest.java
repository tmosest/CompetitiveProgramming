package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1046. Last Stone Weight")
class LastStoneWeightTest {

  private LastStoneWeight lastStoneWeight = new LastStoneWeight();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] stones = {
        2,7,4,1,8,1
    };
    Assertions.assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
  }
}
