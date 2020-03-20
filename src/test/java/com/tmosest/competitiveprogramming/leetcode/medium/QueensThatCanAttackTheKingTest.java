package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1222. Queens That Can Attack the King")
class QueensThatCanAttackTheKingTest {

  private QueensThatCanAttackTheKing queensThatCanAttackTheKing =
      new QueensThatCanAttackTheKing();

  @Test
  void testCase0() {
    int[][] queens = {{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}};
    int[] king = {0, 0};
    Integer[][] expected = {{1, 0}, {0, 1}, {3, 3}};
    Assertions.assertEquals(
        MatrixListAdapter.toList(expected),
        queensThatCanAttackTheKing.queensAttacktheKing(queens, king)
    );
  }
}
