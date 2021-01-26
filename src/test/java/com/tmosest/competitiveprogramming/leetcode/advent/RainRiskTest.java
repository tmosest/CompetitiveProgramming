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
@DisplayName("LeetCode: Day 12. Rain Risk")
class RainRiskTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_12_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_12.getPath();

  private RainRisk rainRisk;

  @BeforeEach
  void setup() {
    rainRisk = new RainRisk();
  }

  private void test(int output, List<String> lines) {
    Assertions.assertEquals(output, rainRisk.getManhattanDistance(lines));
  }

  private void test2(int output, List<String> lines) {
    Assertions.assertEquals(output, rainRisk.getManhattanDistanceWithWayPoint(lines));
  }

  @Test
  void test0_getManhattanDistance_sampleSuccess() throws IOException {
    test(25, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_getManhattanDistance_realSuccess() throws IOException {
    test(2270, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test1_getManhattanDistance_sampleSuccess() throws IOException {
    test2(286, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  // too low 101244
  @Test
  void test1_getManhattanDistance_realSuccess() throws IOException {
    test2(138669, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
