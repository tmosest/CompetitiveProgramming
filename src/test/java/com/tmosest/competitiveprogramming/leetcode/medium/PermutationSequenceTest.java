package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 60. Permutation Sequence")
class PermutationSequenceTest {

  private PermutationSequence permutationSequence = new PermutationSequence();

  @Test
  void testCase0() {
    Assertions.assertEquals("213", permutationSequence.getPermutation(3, 3));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals("2314", permutationSequence.getPermutation(4, 9));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals("123456789", permutationSequence.getPermutation(9, 1));
  }
}
