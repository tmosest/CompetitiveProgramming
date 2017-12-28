package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WCS World Code Sprint 12: Animal Transport")
class AnimalTransportTest {

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
    AnimalTransport.debugMode = debugMode;
    // java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    // System.setOut(new java.io.PrintStream(out));
    AnimalTransport.solve();
    // Assertions.assertEquals(output, out.toString());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "2\n" + "10 3\n" + "E D C\n" + "4 1 4\n" + "7 5 8\n" + "10 6\n" + "E D C M E D\n"
        + "1 1 1 2 9 7\n" + "2 2 2 4 10 10\n";
    String output = "5 8 -1 \n" + 
        "2 2 4 10 -1 -1 \n";
    test(input, output, true);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    String input = "1\n" + "10 4\n" + "E D D D D\n" + "1 2 3 4\n" + "10 3 4 5\n";
    String output = "3 4 5 -1 \n";
    test(input, output, false);
  }
}
