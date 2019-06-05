package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1017. Convert to Base -2")
class ConvertToBaseNegativeTwoTest {

  private ConvertToBaseNegativeTwo convertToBaseNegativeTwo = new ConvertToBaseNegativeTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("110", convertToBaseNegativeTwo.baseNeg2(2));
  }
}
