package com.tmosest.CompetitiveProgramming.hackerearth.datastructures.arrays.oneD;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hacker Earth: Data Structures: Arrays: 1D: Tutorial")
class TutorialTest {

  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    Tutorial.debugMode = debugMode;
    Assertions.assertArrayEquals(output, Tutorial.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5\n" + "4\n" + "12\n" + "7\n" + "15\n" + "9";
    int[] output = {9, 15, 7, 12, 4};
    test(input, output, false);
  }

}
