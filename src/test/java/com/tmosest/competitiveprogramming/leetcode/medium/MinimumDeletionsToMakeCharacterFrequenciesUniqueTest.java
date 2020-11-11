package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc214")
@DisplayName("LeetCode: 1647. Minimum Deletions to Make Character Frequencies Unique")
class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {

  @Test
  void test1() {
    Assertions.assertEquals(0, new MinimumDeletionsToMakeCharacterFrequenciesUnique().minDeletions("aab"));
  }
}
