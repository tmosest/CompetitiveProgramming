package com.tmosest.competitiveprogramming.hackerrank.greedy;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Greedy: Sherlock and MiniMax")
class SherlockAndMiniMaxTest {

  private static void testData(String input, long output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SherlockAndMiniMax.debugMode = debugMode;
    Assertions.assertEquals(output, SherlockAndMiniMax.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "3\n" + "5 8 14\n" + "4 9";
    long output = 4;
    testData(input, output, false);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    String input = "5\n" + "12 10 50 24 40\n" + "9 16";
    long output = 16;
    testData(input, output, false);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    String input = "10\n" + "46 64 26 82 18 106 60 138 194 22\n" + "82 182";
    long output = 166;
    testData(input, output, false);
  }

}
