package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 384. Shuffle an Array")
class ShuffleAnArrayTest {

  private int[] input = {0, 1, 1};
  private ShuffleAnArray suffleAnArray = new ShuffleAnArray(input);

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(input, suffleAnArray.reset());
  }

  @Test
  void testCase1() {
    boolean isEqual = true;
    while (isEqual) {
      isEqual = Arrays.equals(input, suffleAnArray.shuffle());
    }
    Assertions.assertFalse(isEqual);
  }
}
