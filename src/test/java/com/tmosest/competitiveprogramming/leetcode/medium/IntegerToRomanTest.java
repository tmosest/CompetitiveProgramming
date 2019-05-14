package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("number")
@DisplayName("LeetCode: 12. Integer to Roman")
class IntegerToRomanTest {
	/* Write code here. */

  IntegerToRoman integerToRoman = new IntegerToRoman();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("III", integerToRoman.intToRoman(3));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("IV", integerToRoman.intToRoman(4));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("IX", integerToRoman.intToRoman(9));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals("LVIII", integerToRoman.intToRoman(58));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
  }


}
