package com.tmosest.competitiveprogramming.hackerearth.datastructures.arrays.one;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hacker Earth: Data Structures: Arrays: 1D: Monk and Lucky Minimum")
class MonkAndLuckyMinimumTest {

  private static void test(String input, String[] output, boolean debugMode)
      throws IOException {
    HackerrankUtil.setSystemIn(input);
    MonkAndLuckyMinimum.debugMode = debugMode;
    Assertions.assertArrayEquals(output, MonkAndLuckyMinimum.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws IOException {
    String input = "2\n" + "5\n" + "8 8 9 5 9\n" + "5\n" + "3 3 3 5 3";
    String[] output = {"Lucky", "Unlucky"};
    test(input, output, false);
  }

}
