package com.tmosest.CompetitiveProgramming.hackerearth.graphs.bfs;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Graphs BFS: Level Nodes")
public class LevelNodesTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    LevelNodes.debugMode = debugMode;
    Assertions.assertEquals(output, LevelNodes.solve());
  }

  @Test
  void testCase0() throws UnsupportedEncodingException {
    String input = "20\n" + "11 1\n" + "1 2\n" + "13 3\n" + "15 4\n" + "17 5\n" + "11 6\n" + "2 7\n"
        + "1 8\n" + "15 9\n" + "4 10\n" + "15 12\n" + "5 13\n" + "2 14\n" + "17 15\n" + "15 16\n"
        + "11 17\n" + "15 18\n" + "9 19\n" + "16 20\n" + "2";
    int output = 3;
    test(input, output, false);
  }
}
