package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 453. Minimum Moves to Equal Array Elements")
public class MinimumMovesToEqualArrayElementsTest {

  MinimumMovesToEqualArrayElements minimumMovesToEqualArrayElements = new MinimumMovesToEqualArrayElements();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,2,3};
    Assertions.assertEquals(3, minimumMovesToEqualArrayElements.minMoves(input));
  }
}
