package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 860. Lemonade Change")
class LemonadeChangeTest {
	/* Write code here. */

  LemonadeChange lemonadeChange = new LemonadeChange();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        5,5,5,10,20
    };
    Assertions.assertTrue(lemonadeChange.lemonadeChange(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        5,5,10
    };
    Assertions.assertTrue(lemonadeChange.lemonadeChange(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        10
    };
    Assertions.assertFalse(lemonadeChange.lemonadeChange(input));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    int[] input = {
        5,5,10,10,20
    };
    Assertions.assertFalse(lemonadeChange.lemonadeChange(input));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase5() {
    int[] input = {
        5,5,5,10,5,20,5,10,5,20
    };
    Assertions.assertTrue(lemonadeChange.lemonadeChange(input));
  }


}
