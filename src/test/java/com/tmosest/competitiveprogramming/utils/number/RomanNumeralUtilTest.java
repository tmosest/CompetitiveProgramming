package com.tmosest.competitiveprogramming.utils.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Util")
@DisplayName("Roman Numeral Util Test")
class RomanNumeralUtilTest {

  private RomanNumeralUtil romanNumeralUtil = RomanNumeralUtil.instance();

  @Test
  @DisplayName("I should return 1")
  void test_one() {
    Assertions.assertEquals(1, romanNumeralUtil.fromRoman("I"));
  }

  @Test
  @DisplayName("II should return 2")
  void test_two() {
    Assertions.assertEquals(2, romanNumeralUtil.fromRoman("II"));
  }

  @Test
  @DisplayName("V should return 5")
  void test_five() {
    Assertions.assertEquals(5, romanNumeralUtil.fromRoman("V"));
  }

  @Test
  @DisplayName("IV should return 4")
  void test_four() {
    Assertions.assertEquals(4, romanNumeralUtil.fromRoman("IV"));
  }

  @Test
  @DisplayName("IX should return 9")
  void test_nine() {
    Assertions.assertEquals(9, romanNumeralUtil.fromRoman("IX"));
  }

  @Test
  @DisplayName("X should return 10")
  void test_ten() {
    Assertions.assertEquals(10, romanNumeralUtil.fromRoman("X"));
  }

  @Test
  @DisplayName("XXII should return 22")
  void test_twenty_two() {
    Assertions.assertEquals(22, romanNumeralUtil.fromRoman("XXII"));
  }

  @Test
  @DisplayName("II is a roman numeral")
  void test_two_is_roman() {
    Assertions.assertTrue(romanNumeralUtil.isRoman("II"));
  }
}
