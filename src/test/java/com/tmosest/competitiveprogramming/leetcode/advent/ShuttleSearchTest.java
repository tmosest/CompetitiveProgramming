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
@DisplayName("LeetCode: Day 13. Shuttle Search")
class ShuttleSearchTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_13_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_13.getPath();

  private ShuttleSearch shuttleSearch;

  @BeforeEach
  void setup() {
    shuttleSearch = new ShuttleSearch();
  }

  private void test(long output, List<String> lines) {
    Assertions.assertEquals(output, shuttleSearch.getDiffTimesBusId(lines));
  }

  @Test
  void test0_getDiffTimesBusId_sampleSuccess() throws IOException {
    test(295, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_getDiffTimesBusId_realSuccess() throws IOException {
    test(3606, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
