package com.tmosest.competitiveprogramming.leetcode.advent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("string")
@Tag("advent2020")
@DisplayName("LeetCode: Day 23. Crab Cups")
class CrabCupsTest {

  private static final int MOVES = 100;

  private CrabCups crabCups;

  @BeforeEach
  void setup() {
    crabCups = new CrabCups();
  }

  private void test(String output, String input, int move) {
    Assertions.assertEquals(output, crabCups.crabCupsConfigClockwiseFromOneCup(input, move));
  }

  @Test
  void test0_crabCupsConfigClockwiseFromOneCup_simpleSampleSuccess() {
    test("92658374", "389125467", 10);
  }

  @Test
  void test0_crabCupsConfigClockwiseFromOneCup_sampleSuccess() {
    test("67384529", "389125467", MOVES);
  }

  @Test
  void test0_crabCupsConfigClockwiseFromOneCup_realSuccess() {
    test("82934675", "327465189", MOVES);
  }
}
