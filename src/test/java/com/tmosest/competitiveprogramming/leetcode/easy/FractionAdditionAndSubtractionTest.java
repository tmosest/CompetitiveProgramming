package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 592. Fraction Addition and Subtraction")
class FractionAdditionAndSubtractionTest {

  private FractionAdditionAndSubtraction fractionAdditionAndSubtraction = new FractionAdditionAndSubtraction();

  @Test
  void testCase0() {
    Assertions.assertEquals("0/1", fractionAdditionAndSubtraction.fractionAddition("-1/2+1/2"));
  }
}
