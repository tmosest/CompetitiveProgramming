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
@DisplayName("LeetCode: Day 6. Custom Customs")
class CustomCustomsTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_6_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_6.getPath();

  private CustomCustoms customCustoms;

  @BeforeEach
  void setup() {
    customCustoms = new CustomCustoms();
  }

  private void test(long output, List<String> fileLines) {
    Assertions.assertEquals(output, customCustoms.sumYesAnswersForAllGroups(fileLines));
  }

  private void test2(long output, List<String> fileLines) {
    Assertions.assertEquals(output, customCustoms.sumYesAnswersForEveryoneInGroups(fileLines));
  }

  @Test
  void test1_sample_success() throws IOException {
    test(11, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_real_success() throws IOException {
    test(6504, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test2_sample_success() throws IOException {
    test2(6, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test2_real_success() throws IOException {
    test2(3351, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
