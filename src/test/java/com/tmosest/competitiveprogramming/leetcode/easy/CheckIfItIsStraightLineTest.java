package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1232. Check If It Is a Straight Line")
class CheckIfItIsStraightLineTest {

  private CheckIfItIsStraightLine checkIfItIsStraightLine = new CheckIfItIsStraightLine();

  @Test
  void checkStraightLine_givenStraightLine_returnsTrue() {
    int[][] coordinates =
        {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
    Assertions.assertTrue(checkIfItIsStraightLine.checkStraightLine(coordinates));
  }

  @Test
  void checkStraightLine_givenNonStraightLine_returnsFalse() {
    int[][] coordinates =
        {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
    Assertions.assertFalse(checkIfItIsStraightLine.checkStraightLine(coordinates));
  }
}
