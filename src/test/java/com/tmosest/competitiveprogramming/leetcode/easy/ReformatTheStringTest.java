package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc185")
@DisplayName("LeetCode: 1417. Reformat The String")
class ReformatTheStringTest {

  private ReformatTheString reformatTheString = new ReformatTheString();

  @Test
  void testCase0() {
    Assertions.assertEquals("0a1b2c", reformatTheString.reformat("a0b1c2"));
  }
}
