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
    Assertions.assertEquals("x=2", solveTheEquation.solveEquation("x+5-3+x=6+x-2"));
  }
}
