package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1072. Flip Columns For Maximum Number of Equal Rows")
class FlipColumnsForMaximumNumberOfEqualRowsTest {

  private FlipColumnsForMaximumNumberOfEqualRows flipColumnsForMaximumNumberOfEqualRows = new FlipColumnsForMaximumNumberOfEqualRows();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0, 1},
        {1, 1}
    };
    Assertions.assertEquals(1, flipColumnsForMaximumNumberOfEqualRows.maxEqualRowsAfterFlips(input));
  }
}
