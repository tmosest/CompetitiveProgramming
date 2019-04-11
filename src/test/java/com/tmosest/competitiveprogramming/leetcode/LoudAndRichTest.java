package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 851. Loud and Rich")
public class LoudAndRichTest {

  LoudAndRich loudAndRich = new LoudAndRich();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] richer = {
        {1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}
    };
    int[] quiet = {
        3,2,5,4,6,1,7,0
    };
    int[] expected = {
        5,5,2,5,4,5,6,7
    };
    Assertions.assertArrayEquals(expected, loudAndRich.loudAndRich(richer, quiet));
  }
}
