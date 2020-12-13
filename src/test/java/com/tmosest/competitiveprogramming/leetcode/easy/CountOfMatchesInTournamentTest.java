package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc219")
@DisplayName("LeetCode: 1688. Count of Matches in Tournament")
class CountOfMatchesInTournamentTest {

  private CountOfMatchesInTournament countOfMatchesInTournament;

  @BeforeEach
  void setup() {
    countOfMatchesInTournament = new CountOfMatchesInTournament();
  }

  private void test(int output, int players) {
    Assertions.assertEquals(output, countOfMatchesInTournament.numberOfMatches(players));
  }

  @Test
  void test0() {
    test(6, 7);
  }

  @Test
  void test1() {
    test(13, 14);
  }
}
