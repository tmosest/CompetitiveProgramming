package com.tmosest.CompetitiveProgramming.hackerrank.wcs.wcs12;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WCS World Code Sprint 12: The Salesman")
class TheSalesmanTest {

  String input;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws UnsupportedEncodingException
   */
  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    TheSalesman.debugMode = debugMode;
    Assertions.assertArrayEquals(output, TheSalesman.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "1\n" + "3\n" + "11 6 9";
    int[] output = {5};
    test(input, output, false);
  }

}
