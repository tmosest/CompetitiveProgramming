package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc216")
@Tag("array")
@DisplayName("LeetCode: 1662. Check If Two String Arrays are Equivalent")
class CheckIfTwoStringArraysAreEquivalentTest {

  private CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();

  @Test
  void test() {
    Assertions.assertTrue(checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(
        new String[] {"ab", "c"}, new String[] {"a", "bc"}));
  }
}
