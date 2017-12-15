package com.tmosest.CompetitiveProgramming.hackerrank.wcs.wcs12;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WCS World Code Sprint 12: Red Knight's Shortest Path")
class RedKnightsShortestPathTest {

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
    RedKnightsShortestPath.debugMode = debugMode;
    Assertions.assertEquals(output, RedKnightsShortestPath.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "7\n" + "6 6 0 1";
    String output = "UL UL UL L";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    String input = "6\n" + "5 1 0 5";
    String output = "Impossible";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    String input = "7\n" + "0 3 4 3";
    String output = "LR LL";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    String input = "7 0 0 6 1";
    String output = "LR LR LL";
    test(input, output, false);
  }
  
  @Test
  @DisplayName("Test Case 4")
  void testCase4() throws UnsupportedEncodingException {
    String input = "9 8 4 0 4";
    String output = "UL UL UR UR";
    test(input, output, true);
  } 
}
