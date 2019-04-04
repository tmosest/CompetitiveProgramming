package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 991. Broken Calculator")
public class BrokenCalculatorTest {

  BrokenCalculator brokenCalculator = new BrokenCalculator();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(2, brokenCalculator.brokenCalc(2, 3));
  }
}
