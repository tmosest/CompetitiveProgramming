package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1006. Clumsy Factorial")
class ClumsyFactorialTest {

  private ClumsyFactorial clumsyFactorial = new ClumsyFactorial();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(7, clumsyFactorial.clumsy(4));
  }
}
