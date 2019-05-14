package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 819. Most Common Word")
class ShortestDistanceToCharacterTest {
	/* Write code here. */

  ShortestDistanceToCharacter shortestToChar = new ShortestDistanceToCharacter();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
    Assertions.assertArrayEquals(expected, shortestToChar.shortestToChar("loveleetcode", 'e'));
  }


}
