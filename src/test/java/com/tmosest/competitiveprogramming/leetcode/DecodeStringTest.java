package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("string")
@Tag("medium")
@DisplayName("LeetCode: 394. Decode String")
public class DecodeStringTest {

  DecodeString decodeString = new DecodeString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("aaabcbc", decodeString.decodeString( "3[a]2[bc]"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("accaccacc", decodeString.decodeString( "3[a2[c]]"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("abcabccdcdcdef", decodeString.decodeString( "2[abc]3[cd]ef"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals("aaabFFFFcbFFFFc", decodeString.decodeString("3[a]2[b4[F]c]"));
  }
}
