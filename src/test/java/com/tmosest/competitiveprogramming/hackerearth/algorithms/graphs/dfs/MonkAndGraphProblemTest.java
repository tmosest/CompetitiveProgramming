package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs.MonkAndGraphProblem;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("HackerEarth Algorithms Graphs DFS: Monk and Graph Problem")
public class MonkAndGraphProblemTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MonkAndGraphProblem.debugMode = false;
    Assertions.assertEquals(output, MonkAndGraphProblem.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "6 3\n"
        + "1 2\n"
        + "2 3\n"
        + "4 5";
    int output = 2;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase1() throws UnsupportedEncodingException {
    String input = "5 4\n"
        + "1 1\n"
        + "1 1\n"
        + "1 1\n"
        + "2 2";
    int output = 3;
    test(input, output, false);
  }
}
