package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("gameTheory")
@Tag("wc200")
@Tag("array")
@DisplayName("LeetCode: 1535. Find the Winner of an Array Game")
class FindTheWinnerOfAnArrayGameTest {

  private FindTheWinnerOfAnArrayGame findTheWinnerOfAnArrayGame =
      new FindTheWinnerOfAnArrayGame();

  @Test
  void testCase0() {
    Assertions.assertEquals(5, findTheWinnerOfAnArrayGame.getWinner(
        new int[] {2,1,3,5,4,6,7}, 2
    ));
  }
}
