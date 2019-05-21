package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("medium")
@DisplayName("LeetCode: 322. Coin Change")
class CoinChangeTest {
	/* Write code here. */

  CoinChange coinChange = new CoinChange();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] coins = {
        1, 2, 5
    };
    Assertions.assertEquals(3, coinChange.coinChange(coins, 11));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] coins = {
        2
    };
    Assertions.assertEquals(-1, coinChange.coinChange(coins, 3));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] coins = {
        186,419,83,408
    };
    Assertions.assertEquals(20, coinChange.coinChange(coins, 6249));
  }


}
