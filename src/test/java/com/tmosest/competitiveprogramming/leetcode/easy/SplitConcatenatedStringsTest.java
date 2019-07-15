package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 555. Split Concatenated Strings")
class SplitConcatenatedStringsTest {

  private SplitConcatenatedStrings splitConcatenatedStrings = new SplitConcatenatedStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] inputs = {"abc", "xyz"};
    Assertions.assertEquals("zyxcba", splitConcatenatedStrings.splitLoopedString(inputs));
  }
}
