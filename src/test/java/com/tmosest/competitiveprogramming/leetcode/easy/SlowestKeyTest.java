package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc212")
@Tag("array")
@DisplayName("LeetCode: 1629. Slowest Key")
class SlowestKeyTest {

  @Test
  void test1() {
    Assertions.assertEquals('c', new SlowestKey().slowestKey(new int[] {9,29,49,50}, "cbcd"));
  }
}
