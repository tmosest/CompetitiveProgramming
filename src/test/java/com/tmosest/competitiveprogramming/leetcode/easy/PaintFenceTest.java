package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("dynamic")
@DisplayName("LeetCode: 276. Paint Fence")
class PaintFenceTest {
	/* Write code here. */

  PaintFence paintFence = new PaintFence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(6, paintFence.numWays(3,2));
  }


}
