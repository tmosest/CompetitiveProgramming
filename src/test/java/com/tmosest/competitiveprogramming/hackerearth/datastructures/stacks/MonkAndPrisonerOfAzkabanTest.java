package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hacker Earth: Data Structures: Stacks: Monk and Prisoner of Azkaban")
public class MonkAndPrisonerOfAzkabanTest {

  private static void test(String input, long[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MonkAndPrisonerOfAzkaban.debugMode = debugMode;
    Assertions.assertArrayEquals(output, MonkAndPrisonerOfAzkaban.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5\n"
        + "5 4 1 3 2";
    long[] output = {-2, 0, 6, 1, 3};
    test(input, output, false);
  }
}
