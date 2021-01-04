package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wc222")
@DisplayName("LeetCode: 1713. Minimum Operations to Make a Subsequence")
class MinimumOperationsToMakeSubsequenceTest {

  private MinimumOperationsToMakeSubsequence minimumOperationsToMakeSubsequence;

  @BeforeEach
  void setup() {
    minimumOperationsToMakeSubsequence = new MinimumOperationsToMakeSubsequence();
  }

  private void test(int output, int[] target, int[] A) {
    Assertions.assertEquals(output, minimumOperationsToMakeSubsequence.minOperations(target, A));
  }

  @Test
  void test0() {
    test(2, new int[]{5, 1, 3}, new int[]{9, 4, 2, 3, 4});
  }


}
