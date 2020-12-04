package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("bwc39")
@DisplayName("LeetCode: 1653. Minimum Deletions to Make String Balanced")
class MinimumDeletionsToMakeStringBalancedTest {

  private MinimumDeletionsToMakeStringBalanced minimumDeletionsToMakeStringBalanced
      = new MinimumDeletionsToMakeStringBalanced();


  @Test
  void test1() {
    Assertions.assertEquals(2, minimumDeletionsToMakeStringBalanced.minimumDeletions("aababbab"));
  }
}
