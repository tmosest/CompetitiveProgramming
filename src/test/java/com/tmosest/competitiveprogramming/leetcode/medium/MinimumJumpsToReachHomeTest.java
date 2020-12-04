package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("bwc39")
@DisplayName("LeetCode: 1654. Minimum Jumps to Reach Home")
class MinimumJumpsToReachHomeTest {

  private MinimumJumpsToReachHome minimumJumpsToReachHome = new MinimumJumpsToReachHome();

  @Test
  void test1() {
    Assertions.assertEquals(3, minimumJumpsToReachHome.minimumJumps(
        new int[] {14,4,18,1,15},
        3,
        15,
        9
    ));
  }
}
