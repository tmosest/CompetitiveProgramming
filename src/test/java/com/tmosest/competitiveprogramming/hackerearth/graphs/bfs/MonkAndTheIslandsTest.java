package com.tmosest.competitiveprogramming.hackerearth.graphs.bfs;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Graphs BFS: Monk and the Islands")
class MonkAndTheIslandsTest {

  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MonkAndTheIslands.debugMode = debugMode;
    Assertions.assertArrayEquals(output, MonkAndTheIslands.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws UnsupportedEncodingException {
    String input =
        "2\n" + "3 2\n" + "1 2\n" + "2 3\n" + "4 4\n" + "1 2\n" + "2 3\n" + "3 4\n" + "4 2";
    int[] output = {2, 2};
    test(input, output, false);
  }

}
