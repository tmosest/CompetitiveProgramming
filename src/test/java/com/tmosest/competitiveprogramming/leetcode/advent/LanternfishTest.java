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
@DisplayName("LeetCode: Day 6. Lanternfish")
class LanternfishTest {

  private static final String SAMPLE_TEST_PATH = Advent2021TestPathsEnum.DAY_6_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2021TestPathsEnum.DAY_6.getPath();

  private Lanternfish lanternfish;

  @BeforeEach
  void setup() {
    lanternfish = new Lanternfish();
  }

  private void test(long output, List<String> input, int days) {
    Assertions.assertEquals(output, lanternfish.countFish(input, days));
  }

  @Test
  void part1_smallSample_success() throws IOException {
    test(26, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH), 18);
  }

  @Test
  void part1_sample_success() throws IOException {
    test(5934, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH), 80);
  }

  @Test
  void part1_real_success() throws IOException {
    test(349549, FileReader.INSTANCE.readLines(REAL_TEST_PATH), 80);
  }

  /*
  @Test
  void part2_sample_success() throws IOException {
    test(26984457539L, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH), 256);
  }

  @Test
  void part2_real_success() throws IOException {
    test(349549, FileReader.INSTANCE.readLines(REAL_TEST_PATH), 256);
  }
  */
}
