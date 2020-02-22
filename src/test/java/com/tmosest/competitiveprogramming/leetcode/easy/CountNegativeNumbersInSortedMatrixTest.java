package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1351. Count Negative Numbers in a Sorted Matrix")
class CountNegativeNumbersInSortedMatrixTest {

  private CountNegativeNumbersInSortedMatrix countNegativeNumbersInSortedMatrix = new CountNegativeNumbersInSortedMatrix();

  @Test
  void testCase0() {
    int[][] input = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
    Assertions.assertEquals(8, countNegativeNumbersInSortedMatrix.countNegatives(input));
  }
}
