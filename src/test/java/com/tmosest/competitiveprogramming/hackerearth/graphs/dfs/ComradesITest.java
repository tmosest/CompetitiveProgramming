package com.tmosest.competitiveprogramming.hackerearth.graphs.dfs;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("HackerEarth Algorithms Graphs DFS: Comrades - I")
public class ComradesITest {

  private static void test(String input, int[][] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    ComradesI.debugMode = debugMode;
    Assertions.assertArrayEquals(output, ComradesI.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "1\n"
        + "5\n"
        + "0 1 1 2 4\n"
        + "4\n"
        + "5 1\n"
        + "4 2\n"
        + "2 3\n"
        + "1 3";
    int[][] output = {{2, 0, -1, -1}};
    test(input, output, false);
  }
}
