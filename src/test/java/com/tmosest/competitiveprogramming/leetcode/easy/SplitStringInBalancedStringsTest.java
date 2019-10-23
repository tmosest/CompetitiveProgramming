package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1221. Split a String in Balanced Strings")
class SplitStringInBalancedStringsTest {

  private SplitStringInBalancedStrings splitStringInBalancedStrings = new SplitStringInBalancedStrings();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, splitStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
  }
}
