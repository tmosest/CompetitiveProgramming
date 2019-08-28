package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 714. Best Time to Buy and Sell Stock with Transaction Fee")
class BestTimeToBuyAndSellStockWithTransactionFeeTest {

  private BestTimeToBuyAndSellStockWithTransactionFee bestTimeToBuyAndSellStockWithTransactionFee
      = new BestTimeToBuyAndSellStockWithTransactionFee();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] inputs = {
        1, 3, 2, 8, 4, 9
    };
    Assertions.assertEquals(
        8,
        bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(inputs, 2)
    );
  }
}
