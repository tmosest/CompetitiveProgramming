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
@DisplayName("LeetCode: Day 14. Docking Data")
class DockingDataTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_14_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_14.getPath();

  private DockingData dockingData;

  @BeforeEach
  void setup() {
    dockingData = new DockingData();
  }

  private void test(long output, List<String> lines) {
    Assertions.assertEquals(output, dockingData.sumValuesInMemoryFromBitMap(lines));
  }

  @Test
  void test0_sumValuesInMemoryFromBitMap_sampleSuccess() throws IOException {
    test(165, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_sumValuesInMemoryFromBitMap_realSuccess() throws IOException {
    test(6631883285184L, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
