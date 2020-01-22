package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1189. Maximum Number of Balloons")
class MaximumNumberOfBalloonsTest {

  private MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();

  @Test
  void testCase0() {
    Assertions.assertEquals(1, maximumNumberOfBalloons.maxNumberOfBalloons("nlaebolko"));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(2, maximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon"));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(0, maximumNumberOfBalloons.maxNumberOfBalloons("leetcode"));
  }
}
