package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 486. Predict the Winner")
class PredictTheWinnerTest {

  private PredictTheWinner predictTheWinner = new PredictTheWinner();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 5, 2
    };
    Assertions.assertFalse(predictTheWinner.predictTheWinner(input));
  }
}
