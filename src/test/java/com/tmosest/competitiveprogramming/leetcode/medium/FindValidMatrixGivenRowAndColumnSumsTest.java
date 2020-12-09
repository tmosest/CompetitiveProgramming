package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc36")
@DisplayName("LeetCode: 1605. Find Valid Matrix Given Row and Column Sums")
class FindValidMatrixGivenRowAndColumnSumsTest {

  private FindValidMatrixGivenRowAndColumnSums findValidMatrixGivenRowAndColumnSums
      = new FindValidMatrixGivenRowAndColumnSums();

  @BeforeEach
  void setup() {

  }

  @Test
  void test1() {
    Assertions.assertEquals(2, findValidMatrixGivenRowAndColumnSums.restoreMatrix(
        new int[] {3,8},
        new int[] {4,7}).length);
  }
}
