package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 859. Buddy Strings")
class BuddyStringsTest {
	/* Write code here. */

  BuddyStrings buddyStrings = new BuddyStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(buddyStrings.buddyStrings("ab", "ba"));
  }


}
