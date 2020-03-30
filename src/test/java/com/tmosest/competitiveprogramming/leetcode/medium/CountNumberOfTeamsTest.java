package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc182")
@DisplayName("LeetCode: 1395. Count Number of Teams")
class CountNumberOfTeamsTest {

  private CountNumberOfTeams countNumberOfTeams =
      new CountNumberOfTeams();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        3,
        countNumberOfTeams.numTeams(
            new int[]{2, 5, 3, 4, 1}
        )
    );
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(
        0,
        countNumberOfTeams.numTeams(
            new int[]{2, 1, 3}
        )
    );
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(
        4,
        countNumberOfTeams.numTeams(
            new int[]{1, 2, 3, 4}
        )
    );
  }
}
