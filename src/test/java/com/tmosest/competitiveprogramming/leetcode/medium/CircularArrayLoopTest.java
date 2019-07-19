package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 457. Circular Array Loop")
class CircularArrayLoopTest {

  private CircularArrayLoop circularArrayLoop = new CircularArrayLoop();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2,-1,1,2,2
    };
    Assertions.assertTrue(circularArrayLoop.circularArrayLoop(input));
  }
}
