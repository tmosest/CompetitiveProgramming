package com.tmosest.competitiveprogramming.hackerearth.graphs.representation;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("HackerEarth Algorithms Graphs Representation: Edge Existence")
public class EdgeExistenceTest {

  private static void test(String input, String[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    EdgeExistence.debugMode = debugMode;
    Assertions.assertArrayEquals(output, EdgeExistence.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws UnsupportedEncodingException {
    String input = "2 1\n" + "1 2\n" + "1\n" + "1 2\n";
    String[] output = {"YES"};
    test(input, output, false);
  }
}
