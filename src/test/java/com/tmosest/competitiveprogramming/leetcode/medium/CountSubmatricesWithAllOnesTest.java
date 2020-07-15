package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc196")
@DisplayName("LeetCode: 1504. Count Submatrices With All Ones")
class CountSubmatricesWithAllOnesTest {

  private CountSubmatricesWithAllOnes countSubmatricesWithAllOnes = new CountSubmatricesWithAllOnes();

  @Test
  void testCase0() {
    Assertions.assertEquals(13, countSubmatricesWithAllOnes.numSubmat(new int[][]{
        {1, 0, 1},
        {1, 1, 0},
        {1, 1, 0}
    }));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(24, countSubmatricesWithAllOnes.numSubmat(new int[][]{
        {0, 1, 1, 0},
        {0, 1, 1, 1},
        {1, 1, 1, 0}
    }));
  }
}
