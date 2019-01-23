package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 645. Set Mismatch")
public class SetMismatchTest {

  SetMismatch setMismatch = new SetMismatch();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,2,2,4};
    int[] expected = {2,3};
    Assertions.assertArrayEquals(expected, setMismatch.findErrorNums(input));
  }
}
