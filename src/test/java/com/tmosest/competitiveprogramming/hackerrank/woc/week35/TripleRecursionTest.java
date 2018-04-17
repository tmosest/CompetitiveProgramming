package com.tmosest.competitiveprogramming.hackerrank.woc.week35;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WOC Week 35: Triple Recursion")
public class TripleRecursionTest {

  String input;
  String output;

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
    TripleRecursion.debugMode = debugMode;
    Assertions.assertEquals(TripleRecursion.solve().toString(), output);
  }
  
  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "5 10 7";
    output = "10 9 8 7 6\n" + 
        "9 17 16 15 14\n" + 
        "8 16 24 23 22\n" + 
        "7 15 23 31 30\n" + 
        "6 14 22 30 38";
    test(input, output, false);
  }
}
