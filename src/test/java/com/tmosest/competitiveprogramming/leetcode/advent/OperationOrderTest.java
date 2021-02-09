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
@DisplayName("LeetCode: Day 18. Operation Order")
class OperationOrderTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_18_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_18.getPath();

  private OperationOrder operationOrder;

  @BeforeEach
  void setup() {
    operationOrder = new OperationOrder();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, operationOrder.sumLines(input));
  }

  private void test2(long output, List<String> input) {
    Assertions.assertEquals(output, operationOrder.sumLinesWithAddition(input));
  }

  @Test
  void test0_sumLines_sampleSuccess() throws IOException {
    test(122, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  /*
  @Test
  void test0_sumLines_realSuccess() throws IOException {
    test(6923486965641L, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test1_sumLines_sampleSuccess() throws IOException {
    test2(282, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_sumLines_realSuccess() throws IOException {
    test2(6923486965641L, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
  */
}
