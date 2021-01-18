package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2020TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("string")
@Tag("advent2020")
@DisplayName("LeetCode: Day 4. Passport Processing")
class PassportProcessingTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_4_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_4.getPath();
  private static final String[] REQUIRED_KEYS = new String[]{"byr", "iyr", "eyr", "hgt", "hcl",
      "ecl", "pid"};
  private static final Map<String, Predicate<String>> VALIDATION_RULES = new HashMap<>();

  static {
    VALIDATION_RULES.put("byr", (String s) -> Pattern.matches("(19[^01]\\d)|(200[0-2])", s));
    VALIDATION_RULES.put("iyr", (String s) -> Pattern.matches("20(1\\d|20)", s));
    VALIDATION_RULES.put("eyr", (String s) -> Pattern.matches("20((2\\d)|30)", s));
    VALIDATION_RULES.put("hgt", (String s) -> Pattern.matches("(((1([5-8]\\d)|(19[0-3]))cm)|((59|6\\d|7[0-6])in))", s));
    VALIDATION_RULES.put("hcl", (String s) -> Pattern.matches("#[a-f\\d]{6}", s));
    VALIDATION_RULES.put("ecl", (String s) -> Pattern.matches("(amb|blu|brn|gry|grn|hzl|oth)", s));
    VALIDATION_RULES.put("pid", (String s) -> Pattern.matches("\\d{9}", s));
  }


  private PassportProcessing passportProcessing;

  void setup() {
    passportProcessing = new PassportProcessing(REQUIRED_KEYS, new HashMap<>());
  }

  void setup2() {
    passportProcessing = new PassportProcessing(REQUIRED_KEYS, VALIDATION_RULES);
  }

  private void test(long output, List<String> inputs) {
    setup();
    Assertions.assertEquals(output, passportProcessing.validPassport(inputs));
  }

  private void test2(long output, List<String> inputs) {
    setup2();
    Assertions.assertEquals(output, passportProcessing.validPassport(inputs));
  }

  @Test
  void test0() throws IOException {
    test(2, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1() throws IOException {
    test(260, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  // part 2
  @Test
  void test3() throws IOException {
    test2(2, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  // 116 was wrong but is the answer to someone else...
  // 154 was too high
  @Test
  void test4() throws IOException {
    test2(153, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
