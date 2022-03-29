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
@DisplayName("LeetCode: Day 5. Hydrothermal Venture")
class HydrothermalVentureTest {

  private static final String SAMPLE_TEST_PATH = Advent2021TestPathsEnum.DAY_5_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2021TestPathsEnum.DAY_5.getPath();

  private HydrothermalVenture hydrothermalVenture;

  @BeforeEach
  void setup() {
    hydrothermalVenture = new HydrothermalVenture();
  }

  private void test(int output, List<String> input) {
    Assertions.assertEquals(output, hydrothermalVenture.countVentOverlaps(input, false));
  }

  private void test2(int output, List<String> input) {
    Assertions.assertEquals(output, hydrothermalVenture.countVentOverlaps(input, true));
  }

  @Test
  void partOne_sample_success() throws IOException {
    test(5, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void partOne_real_success() throws IOException {
    test(5835, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void partTwo_sample_success() throws IOException {
    test2(12, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void partTwo_real_success() throws IOException {
    test2(17013, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
