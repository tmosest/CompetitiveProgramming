package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc211")
@DisplayName("LeetCode: 1624. Largest Substring Between Two Equal Characters")
class LargestSubstringBetweenTwoEqualCharactersTest {

  @Test
  void test1() {
    Assertions.assertEquals(0,
        new LargestSubstringBetweenTwoEqualCharacters().maxLengthBetweenEqualCharacters("aa"));
  }
}
