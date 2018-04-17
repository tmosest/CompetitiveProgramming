package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs.BishuAndHisGirlfriend;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("HackerEarth Algorithms Graphs DFS: Bishu and his Girlfriend")
public class BishuAndHisGirlfriendTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    BishuAndHisGirlfriend.debugMode = debugMode;
    Assertions.assertEquals(output, BishuAndHisGirlfriend.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "6\n"
        + "1 2\n"
        + "1 3\n"
        + "1 4\n"
        + "2 5\n"
        + "2 6\n"
        + "4\n"
        + "5\n"
        + "6\n"
        + "3\n"
        + "4";
    int output = 3;
    test(input, output, false);
  }
}
