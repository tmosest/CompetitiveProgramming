package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 682. Baseball Game")
class BaseballGameTest {
	/* Write code here. */

  BaseballGame baseballGame = new BaseballGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "5","2","C","D","+"
    };
    Assertions.assertEquals(30, baseballGame.calPoints(input));
  }


}
