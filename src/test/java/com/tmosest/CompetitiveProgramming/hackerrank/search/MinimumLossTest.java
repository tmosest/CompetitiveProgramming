package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

class MinimumLossTest {

  String input;
  int output;

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MinimumLoss.debugMode = debugMode;
    Assertions.assertEquals(output, MinimumLoss.solve());
  }

  @Test
  void testCase0() throws UnsupportedEncodingException {
    input = "3\n" + "5 10 3";
    output = 2;
    test(input, output, true);
  }

  @Test
  void testCase1() throws UnsupportedEncodingException {
    input = "5\n" + 
        "20 7 8 2 5";
    output = 2;
    test(input, output, false);
  }
}
