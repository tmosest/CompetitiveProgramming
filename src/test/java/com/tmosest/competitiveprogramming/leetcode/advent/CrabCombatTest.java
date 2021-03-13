package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2020TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("string")
@Tag("advent2020")
@DisplayName("LeetCode: Day 22. Crab Combat")
class CrabCombatTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_22_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_22.getPath();

  private CrabCombat crabCombat;

  @BeforeEach
  void setup() {
    crabCombat = new CrabCombat();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, crabCombat.scoreCrabCombatGame(input));
  }

  @Test
  void test0_scoreCrabCombatGame_sampleSuccess() throws IOException {
    test(306, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_scoreCrabCombatGame_realSuccess() throws IOException {
    test(32598, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
