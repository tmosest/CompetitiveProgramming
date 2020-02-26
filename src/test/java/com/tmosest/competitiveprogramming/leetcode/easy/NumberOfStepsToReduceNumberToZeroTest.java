package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1342. Number of Steps to Reduce a Number to Zero")
class NumberOfStepsToReduceNumberToZeroTest {

  private NumberOfStepsToReduceNumberToZero numberOfStepsToReduceNumberToZero = new NumberOfStepsToReduceNumberToZero();

  @Test
  void testCase0() {
    Assertions.assertEquals(6, numberOfStepsToReduceNumberToZero.numberOfSteps(14));
  }
}
