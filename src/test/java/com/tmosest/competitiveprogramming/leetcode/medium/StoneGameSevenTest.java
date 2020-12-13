package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("gameTheory")
@Tag("wc219")
@DisplayName("LeetCode: 1690. Stone Game VII")
class StoneGameSevenTest {

  private StoneGameSeven stoneGameSeven;

  @BeforeEach
  void setup() {
    stoneGameSeven = new StoneGameSeven();
  }

  private void test(int output, int[] stones) {
    Assertions.assertEquals(output, stoneGameSeven.stoneGame7(stones));
  }

  @Test
  void test0() {
    test(6, new int[] {5, 3, 1, 4, 2});
  }
}
