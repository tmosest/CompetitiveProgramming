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
@DisplayName("LeetCode: Day 20. Allergen Assessment")
class AllergenAssessmentTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_21_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_21.getPath();

  private AllergenAssessment allergenAssessment;

  @BeforeEach
  void setup() {
    allergenAssessment = new AllergenAssessment();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, allergenAssessment.countNonAllergenWords(input));
  }

  private void test2(String output, List<String> input) {
    Assertions.assertEquals(output, allergenAssessment.getCanonicalAllergenString(input));
  }

  @Test
  void test0_countNonAllergenWords_sampleSuccess() throws IOException {
    test(5, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_countNonAllergenWords_realSuccess() throws IOException {
    test(2315, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }

  @Test
  void test1_countNonAllergenWords_sampleSuccess() throws IOException {
    test2("mxmxvkd,sqjhc,fvjkl", FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test1_countNonAllergenWords_realSuccess() throws IOException {
    test2("cfzdnz,htxsjf,ttbrlvd,bbbl,lmds,cbmjz,cmbcm,dvnbh", FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
