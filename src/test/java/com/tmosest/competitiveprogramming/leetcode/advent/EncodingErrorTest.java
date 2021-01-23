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
@DisplayName("LeetCode: Day 9. Encoding Error")
class EncodingErrorTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_9_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_9.getPath();

  private EncodingError encodingError;

  @BeforeEach
  void setup() {
    encodingError = new EncodingError();
  }

  private void test(long output, List<Long> numbers) {
    Assertions.assertEquals(output, encodingError.firstInvalidNumber(numbers));
  }

  private void test2(long output, List<Long> numbers) {
    Assertions.assertEquals(output, encodingError.findSumOfInvalidNumbersContigousEnds(numbers));
  }

  @Test
  void test1_firstInvalidNumber_sampleSuccess() throws IOException {
    encodingError.PRE_AMBLE = 5;
    test(127, FileReader.INSTANCE.readLongs(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_firstInvalidNumber_realSuccess() throws IOException {
    encodingError.PRE_AMBLE = 25;
    test(105950735, FileReader.INSTANCE.readLongs(REAL_TEST_PATH));
  }

  @Test
  void test2_findSumOfInvalidNumbersContigousEnds_sampleSuccess() throws IOException {
    encodingError.PRE_AMBLE = 5;
    test2(62, FileReader.INSTANCE.readLongs(SAMPLE_TEST_PATH));
  }

  @Test
  void test2_findSumOfInvalidNumbersContigousEnds_realSuccess() throws IOException {
    encodingError.PRE_AMBLE = 25;
    test2(13826915, FileReader.INSTANCE.readLongs(REAL_TEST_PATH));
  }
}
