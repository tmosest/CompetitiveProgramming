package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Search: KnightL on a Chessboard")
class KnightLOnAChessboardTest {

  String input;

  private static void test(String input, int[][] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    KnightLOnAChessboard.debugMode = true;
    Assertions.assertArrayEquals(output, KnightLOnAChessboard.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "5";
    int[][] output = {{4, 4, 2, 8}, {4, 2, 4, 4}, {2, 4, -1, -1}, {8, 4, -1, 1}};
    test(input, output, true);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    input = "7";
    int[][] output = {{6, 4, 4, 8, 2, 12}, {4, 3, 4, 2, 16, 3}, {4, 4, 2, 4, 4, 4},
        {8, 2, 4, -1, -1, -1}, {2, 16, 4, -1, -1, -1}, {12, 3, 4, -1, -1, 1}};
    test(input, output, true);
  }

}
