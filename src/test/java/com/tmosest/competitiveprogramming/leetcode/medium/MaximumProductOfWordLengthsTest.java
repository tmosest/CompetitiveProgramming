package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 318. Maximum Product of Word Lengths")
class MaximumProductOfWordLengthsTest {

  private MaximumProductOfWordLengths maximumProductOfWordLengths = new MaximumProductOfWordLengths();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "abcw","baz","foo","bar","xtfn","abcdef"
    };
    Assertions.assertEquals(16, maximumProductOfWordLengths.maxProduct(input));
  }
}
