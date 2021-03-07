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
@DisplayName("LeetCode: Day 20. Jurassic Jigsaw")
class JurassicJigsawTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_20_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_20.getPath();

  private JurassicJigsaw jurassicJigsaw;

  @BeforeEach
  void setup() {
    jurassicJigsaw = new JurassicJigsaw();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, jurassicJigsaw.matchPuzzleAndMultiplyCorners(input));
  }

  private void test2(long output, List<String> input) {
    Assertions.assertEquals(output, jurassicJigsaw.countRoughWaters(input));
  }

  @Test
  void test0_matchPuzzleAndMultiplyCorners_sampleSuccess() throws IOException {
    test(20899048083289L, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_matchPuzzleAndMultiplyCorners_realSuccess() throws IOException {
    test(14986175499719L, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test1_countRoughWaters_sampleSuccess() throws IOException {
    test2(0, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_countRoughWaters_realSuccess() throws IOException {
    test2(0, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
