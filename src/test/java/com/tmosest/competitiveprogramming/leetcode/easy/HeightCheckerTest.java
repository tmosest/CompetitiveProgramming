package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1051. Height Checker")
class HeightCheckerTest {

  private HeightChecker heightChecker = new HeightChecker();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,1,4,2,1,3
    };
    Assertions.assertEquals(3, heightChecker.heightChecker(input));
  }
}
