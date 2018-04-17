package com.tmosest.competitiveprogramming.hackerrank.implementation;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hacker Rank Implementation: Halloween Sale")
class HalloweenSaleTest {

  String input;
  int output;

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    HalloweenSale.debugMode = debugMode;
    Assertions.assertEquals(output, HalloweenSale.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "20 3 6 80";
    output = 6;
    test(input, output, false);
  }

}
