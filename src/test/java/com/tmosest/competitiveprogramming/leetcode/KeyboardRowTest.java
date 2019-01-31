package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 500. Keyboard Row")
public class KeyboardRowTest {

  KeyboardRow keyboardRow = new KeyboardRow();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {"Hello", "Alaska", "Dad", "Peace"};
    String[] output = {"Alaska", "Dad"};
    Assertions.assertArrayEquals(output, keyboardRow.findWords(input));
  }
}
