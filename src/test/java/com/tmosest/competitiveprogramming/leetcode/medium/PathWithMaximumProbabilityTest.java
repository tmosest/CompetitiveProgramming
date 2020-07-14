package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc197")
@DisplayName("LeetCode: 1514. Path with Maximum Probability")
class PathWithMaximumProbabilityTest {

  private PathWithMaximumProbability pathWithMaximumProbability = new PathWithMaximumProbability();

  @Test
  void testCase0() {
    double res = pathWithMaximumProbability.maxProbability(
        3,
        new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2);
    Assertions.assertTrue(0.2490 <= res && res <= 0.25050);
  }
}
