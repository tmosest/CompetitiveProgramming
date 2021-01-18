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
@DisplayName("LeetCode: Day 2. Password Philosophy")
class PasswordPhilosophyTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_2_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_2.getPath();
  private PasswordPhilosophy passwordPhilosophy;

  @BeforeEach
  void setup() {
    passwordPhilosophy = new PasswordPhilosophy();
  }

  private void test(int output, List<String> inputs) {
    Assertions.assertEquals(output, passwordPhilosophy.findValidPasswords(inputs));
  }

  private void test2(int output, List<String> inputs) {
    Assertions.assertEquals(output, passwordPhilosophy.findValidPasswords2(inputs));
  }

  // Part 1

  @Test
  void test0() throws IOException {
    test(2, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1() throws IOException {
    test(538, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  // Part 2

  @Test
  void test2() throws IOException {
    test2(1, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  // 422 with bug
  @Test
  void test3() throws IOException {
    test2(489, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
