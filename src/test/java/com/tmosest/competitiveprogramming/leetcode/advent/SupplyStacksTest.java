package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2022TestPathsEnum;
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
@Tag("array")
@Tag("advent2022")
@DisplayName("LeetCode: 5. Supply Stacks")
class SupplyStacksTest {

  private static final String SAMPLE_TEST_PATH = Advent2022TestPathsEnum.DAY_5_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2022TestPathsEnum.DAY_5.getPath();
  private SupplyStacks supplyStacks;

  @BeforeEach
  void setup() {
    supplyStacks = new SupplyStacks();
  }

  private void test(String output, List<String> data) {
    Assertions.assertEquals(output, supplyStacks.getStackTop(data, false));
  }

  private void test2(String output, List<String> data) {
    Assertions.assertEquals(output, supplyStacks.getStackTop(data, true));
  }

  @Test
  void part1_sampleTest() throws IOException {
    test("CMZ", FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void part1_realTest() throws IOException {
    test("TPGVQPFDH", FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void part2_sampleTest() throws IOException {
    test2("MCD", FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void part2_realTest() throws IOException {
    test2("DMRDFRHHH", FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
