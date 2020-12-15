package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("bwc35")
@DisplayName("LeetCode: 1573. Number of Ways to Split a String")
class NumberOfWaysToSplitStringTest {

  private NumberOfWaysToSplitString numberOfWaysToSplitString;

  @BeforeEach
  void setup() {
    numberOfWaysToSplitString = new NumberOfWaysToSplitString();
  }

  private void test(int output, String s) {
    Assertions.assertEquals(output, numberOfWaysToSplitString.numWays(s));
  }

  @Test
  void test0() {
    test(4, "10101");
  }
}
