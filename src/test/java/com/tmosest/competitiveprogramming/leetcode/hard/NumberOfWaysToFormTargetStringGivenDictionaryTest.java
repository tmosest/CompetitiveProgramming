package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("bwc38")
@Tag("array")
@DisplayName("LeetCode: 1639. Number of Ways to Form a Target String Given a Dictionary")
class NumberOfWaysToFormTargetStringGivenDictionaryTest {

  @Test
  void test1() {
    Assertions.assertEquals(6, new NumberOfWaysToFormTargetStringGivenDictionary()
        .numWays(new String[] {"acca","bbbb","caca"}, "aba")
    );
  }
}
