package com.tmosest.CompetitiveProgramming.hackerrank.recursion;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Recursion: Recursive Digit Sum")
class RecursiveDigitSumTest {

  String data;
  int output;
  
  private static void testData(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    RecursiveDigitSum.debugMode = debugMode;
    Assertions.assertEquals(output, RecursiveDigitSum.solve());
  }
  
  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    data = "148 3";
    output = 3;
    testData(data, output, true);
  }

}
