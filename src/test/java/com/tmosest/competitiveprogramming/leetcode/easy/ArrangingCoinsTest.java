package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 441. Arranging Coins")
class ArrangingCoinsTest {
	/* Write code here. */

  ArrangingCoins arrangingCoins = new ArrangingCoins();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(2, arrangingCoins.arrangeCoins(5));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(3, arrangingCoins.arrangeCoins(8));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(1, arrangingCoins.arrangeCoins(1));
  }


}
