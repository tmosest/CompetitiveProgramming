package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2020TestPathsEnum;
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
@Tag("number")
@Tag("advent2020")
@DisplayName("LeetCode: Day 10. Adapter Array")
class AdapterArrayTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_10_SAMPLE.getPath();
  private static final String SAMPLE_SMALL_TEST_PATH = Advent2020TestPathsEnum.DAY_10_SAMPLE_SMALL.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_10.getPath();

  private AdapterArray adapterArray;

  @BeforeEach
  void setup() {
    adapterArray = new AdapterArray();
  }

  private void test(long output, int[] arr) {
    Assertions.assertEquals(output, adapterArray.getMultOfOneCellGapsAndThreeCellGaps(
        Arrays.stream(arr).boxed().collect(Collectors.toList())
    ));
  }

  private void test2(long output, int[] arr) {
    Assertions.assertEquals(output, adapterArray.getValidChainsCount(
        Arrays.stream(arr).boxed().collect(Collectors.toList())
    ));
  }

  @Test
  void test1_getCellPhoneAdapterValue_smallSampleSuccess() throws IOException {
    Assertions.assertEquals(22, adapterArray.getCellPhoneAdapterValue(
        Arrays.stream(FileReader.INSTANCE.readInts(SAMPLE_SMALL_TEST_PATH)).boxed().collect(
            Collectors.toList())
    ));
  }

  @Test
  void test1_getMultOfOneCellGapsAndThreeCellGaps_sampleSuccess() throws IOException {
    test(220, FileReader.INSTANCE.readInts(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_getMultOfOneCellGapsAndThreeCellGaps_realSuccess() throws IOException {
    test(2272, FileReader.INSTANCE.readInts(REAL_TEST_PATH));
  }

  @Test
  void test2_getValidChainsCount_sampleSuccess() throws IOException {
    test2(19208, FileReader.INSTANCE.readInts(SAMPLE_TEST_PATH));
  }

  @Test
  void test2_getValidChainsCount_realSuccess() throws IOException {
    test2(84627647627264L, FileReader.INSTANCE.readInts(REAL_TEST_PATH));
  }
}
