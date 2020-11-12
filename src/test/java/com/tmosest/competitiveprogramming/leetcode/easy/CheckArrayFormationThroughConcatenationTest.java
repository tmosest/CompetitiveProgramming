package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc213")
@DisplayName("LeetCode: 1640. Check Array Formation Through Concatenation")
class CheckArrayFormationThroughConcatenationTest {

  @Test
  void test1() {
    Assertions.assertTrue(new CheckArrayFormationThroughConcatenation().canFormArray(
        new int[] {85},
        new int[][] {{85}}
    ));
  }
}
