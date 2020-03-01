package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 77. Combinations")
class CombinationsTest {

  private Combinations combinations = new Combinations();

  @Test
  void testCase0() {
    List<List<Integer>> actual = combinations.combine(4, 2);
  }
}
