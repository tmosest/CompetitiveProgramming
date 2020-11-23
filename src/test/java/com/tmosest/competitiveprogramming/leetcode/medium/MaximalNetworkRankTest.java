package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc210")
@Tag("matrix")
@DisplayName("LeetCode: 1615. Maximal Network Rank")
class MaximalNetworkRankTest {

  private MaximalNetworkRank maximalNetworkRank = new MaximalNetworkRank();

  private void test(int output, int size, int[][] roads) {
    Assertions.assertEquals(output, maximalNetworkRank.maximalNetworkRank(size, roads));
  }

  @Test
  void test1() {
    test(4, 4, new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}});
  }
}
