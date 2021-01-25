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
@Tag("number")
@Tag("advent2020")
@DisplayName("LeetCode: Day 11. Seating System")
class SeatingSystemTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_11_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_11.getPath();

  private SeatingSystem seatingSystem;

  @BeforeEach
  void setup() {
    seatingSystem = new SeatingSystem();
  }

  private void test(int output, List<String> lines) {
    Assertions.assertEquals(output, seatingSystem.getOccupiedSeatsAfterSettles(lines));
  }

  @Test
  void test0_getOccupiedSeatsAfterSettles_sampleSuccess() throws IOException {
    SeatingSystem.ADJACENT_DISTANCE = 1;
    SeatingSystem.THRESHOLD = 4;
    test(37, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_getOccupiedSeatsAfterSettles_realSuccess() throws IOException {
    SeatingSystem.ADJACENT_DISTANCE = 1;
    SeatingSystem.THRESHOLD = 4;
    test(2319, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test1_getOccupiedSeatsAfterSettles_sampleSuccess() throws IOException {
    SeatingSystem.ADJACENT_DISTANCE = Integer.MAX_VALUE;
    SeatingSystem.THRESHOLD = 5;
    test(26, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_getOccupiedSeatsAfterSettles_realSuccess() throws IOException {
    SeatingSystem.ADJACENT_DISTANCE = Integer.MAX_VALUE;
    SeatingSystem.THRESHOLD = 5;
    test(2117, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
