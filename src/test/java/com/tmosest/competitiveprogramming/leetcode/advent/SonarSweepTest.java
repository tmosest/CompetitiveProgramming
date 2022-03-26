package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2021TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("array")
@Tag("advent2021")
@DisplayName("LeetCode: Day 1. Sonar Sweep")
class SonarSweepTest {

  private static final String SAMPLE_TEST_PATH = Advent2021TestPathsEnum.DAY_1_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2021TestPathsEnum.DAY_1.getPath();

  private SonarSweep sonarSweep;

  @BeforeEach
  void setup() {
    sonarSweep = new SonarSweep();
  }

  private void test(int output, List<Integer> input) {
    Assertions.assertEquals(output, sonarSweep.countIncreases(input));
  }

  private void test2(int output, List<Integer> input) {
    Assertions.assertEquals(output, sonarSweep.countIncreasesInWindows(input));
  }

  @Test
  void part1_sampleTest() throws IOException {
    test(7, Arrays.stream(FileReader.INSTANCE.readInts(SAMPLE_TEST_PATH)).boxed().collect(
        Collectors.toList()));
  }

  @Test
  void part1_realTest() throws IOException {
    test(1167, Arrays.stream(FileReader.INSTANCE.readInts(REAL_TEST_PATH)).boxed().collect(
        Collectors.toList()));
  }

  @Test
  void part2_sampleTest() throws IOException {
    test2(5, Arrays.stream(FileReader.INSTANCE.readInts(SAMPLE_TEST_PATH)).boxed().collect(
        Collectors.toList()));
  }

  @Test
  void part2_realTest() throws IOException {
    test2(1130, Arrays.stream(FileReader.INSTANCE.readInts(REAL_TEST_PATH)).boxed().collect(
        Collectors.toList()));
  }
}
