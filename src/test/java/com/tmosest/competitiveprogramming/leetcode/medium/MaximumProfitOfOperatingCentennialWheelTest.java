package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc208")
@DisplayName("LeetCode: 1599. Maximum Profit of Operating a Centennial Wheel")
class MaximumProfitOfOperatingCentennialWheelTest {

  private MaximumProfitOfOperatingCentennialWheel maximumProfitOfOperatingCentennialWheel =
      new MaximumProfitOfOperatingCentennialWheel();

  @Test
  void test1() {
    Assertions.assertEquals(3, maximumProfitOfOperatingCentennialWheel
        .minOperationsMaxProfit(new int[] {8, 3}, 5, 6));
  }
}
