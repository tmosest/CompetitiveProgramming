package com.tmosest.competitiveprogramming.hackerrank.woc.week37;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank WOC Week 37: Simple Language")
class SimpleLanguageTest {

  String input;
  long output;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, long output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SimpleLanguage.debugMode = debugMode;
    Assertions.assertEquals(output, SimpleLanguage.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "3\nadd 2\nset 1\nadd -1";
    output = 2;
    test(input, output, false);
  }
}
