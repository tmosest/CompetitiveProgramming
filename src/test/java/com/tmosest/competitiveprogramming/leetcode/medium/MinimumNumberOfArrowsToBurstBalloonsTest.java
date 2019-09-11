package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 452. Minimum Number of Arrows to Burst Balloons")
class MinimumNumberOfArrowsToBurstBalloonsTest {

  private MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = 
        {{10,16}, {2,8}, {1,6}, {7,12}};
    Assertions.assertEquals(2, minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(input));
  }
}
