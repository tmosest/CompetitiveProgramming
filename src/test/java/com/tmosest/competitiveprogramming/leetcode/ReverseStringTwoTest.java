package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 541. Reverse String II")
public class ReverseStringTwoTest {

  ReverseStringTwo reverseStringTwo = new ReverseStringTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("bacdfeg", reverseStringTwo.reverseStr("abcdefg", 2));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("abcd", reverseStringTwo.reverseStr("dcba", 4));
  }
}
