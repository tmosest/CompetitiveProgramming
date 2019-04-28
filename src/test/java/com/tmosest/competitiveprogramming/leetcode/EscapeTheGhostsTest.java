package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 467. Unique Substrings in Wraparound String")
class EscapeTheGhostsTest {

  private EscapeTheGhosts escapeTheGhosts = new EscapeTheGhosts();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] ghosts = {
        {1, 0},
        {0, 3}
    };
    int[] target = {
        0, 1
    };
    Assertions.assertTrue(escapeTheGhosts.escapeGhosts(ghosts, target));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] ghosts = {
        {1, 0}
    };
    int[] target = {
        2, 0
    };
    Assertions.assertFalse(escapeTheGhosts.escapeGhosts(ghosts, target));
  }
}
