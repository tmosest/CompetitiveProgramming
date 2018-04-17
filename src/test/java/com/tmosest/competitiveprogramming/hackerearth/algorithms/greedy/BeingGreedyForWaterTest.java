package com.tmosest.competitiveprogramming.hackerearth.algorithms.greedy;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Greedy: Being greedy for Water")
class BeingGreedyForWaterTest {

  private static void test(String input, int[] output, boolean debugMode) throws IOException {
    HackerrankUtil.setSystemIn(input);
    BeingGreedyForWater.debugMode = debugMode;
    Assertions.assertArrayEquals(output, BeingGreedyForWater.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws IOException {
    String input = "1\n" + "5 10\n" + "8 5 4 3 2";
    int[] output = {3};
    test(input, output, false);
  }

}
