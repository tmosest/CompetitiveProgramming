package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 506. Relative Ranks")
public class RelativeRanksTest {

  RelativeRanks relativeRanks = new RelativeRanks();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        5, 4, 3, 2, 1
    };
    String[] output = {
        "Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"
    };
    Assertions.assertArrayEquals(output, relativeRanks.findRelativeRanks(input));
  }
}
