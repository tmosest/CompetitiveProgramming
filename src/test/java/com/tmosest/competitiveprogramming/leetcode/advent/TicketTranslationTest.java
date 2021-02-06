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
@DisplayName("LeetCode: Day 16. Ticket Translation")
class TicketTranslationTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_16_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_16.getPath();

  private TicketTranslation ticketTranslation;

  @BeforeEach
  void setup() {
    ticketTranslation = new TicketTranslation();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, ticketTranslation.getErrorRate(input));
  }

  private void test2(long output, List<String> input) {
    Assertions.assertEquals(output, ticketTranslation.multiplyDepartures(input));
  }

  @Test
  void test0_getErrorRate_sampleSuccess() throws IOException {
    test(71, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_getErrorRate_realSuccess() throws IOException {
    test(21978, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test1_getErrorRate_sampleSuccess() throws IOException {
    test2(-1, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_getErrorRate_realSuccess() throws IOException {
    test2(1053686852011L, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
