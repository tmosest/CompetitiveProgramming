package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2020TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
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
@DisplayName("LeetCode: Day 7. Handy Haversacks")
class HandyHaversacksTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_7_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_7.getPath();

  private HandyHaversacks handyHaversacks;

  @BeforeEach
  void setup() {
    handyHaversacks = new HandyHaversacks();
  }

  private void test(long output, List<String> fileLines) {
    Assertions
        .assertEquals(output, handyHaversacks.howManyBagsEventuallyContainGoldBags(fileLines));
  }

  private void test2(long output, List<String> fileLines) {
    Assertions
        .assertEquals(output, handyHaversacks.howManyBagsAreInAGoldBag(fileLines));
  }

  @Test
  void test1_howManyBagsEventuallyContainGoldBags_sampleSuccess() throws Exception {
    test(4, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_howManyBagsEventuallyContainGoldBags_realSuccess() throws Exception {
    test(335, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test2_howManyBagsAreInAGoldBag_sampleSuccess() throws Exception {
    test2(32, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test2_howManyBagsAreInAGoldBag_realSuccess() throws Exception {
    test2(2431, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
