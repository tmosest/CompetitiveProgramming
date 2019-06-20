package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 694. Number of Distinct Islands")
class NumberOfDistinctIslandsTest {

  private NumberOfDistinctIslands numberOfDistinctIslands = new NumberOfDistinctIslands();

  private void test(String input, int output) {
    String[] lines = input.split("\n");
    int[][] matrix = new int[lines.length][lines[0].length()];
    for (int i = 0; i < matrix.length; i++) {
      String row = lines[i];
      for (int j = 0; j < row.length(); j++) {
        matrix[i][j] = (int) row.charAt(j) - '0';
      }
    }
    Assertions.assertEquals(output, numberOfDistinctIslands.numDistinctIslands(matrix));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String input = "11000\n"
        + "11000\n"
        + "00011\n"
        + "00011";
    int output = 1;
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String input = "11011\n"
        + "10000\n"
        + "00001\n"
        + "11011";
    int output = 3;
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    test("011\n101\n110", 2);
  }
}
