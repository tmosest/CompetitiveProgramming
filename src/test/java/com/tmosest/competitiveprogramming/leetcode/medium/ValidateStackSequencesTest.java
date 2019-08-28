package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 946. Validate Stack Sequences")
class ValidateStackSequencesTest {

  private ValidateStackSequences validateStackSequences = new ValidateStackSequences();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] pushed = {
        1,2,3,4,5
    };
    int[] popped = {
        4,5,3,2,1
    };
    Assertions.assertTrue(validateStackSequences.validateStackSequences(pushed, popped));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] pushed = {
        1,2,3,4,5
    };
    int[] popped = {
        4,3,5,1,2
    };
    Assertions.assertFalse(validateStackSequences.validateStackSequences(pushed, popped));
  }
}
