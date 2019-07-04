package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 433. Minimum Genetic Mutation")
class MinimumGeneticMutationTest {

  private MinimumGeneticMutation minimumGeneticMutation = new MinimumGeneticMutation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] bank = {
      "AACCGGTA"
    };
    Assertions.assertEquals(1, minimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", bank));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] bank = {
        "AACCGGTA", "AACCGCTA", "AAACGGTA"
    };
    Assertions.assertEquals(1, minimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", bank));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] bank = {
        "AAAACCCC", "AAACCCCC", "AACCCCCC"
    };
    Assertions.assertEquals(3, minimumGeneticMutation.minMutation("AAAAACCC", "AACCCCCC", bank));
  }
}
