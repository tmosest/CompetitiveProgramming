package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs.UnreachableNodes;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("HackerEarth Algorithms Graphs DFS: Unreachable Nodes")
public class UnreachableNodesTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    UnreachableNodes.debugMode = debugMode;
    Assertions.assertEquals(output, UnreachableNodes.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "10 10\n"
        + "8 1\n"
        + "8 3\n"
        + "7 4\n"
        + "7 5\n"
        + "2 6\n"
        + "10 7\n"
        + "2 8\n"
        + "10 9\n"
        + "2 10\n"
        + "5 10\n"
        + "2";
    int output = 0;
    test(input, output, false);
  }
}
