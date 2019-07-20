package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 848. Shifting Letters")
class ShiftingLettersTest {

  private ShiftingLetters shiftingLetters = new ShiftingLetters();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] values = {
      3, 5, 9
    };
    Assertions.assertEquals("rpl", shiftingLetters.shiftingLetters("abc", values));
  }
}
