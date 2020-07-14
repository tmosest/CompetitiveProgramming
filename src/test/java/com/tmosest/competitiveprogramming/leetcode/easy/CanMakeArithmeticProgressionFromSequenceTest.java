package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc196")
@DisplayName("LeetCode: 1502. Can Make Arithmetic Progression From Sequence")
class CanMakeArithmeticProgressionFromSequenceTest {

  private CanMakeArithmeticProgressionFromSequence canMakeArithmeticProgressionFromSequence =
      new CanMakeArithmeticProgressionFromSequence();

  @Test
  void testCase0() {
    Assertions
        .assertTrue(canMakeArithmeticProgressionFromSequence.canMakeArithmeticProgression(new int[] {
            3, 5, 1
        }));
  }

  @Test
  void testCase1() {
    Assertions.assertFalse(
        canMakeArithmeticProgressionFromSequence.canMakeArithmeticProgression(new int[] {
            1, 2, 4
        }));
  }
}
