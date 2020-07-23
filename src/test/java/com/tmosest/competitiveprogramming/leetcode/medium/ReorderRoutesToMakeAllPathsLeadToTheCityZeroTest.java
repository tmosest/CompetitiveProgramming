package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc191")
@DisplayName("LeetCode: 1466. Reorder Routes to Make All Paths Lead to the City Zero")
class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

  private ReorderRoutesToMakeAllPathsLeadToTheCityZero reorderRoutesToMakeAllPathsLeadToTheCityZero =
      new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

  private void test(int num, int[][] edges, int out) {
    Assertions
        .assertEquals(out, reorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(num, edges));
  }

  @Test
  void testCase0() {
    test(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}, 3);
  }
}
