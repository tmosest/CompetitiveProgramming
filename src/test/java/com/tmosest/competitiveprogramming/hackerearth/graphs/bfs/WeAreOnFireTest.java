package com.tmosest.competitiveprogramming.hackerearth.graphs.bfs;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Graphs BFS: We Are On Fire")
class WeAreOnFireTest {

  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    WeAreOnFire.debugMode = debugMode;
    Assertions.assertArrayEquals(output, WeAreOnFire.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "3 3 3\n" + "0 0 0\n" + "1 0 1\n" + "0 1 1\n" + "1 2\n" + "2 2\n" + "3 3";
    int[] output = {4, 4, 1};
    test(input, output, false);
  }

}
