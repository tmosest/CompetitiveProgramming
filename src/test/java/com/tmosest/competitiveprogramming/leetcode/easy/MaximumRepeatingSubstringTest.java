package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("bwc40")
@DisplayName("LeetCode: 1668. Maximum Repeating Substring")
class MaximumRepeatingSubstringTest {

  private MaximumRepeatingSubstring maximumRepeatingSubstring = new MaximumRepeatingSubstring();

  @Test
  void test1() {
    Assertions.assertEquals(2, maximumRepeatingSubstring.maxRepeating("ababc", "ab"));
  }
}
