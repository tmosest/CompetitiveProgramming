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
@DisplayName("LeetCode: Day 3. Binary Diagnostic")
class BinaryDiagnosticTest {

  private static final String SAMPLE_TEST_PATH = Advent2021TestPathsEnum.DAY_3_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2021TestPathsEnum.DAY_3.getPath();

  private BinaryDiagnostic binaryDiagnostic;

  @BeforeEach
  void setup() {
    binaryDiagnostic = new BinaryDiagnostic();
  }

  private void test(int output, List<String> input) {
    Assertions.assertEquals(output, binaryDiagnostic.multiplicationFromBitCounting(input));
  }

  private void test2(int output, List<String> input) {
    Assertions.assertEquals(output, binaryDiagnostic.recursiveFilter(input));
  }

  @Test
  void part1_test_result() throws IOException {
    test(198, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void part1_real_result() throws IOException {
    test(3901196, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void part2_test_result() throws IOException {
    test2(230, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void part2_real_result() throws IOException {
    test2(4412188, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
