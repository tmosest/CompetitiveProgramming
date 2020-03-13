package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 52. N-Queens II")
class NqueensTwoTest {

  private NqueensTwo nqueensTwo = new NqueensTwo();

  @Test
  void testCase0() {
    Assertions.assertEquals(2, nqueensTwo.totalNQueens(4));
  }
}
