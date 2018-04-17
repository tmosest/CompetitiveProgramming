package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WCS World Code Sprint 12: Factorial Array")
class FactorialArrayTest {

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws UnsupportedEncodingException
   */
  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    FactorialArray.debugMode = debugMode;
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    System.setOut(new java.io.PrintStream(out));
    FactorialArray.solve();
    Assertions.assertEquals(output, out.toString());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5 7\n" + "1 1 1 1 1\n" + "2 1 5\n" + "1 1 5\n" + "2 1 5\n" + "1 1 3\n"
        + "2 1 5\n" + "3 1 15\n" + "2 1 5";
    String output = "5\n" + "10\n" + "22\n" + "674368016\n";
    test(input, output, false);
  }

}
