package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1155. Number of Dice Rolls With Target Sum")
class NumberOfDiceRollsWithTargetSumTest {

  private NumberOfDiceRollsWithTargetSum numberOfDiceRollsWithTargetSum = new NumberOfDiceRollsWithTargetSum();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1, numberOfDiceRollsWithTargetSum.numRollsToTarget(1, 6, 3));
  }
}
