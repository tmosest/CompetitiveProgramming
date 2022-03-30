package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2021TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import java.util.Arrays;
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
@DisplayName("LeetCode: Day 7. The Treachery of Whales")
class TheTreacheryOfWhalesTest {

  private static final String SAMPLE_TEST_PATH = Advent2021TestPathsEnum.DAY_7_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2021TestPathsEnum.DAY_7.getPath();

  private TheTreacheryOfWhales theTreacheryOfWhales;

  @BeforeEach
  void setup() {
    theTreacheryOfWhales = new TheTreacheryOfWhales();
  }

  private void test(int output, List<String> input) {
    int[] inputs = Arrays.stream(input.get(0).split(",")).mapToInt(Integer::parseInt).toArray();
    Assertions.assertEquals(output, theTreacheryOfWhales.getFuelCount(inputs, false));
  }

  private void test2(int output, List<String> input) {
    int[] inputs = Arrays.stream(input.get(0).split(",")).mapToInt(Integer::parseInt).toArray();
    Assertions.assertEquals(output, theTreacheryOfWhales.getFuelCount(inputs, true));
  }

  @Test
  void part1_sample_success() throws IOException {
    test(37, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void part1_real_success() throws IOException {
    test(344605, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void part2_sample_success() throws IOException {
    test2(168, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void part2_real_success() throws IOException {
    test2(93699985, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
