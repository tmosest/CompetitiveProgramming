package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc208")
@DisplayName("LeetCode: 1594. Maximum Non Negative Product in a Matrix")
class MaximumNonNegativeProductInMatrixTest {

  private MaximumNonNegativeProductInMatrix maximumNonNegativeProductInMatrix =
      new MaximumNonNegativeProductInMatrix();

  @Test
  void test1() {
    Assertions.assertEquals(-1,
        maximumNonNegativeProductInMatrix
            .maxProductPath(new int[][]{{-1, -2, -3}, {-2, -3, -3}, {-3, -3, -2}}));
  }
}
