package com.tmosest.competitiveprogramming.hackerrank.woc.week1;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("woc1")
@Tag("easy")
@DisplayName("HackerRank WOC Week 1: Maximizing XOR")
public class MaximizingXorTest {
  String input;
  int output;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MaximizingXor.debugMode = debugMode;
    Assertions.assertEquals(output, MaximizingXor.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "10\n15";
    output = 7;
    test(input, output, false);
  }
}
