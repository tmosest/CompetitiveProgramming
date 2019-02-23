package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 800. Similar RGB Color")
public class SimilarRgbColorTest {

  SimilarRgbColor similarRgbColor = new SimilarRgbColor();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("#11ee66", similarRgbColor.similarRgb("#09f166"));
  }
}
