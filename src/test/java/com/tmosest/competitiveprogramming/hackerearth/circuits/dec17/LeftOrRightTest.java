package com.tmosest.competitiveprogramming.hackerearth.circuits.dec17;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth December Circuit 17: Left or Right")
class LeftOrRightTest {

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws IOException 
   */
  private static void test(String input, int[] output, boolean debugMode)
      throws IOException {
    HackerrankUtil.setSystemIn(input);
    LeftOrRight.debugMode = debugMode;
    Assertions.assertArrayEquals(output, LeftOrRight.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws IOException {
    String input = "3 4\n" + "1 2 3\n" + "0 1 L\n" + "1 3 L\n" + "2 1 R\n" + "1 5 L";
    int[] output = {0, 2, 1, -1};
    test(input, output, false);
  }

}
