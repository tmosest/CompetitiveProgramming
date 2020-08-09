package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@Tag("wc171")
@DisplayName("LeetCode: 1318. Minimum Flips to Make a OR b Equal to c")
class MinimumFlipsToMakeOrEqualToTest {

  private MinimumFlipsToMakeOrEqualTo minimumFlipsToMakeOrEqualTo = new MinimumFlipsToMakeOrEqualTo();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, minimumFlipsToMakeOrEqualTo.minFlips(2, 3, 5));
  }
}
