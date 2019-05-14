package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 875. Koko Eating Bananas")
class KokoEatingBananasTest {
	/* Write code here. */

  KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3,6,7,11
    };
    Assertions.assertEquals(4, kokoEatingBananas.minEatingSpeed(input, 8));
  }


}
