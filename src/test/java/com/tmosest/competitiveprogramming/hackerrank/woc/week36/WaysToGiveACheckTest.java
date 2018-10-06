package com.tmosest.competitiveprogramming.hackerrank.woc.week36;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank WOC Week 37: Ways To Give A Check Test")
public class WaysToGiveACheckTest {

  String input;
  String output;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    WaysToGiveACheck.debugMode = debugMode;
    Assertions.assertEquals(output, WaysToGiveACheck.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "2\n"
        + "########\n"
        + "#k#P####\n"
        + "########\n"
        + "########\n"
        + "########\n"
        + "########\n"
        + "#K######\n"
        + "########\n"
        + "########\n"
        + "######P#\n"
        + "####k###\n"
        + "########\n"
        + "########\n"
        + "########\n"
        + "####K###\n"
        + "########";
    output = "1\n2";
    // test(input, output, false);
  }
}
