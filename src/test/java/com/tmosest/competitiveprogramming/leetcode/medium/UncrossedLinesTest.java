package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1035. Uncrossed Lines")
class UncrossedLinesTest {

  private UncrossedLines uncrossedLines = new UncrossedLines();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] one = {
        1,4,2
    };
    int[] two = {
        1,2,4
    };
    Assertions.assertEquals(2, uncrossedLines.maxUncrossedLines(one, two));
  }
}
