package com.tmosest.competitiveprogramming.hackerrank.woc.week37;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TheAverageRatingOfTopEmployeesTest {

  String input;
  String output;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    TheAverageRatingOfTopEmployees.debugMode = debugMode;
    Assertions.assertEquals(output, TheAverageRatingOfTopEmployees.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "5\n84\n92\n61\n50\n95";
    output = "93.50";
    test(input, output, false);
  }

}
