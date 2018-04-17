package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.topologicalsort;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("HackerEarth: Algorithms: Graphs: Topological Sort: Topological Sort")
public class TopologicalSortTest {

  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    TopologicalSort.debugMode = debugMode;
    Assertions.assertArrayEquals(output, TopologicalSort.solve());
  }
  /*
  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5 6\n"
        + "1 2\n"
        + "1 3\n"
        + "2 3\n"
        + "2 4\n"
        + "3 4\n"
        + "3 5";
    int[] output = {1, 2, 3, 4, 5};
    test(input, output, false);
  }
  */
}
