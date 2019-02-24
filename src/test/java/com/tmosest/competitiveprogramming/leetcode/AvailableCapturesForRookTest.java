package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 999. Available Captures for Rook")
public class AvailableCapturesForRookTest {

  AvailableCapturesForRook availableCapturesForRook = new AvailableCapturesForRook();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[][] board = {
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','p','.','.','.','.'},
      {'.','.','.','R','.','.','.','p'},
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','p','.','.','.','.'},
      {'.','.','.','.','.','.','.','.'},
      {'.','.','.','.','.','.','.','.'}
    };
    Assertions.assertEquals(3, availableCapturesForRook.numRookCaptures(board));
  }
}
