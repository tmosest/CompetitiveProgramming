package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2021TestPathsEnum;
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
@Tag("array")
@Tag("advent2021")
@DisplayName("LeetCode: Day 4. Giant Squid")
class GiantSquidTest {

  private static final String SAMPLE = Advent2021TestPathsEnum.DAY_4_SAMPLE.getPath();
  private static final String REAL = Advent2021TestPathsEnum.DAY_4.getPath();

  private GiantSquid giantSquid;

  @BeforeEach
  void setup() {
    giantSquid = new GiantSquid();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, giantSquid.calculateBingoScore(input, false));
  }

  private void test2(long output, List<String> input) {
    Assertions.assertEquals(output, giantSquid.calculateBingoScore(input, true));
  }

  @Test
  void calculateBingoScore_part1Sample_success() throws IOException {
    test(4512, FileReader.INSTANCE.readLines(SAMPLE));
  }

  @Test
  void calculateBingoScore_part1Real_success() throws IOException {
    test(28082, FileReader.INSTANCE.readLines(REAL));
  }

  @Test
  void calculateBingoScore_part2Sample_success() throws IOException {
    test2(1924, FileReader.INSTANCE.readLines(SAMPLE));
  }

  @Test
  void calculateBingoScore_part2Real_success() throws IOException {
    test2(8224, FileReader.INSTANCE.readLines(REAL));
  }
}
