package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculateTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SimpleCalculate.debugMode = debugMode;
    Assertions.assertEquals(output, SimpleCalculate.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "12 1 5.30\n"
        + "16 2 5.10";
    String output = "VALOR A PAGAR: R$ 15.50";
    test(input, output, false);
  }

}
