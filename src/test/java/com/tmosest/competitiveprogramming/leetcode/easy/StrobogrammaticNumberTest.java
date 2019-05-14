package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 246. Strobogrammatic Number")
class StrobogrammaticNumberTest {
	/* Write code here. */

  StrobogrammaticNumber strobogrammaticNumber = new StrobogrammaticNumber();

  @Test
  @DisplayName("Tast Case 0")
  void testCase0() {
    Assertions.assertTrue(strobogrammaticNumber.isStrobogrammatic("69"));
  }

  @Test
  @DisplayName("Tast Case 1")
  void testCase1() {
    Assertions.assertTrue(strobogrammaticNumber.isStrobogrammatic("88"));
  }

  @Test
  @DisplayName("Tast Case 2")
  void testCase2() {
    Assertions.assertFalse(strobogrammaticNumber.isStrobogrammatic("962"));
  }

  @Test
  @DisplayName("Tast Case 3")
  void testCase3() {
    Assertions.assertFalse(strobogrammaticNumber.isStrobogrammatic("2"));
  }


}
