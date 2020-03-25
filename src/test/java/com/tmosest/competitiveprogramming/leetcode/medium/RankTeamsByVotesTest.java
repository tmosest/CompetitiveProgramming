package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("map")
@DisplayName("LeetCode: 1366. Rank Teams by Votes")
class RankTeamsByVotesTest {

  private RankTeamsByVotes rankTeamsByVotes =
      new RankTeamsByVotes();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        "ACB",
        rankTeamsByVotes.rankTeams(
        new String[]{
            "ABC", "ACB", "ABC", "ACB", "ACB"
        })
    );
  }
}
