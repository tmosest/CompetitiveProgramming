package com.tmosest.competitiveprogramming.hackerearth.graphs.dfs;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("HackerEarth Algorithms Graphs DFS: Tree Query")
public class TreeQueryTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    TreeQuery.debugMode = debugMode;
    Assertions.assertEquals(output, TreeQuery.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "4 2\n"
        + "2 3\n"
        + "4 3";
    int output = 3;
    test(input, output, false);
  }
}
