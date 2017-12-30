package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DifferenceTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    Difference.debugMode = debugMode;
    Assertions.assertEquals(output, Difference.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5\n"
        + "6\n"
        + "7\n"
        + "8";
    String output = "DIFERENCA = -26";
    test(input, output, false);
  }

}
