package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc197")
@DisplayName("LeetCode: 1513. Number of Substrings With Only 1s")
class NumberOfSubstringsWithOnly1sTest {

  private NumberOfSubstringsWithOnly1s numberOfSubstringsWithOnly1s = new NumberOfSubstringsWithOnly1s();

  @Test
  void testCase0() {
    Assertions.assertEquals(9, numberOfSubstringsWithOnly1s.numSub("0110111"));
  }
}
