package com.tmosest.competitiveprogramming.hackerrank.graph;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank: Algorithms: Graph Theory: Roads and Libraries")
public class RoadsAndLibrariesTest {

  private static void test(String input, long[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    RoadsAndLibraries.debugMode = debugMode;
    Assertions.assertArrayEquals(output, RoadsAndLibraries.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "2\n"
        + "3 3 2 1\n"
        + "1 2\n"
        + "3 1\n"
        + "2 3\n"
        + "6 6 2 5\n"
        + "1 3\n"
        + "3 4\n"
        + "2 4\n"
        + "1 2\n"
        + "2 3\n"
        + "5 6";
    long[] output = {4, 12};
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    String input = "5\n"
        + "9 2 91 84\n"
        + "8 2\n"
        + "2 9\n"
        + "5 9 92 23\n"
        + "2 1\n"
        + "5 3\n"
        + "5 1\n"
        + "3 4\n"
        + "3 1\n"
        + "5 4\n"
        + "4 1\n"
        + "5 2\n"
        + "4 2\n"
        + "8 3 10 55\n"
        + "6 4\n"
        + "3 2\n"
        + "7 1\n"
        + "1 0 5 3\n"
        + "2 0 102 1";
    long[] output = {805, 184, 80, 5, 204};
    test(input, output, false);
  }
}
