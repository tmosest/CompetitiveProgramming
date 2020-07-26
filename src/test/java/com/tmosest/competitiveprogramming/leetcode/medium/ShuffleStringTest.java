package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("wc199")
@DisplayName("LeetCode: 1528. Shuffle String")
class ShuffleStringTest {

  private ShuffleString shuffleString = new ShuffleString();

  @Test
  void testCase0() {
    Assertions.assertEquals("leetcode", shuffleString.restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
  }
}
