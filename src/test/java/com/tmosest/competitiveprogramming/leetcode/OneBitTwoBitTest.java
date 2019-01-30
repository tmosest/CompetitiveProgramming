package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 717. 1-bit and 2-bit Characters")
public class OneBitTwoBitTest {

  OneBitTwoBit oneBitTwoBit = new OneBitTwoBit();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1, 0, 0};
    Assertions.assertTrue(oneBitTwoBit.isOneBitCharacter(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {1, 1, 1, 0};
    Assertions.assertFalse(oneBitTwoBit.isOneBitCharacter(input));
  }
}
