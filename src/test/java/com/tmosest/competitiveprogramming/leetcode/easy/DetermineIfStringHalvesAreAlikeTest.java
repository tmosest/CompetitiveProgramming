package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc221")
@DisplayName("LeetCode: 1704. Determine if String Halves Are Alike")
class DetermineIfStringHalvesAreAlikeTest {

  private DetermineIfStringHalvesAreAlike determineIfStringHalvesAreAlike;

  @BeforeEach
  void setup() {
    determineIfStringHalvesAreAlike = new DetermineIfStringHalvesAreAlike();
  }

  private void test(boolean output, String s) {
    Assertions.assertEquals(output, determineIfStringHalvesAreAlike.halvesAreAlike(s));
  }

  @Test
  void test0() {
    test(true, "book");
  }

  @Test
  void test1() {
    test(false, "textbook");
  }
}
