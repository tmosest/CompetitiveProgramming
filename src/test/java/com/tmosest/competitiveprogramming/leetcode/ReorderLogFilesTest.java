package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 937. Reorder Log Files")
public class ReorderLogFilesTest {

  ReorderLogFiles reorderLogFiles = new ReorderLogFiles();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {
        "a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"
    };
    String[] output = {
        "g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"
    };
    Assertions.assertArrayEquals(output, reorderLogFiles.reorderLogFiles(input));
  }
}
