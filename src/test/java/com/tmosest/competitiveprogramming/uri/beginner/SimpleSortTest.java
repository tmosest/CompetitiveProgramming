package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleSortTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SimpleSort.debugMode = debugMode;
    Assertions.assertEquals(output, SimpleSort.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "7 21 -14";
    String output = "-14\n"
        + "7\n"
        + "21\n"
        + "\n"
        + "7\n"
        + "21\n"
        + "-14\n";
    test(input, output, false);
  }

}
