package com.tmosest.competitiveprogramming.hackerearth.algorithms.greedy;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Greedy: Exploring Ruins")
class ExploringRuinsTest {
  
  private static void test(String input, String output, boolean debugMode) throws IOException {
    HackerrankUtil.setSystemIn(input);
    ExploringRuins.debugMode = debugMode;
    Assertions.assertEquals(output, ExploringRuins.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws IOException {
    String input = "?ba??b";
    String output = "ababab";
    test(input, output, false);
  }

}
