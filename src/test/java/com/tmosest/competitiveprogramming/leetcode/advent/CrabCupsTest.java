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
  private static final int MOVES_2 = 10000000;

  private CrabCups crabCups;

  @BeforeEach
  void setup() {
    crabCups = new CrabCups();
  }

  private void test(String output, String input, int move) {
    Assertions.assertEquals(output, crabCups.crabCupsConfigClockwiseFromOneCup(input, move));
  }

  private void test2(long output, String input, int move) {
    Assertions.assertEquals(output, crabCups.multTwoCupsAfterCupMarkedOne(input, move));
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

  /*
  @Test
  void test2_crabCupsConfigClockwiseFromOneCup_sampleSuccess() {
    test2(149245887792L, "389125467", MOVES_2);
  }

  @Test
  void test2_crabCupsConfigClockwiseFromOneCup_realSuccess() {
    test2(149245887792L, "327465189", MOVES_2);
  }
  */
}
