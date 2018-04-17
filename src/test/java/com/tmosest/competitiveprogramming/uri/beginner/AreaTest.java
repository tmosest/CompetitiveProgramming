package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    Area.debugMode = debugMode;
    Assertions.assertEquals(output, Area.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "3.0 4.0 5.2";
    String output = "TRIANGULO: 7.800\n"
        + "CIRCULO: 84.949\n"
        + "TRAPEZIO: 18.200\n"
        + "QUADRADO: 16.000\n"
        + "RETANGULO: 12.000";
    test(input, output, false);
  }

}
