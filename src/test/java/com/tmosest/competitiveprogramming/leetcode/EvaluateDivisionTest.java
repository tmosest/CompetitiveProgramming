package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("depthFirstSearch")
@DisplayName("LeetCode: 399. Evaluate Division")
public class EvaluateDivisionTest {

  EvaluateDivision evaluateDivision = new EvaluateDivision();

  @Test
  @DisplayName("Test Case 0")
  public void testCase0() {
    String[][] equations = {
        {"a", "b"},
        {"b", "c"}
    };
    double[] values = {2.0, 3.0};
    String[][] queries = {
        {"a", "c"},
        {"b", "a"},
        {"a", "e"},
        {"a", "a"},
        {"x", "x"}
    };
    double[] expected = {
        6.0, 0.5, -1.0, 1.0, -1.0
    };
    Assertions.assertArrayEquals(expected, evaluateDivision.calcEquation(equations, values, queries));
  }

  @Test
  @DisplayName("Test Case 1")
  public void testCase1() {
    String[][] equations = {
        {"a", "b"},
        {"c", "d"}
    };
    double[] values = {1.0, 1.0};
    String[][] queries = {
        {"a", "c"},
        {"b", "d"},
        {"b", "a"},
        {"d", "c"}
    };
    double[] expected = {
        -1.0,-1.0,1.0,1.0
    };
    Assertions.assertArrayEquals(expected, evaluateDivision.calcEquation(equations, values, queries));
  }
}
