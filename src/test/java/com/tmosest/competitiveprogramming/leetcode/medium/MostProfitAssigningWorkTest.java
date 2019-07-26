package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 826. Most Profit Assigning Work")
class MostProfitAssigningWorkTest {

  private MostProfitAssigningWork mostProfitAssigningWork = new MostProfitAssigningWork();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
   int[] difficulty = {2,4,6,8,10};
   int[] profit = {10,20,30,40,50};
   int[] worker = {4,5,6,7};
   Assertions.assertEquals(100, mostProfitAssigningWork.maxProfitAssignment(difficulty, profit, worker));
  }
}
