package com.tmosest.competitiveprogramming.hackerearth.graphs.bfs;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Graphs BFS: Big P and Party")
class BigPAndPartyTest {

  private static void test(String input, int[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    BigPAndParty.debugMode = debugMode;
    Assertions.assertArrayEquals(output, BigPAndParty.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws UnsupportedEncodingException {
    String input = "5 6\n" + "0 1\n" + "0 2\n" + "3 2\n" + "2 4\n" + "4 3\n" + "1 2";
    int[] output = {1, 1, 2, 2};
    test(input, output, false);
  }

}
