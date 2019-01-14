package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 443. String Compression")
public class StringCompressionTest {

  StringCompression stringCompression = new StringCompression();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    char[] expected = {'a', '2', 'b', '2', 'c', '3'};
    Assertions.assertEquals(expected.length, stringCompression.compress(input));
    for (int i = 0; i < expected.length; i++) {
      Assertions.assertEquals(expected[i], input[i]);
    }
  }
}
