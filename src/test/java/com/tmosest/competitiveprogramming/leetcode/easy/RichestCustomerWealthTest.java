package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("wc217")
@DisplayName("LeetCode: 1672. Richest Customer Wealth")
class RichestCustomerWealthTest {

  private RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();

  @Test
  void test1() {
    Assertions.assertEquals(6,
        richestCustomerWealth.maximumWealth(new int[][] {{1,2,3}, {3,2,1}}));
  }
}
