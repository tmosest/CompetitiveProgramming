package com.tmosest.competitiveprogramming.leetcode.advent;

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
    test(2, FileReader.INSTANCE.readLines("advent_2020_day2_sample.txt"));
  }

  @Test
  void test1() throws IOException {
    test(538, FileReader.INSTANCE.readLines("advent_2020_day2.txt"));
  }

  // Part 2

  @Test
  void test2() throws IOException {
    test2(1, FileReader.INSTANCE.readLines("advent_2020_day2_sample.txt"));
  }

  // 422 with bug
  @Test
  void test3() throws IOException {
    test2(489, FileReader.INSTANCE.readLines("advent_2020_day2.txt"));
  }
}
