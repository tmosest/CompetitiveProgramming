package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hacker Earth: Data Structures: Stacks: Monk and Philosopher's Stone")
public class MonkAndPhilosophersStoneTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MonkAndPhilosophersStone.debugMode = debugMode;
    Assertions.assertEquals(output, MonkAndPhilosophersStone.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "4\n"
        + "3 1 1 4\n"
        + "6 7\n"
        + "Harry\n"
        + "Harry\n"
        + "Harry\n"
        + "Remove\n"
        + "Remove\n"
        + "Harry";
    int output = 2;
    test(input, output, false);
  }
}
