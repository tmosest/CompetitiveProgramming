package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 838. Push Dominoes")
class PushDominoesTest {

  private PushDominoes pushDominoes = new PushDominoes();

  @Test
  void testCase0() {
    Assertions.assertEquals("LL.RR.LLRRLL..", pushDominoes.pushDominoes(".L.R...LR..L.."));
  }
}
