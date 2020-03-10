package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 518. Coin Change 2")
class CoinChangeTwoTest {

  private CoinChangeTwo coinChangeTwo = new CoinChangeTwo();

  @Test
  void testCase0() {
    int[] coins = {1, 2, 5};
    Assertions.assertEquals(4, coinChangeTwo.change(5, coins));
  }

  @Test
  void testCase1() {
    int[] coins = {2};
    Assertions.assertEquals(0, coinChangeTwo.change(3, coins));
  }
}
