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
@DisplayName("LeetCode: Day 8. Handheld Halting")
class HandheldHaltingTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_8_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_8.getPath();

  private HandheldHalting handheldHalting;

  @BeforeEach
  void setup() {
    handheldHalting = new HandheldHalting();
  }

  private void test(long output, List<String> fileLines) {
    Assertions.assertEquals(output, handheldHalting.getAccumulatorBeforeLoop(fileLines));
  }

  private void test2(long output, List<String> fileLines) {
    Assertions.assertEquals(output, handheldHalting.getAccumulatorAfterTermination(fileLines));
  }

  @Test
  void test1_getAccumulatorBeforeLoop_sampleSuccess() throws IOException {
    test(5, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_getAccumulatorBeforeLoop_realSuccess() throws IOException {
    test(1489, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test2_getAccumulatorBeforeLoop_sampleSuccess() throws IOException {
    test2(8, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test2_getAccumulatorBeforeLoop_realSuccess() throws IOException {
    test2(1539, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
