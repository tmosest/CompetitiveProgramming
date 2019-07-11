package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1055. Shortest Way to Form String")
class ShortestWayToFormStringTest {

  private ShortestWayToFormString ShortestWayToFormString = new ShortestWayToFormString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(2, ShortestWayToFormString.shortestWay("abc", "abcbc"));
  }
}
