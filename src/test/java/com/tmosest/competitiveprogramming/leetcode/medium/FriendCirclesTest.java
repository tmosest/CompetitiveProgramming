package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 547. Friend Circles")
class FriendCirclesTest {

  private FriendCircles friendCircles = new FriendCircles();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1,1,0},
        {1,1,0},
        {0,0,1}
    };
    Assertions.assertEquals(2, friendCircles.findCircleNum(input));
  }
}
