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
@DisplayName("LeetCode: Day 2. Dive")
class DiveTest {

  private static final String SAMPLE_TEST_PATH = Advent2021TestPathsEnum.DAY_2_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2021TestPathsEnum.DAY_2.getPath();

  private Dive dive;

  @BeforeEach
  void setup() {
    dive = new Dive();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, dive.multiplyPosition(input, false));
  }

  private void test2(long output, List<String> input) {
    Assertions.assertEquals(output, dive.multiplyPosition(input, true));
  }

  @Test
  void multiplyPosition_sample_150() throws IOException {
    test(150, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void multiplyPosition_real_1690020() throws IOException {
    test(1690020, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void multiplyPositionWithAim_sample_900() throws IOException {
    test2(900, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void multiplyPositionWithAim_real_150() throws IOException {
    test2(1408487760L, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
