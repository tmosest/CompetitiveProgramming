package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc208")
@DisplayName("LeetCode: 1593. Split a String Into the Max Number of Unique Substrings")
class SplitStringIntoTheMaxNumberOfUniqueSubstringsTest {

  private SplitStringIntoTheMaxNumberOfUniqueSubstrings splitStringIntoTheMaxNumberOfUniqueSubstrings =
      new SplitStringIntoTheMaxNumberOfUniqueSubstrings();

  @Test
  void test1() {
    Assertions.assertEquals(5,
        splitStringIntoTheMaxNumberOfUniqueSubstrings.maxUniqueSplit("ababccc"));
  }
}
