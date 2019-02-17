package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 405. Convert a Number to Hexadecimal")
public class ConvertNumberHexadecimalTest {

  ConvertNumberHexadecimal convertNumberHexadecimal = new ConvertNumberHexadecimal();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("1a", convertNumberHexadecimal.toHex(26));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("ffffffff", convertNumberHexadecimal.toHex(-1));
  }
}
