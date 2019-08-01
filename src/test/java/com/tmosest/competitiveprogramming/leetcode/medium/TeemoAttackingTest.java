package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 495. Teemo Attacking")
class TeemoAttackingTest {

  private TeemoAttacking teemoAttacking = new TeemoAttacking();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 4
    };
    Assertions.assertEquals(4, teemoAttacking.findPoisonedDuration(input, 2));
  }
}
