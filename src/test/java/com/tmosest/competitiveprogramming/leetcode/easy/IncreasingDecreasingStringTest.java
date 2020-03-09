package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1370. Increasing Decreasing String")
class IncreasingDecreasingStringTest {

  private IncreasingDecreasingString increasingDecreasingString =
      new IncreasingDecreasingString();

  @Test
  void testCase0() {
    Assertions.assertEquals("abccbaabccba", increasingDecreasingString.sortString("aaaabbbbcccc"));
  }
}
