package com.tmosest.competitiveprogramming.hackerrank.woc.week36;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AcidNamingTest {

  String input;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, String[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    AcidNaming.debugMode = debugMode;
    Assertions.assertArrayEquals(output, AcidNaming.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "3\nhydrochloric\nrainbowic\nidontevenknow";
    String[] output = {
        "non-metal acid",
        "polyatomic acid",
        "not an acid"
    };
    test(input, output, false);
  }

}
