package com.tmosest.competitiveprogramming.hackerrank.woc.week37;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank WOC Week 37: Superior Characters")
public class SuperiorCharactersTest {

  String input;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SuperiorCharacters.debugMode = debugMode;
    Assertions.assertArrayEquals(output, SuperiorCharacters.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "5\n"
        + "0 0 0 0 2 0 0 0 0 0 0 1 0 0 0 0 0 0 1 0 0 0 0 0 0 0\n"
        + "1 2 2 3 4 0 3 4 4 1 3 1 4 4 1 0 0 0 0 0 4 2 3 2 2 1 \n"
        + "1 1 3 3 1 1 4 4 3 1 3 3 3 0 1 2 0 4 2 1 3 0 3 1 1 1 \n"
        + "3 3 0 2 2 2 4 1 2 1 1 1 3 3 0 0 3 2 2 4 1 4 4 1 2 1 \n"
        + "2 1 4 1 0 2 0 3 1 2 0 3 1 1 2 0 1 4 2 3 2 3 2 0 2 1 ";
    int[] output = {1, 25, 24, 25, 21};
    test(input, output, false);
  }

}
