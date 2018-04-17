package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WCS World Code Sprint 12: Breaking Sticks")
class BreakingSticksTest {

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws UnsupportedEncodingException
   */
  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    BreakingSticks.debugMode = debugMode;
    Assertions.assertEquals(output, BreakingSticks.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "1\n" + "6";
    int output = 10;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    String input = "3\n" + "1 7 24";
    int output = 55;
    test(input, output, false);
  }
}
