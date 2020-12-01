package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc217")
@DisplayName("LeetCode: 1674. Minimum Moves to Make Array Complementary")
class MinimumMovesToMakeArrayComplementaryTest {

  @Test
  void test1() {
    Assertions.assertEquals(1,
        new MinimumMovesToMakeArrayComplementary()
            .minMoves(new int[]{1, 2, 4, 3}, 4));
  }
}
