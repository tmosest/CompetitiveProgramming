package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 640. Solve the Equation")
class SolveTheEquationTest {

  private SolveTheEquation solveTheEquation = new SolveTheEquation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("left=2", solveTheEquation.solveEquation("left+5-3+left=6+left-2"));
  }
}
