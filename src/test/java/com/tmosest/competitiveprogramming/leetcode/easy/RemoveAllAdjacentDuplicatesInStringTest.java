package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1047. Remove All Adjacent Duplicates In String")
class RemoveAllAdjacentDuplicatesInStringTest {

  private RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("ca", removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca"));
  }
}
