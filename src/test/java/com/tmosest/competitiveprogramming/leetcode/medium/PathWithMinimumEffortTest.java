package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc212")
@Tag("graph")
@DisplayName("LeetCode: 1631. Path With Minimum Effort")
class PathWithMinimumEffortTest {

  @Test
  void test1() {
    Assertions.assertEquals(2, new PathWithMinimumEffort().minimumEffortPath(
        new int[][] {{1,2,2}, {3,8,2}, {5,3,5}}
    ));
  }
}
