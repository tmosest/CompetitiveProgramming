package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc217")
@DisplayName("LeetCode: 1673. Find the Most Competitive Subsequence")
class FindTheMostCompetitiveSubsequenceTest {

  private FindTheMostCompetitiveSubsequence findTheMostCompetitiveSubsequence = new FindTheMostCompetitiveSubsequence();

  private void test(int[] out, int[] arr, int size) {
    Assertions.assertArrayEquals(out, findTheMostCompetitiveSubsequence.mostCompetitive(arr, size));
  }

  @Test
  void test1() {
    test(new int[] {2,6}, new int[] {3,5,2,6}, 2);
  }

  @Test
  void test2() {
    test(new int[] {2,3,3,4}, new int[] {2,4,3,3,5,4,9,6}, 4);
  }
}
