package com.tmosest.competitiveprogramming.hackerrank.woc.week36;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank WOC Week 37: Revised Russian Roulette")
class RevisedRussianRouletteTest {

  String input;
  String output;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    RevisedRussianRoulette.debugMode = debugMode;
    Assertions.assertEquals(output, RevisedRussianRoulette.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "10\n0 1 1 0 1 1 1 1 0 0";
    output = "3 6";
    test(input, output, false);
  }
}
