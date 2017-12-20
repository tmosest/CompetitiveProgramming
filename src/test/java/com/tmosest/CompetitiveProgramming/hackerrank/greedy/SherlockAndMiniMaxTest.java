package com.tmosest.CompetitiveProgramming.hackerrank.greedy;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

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

}
