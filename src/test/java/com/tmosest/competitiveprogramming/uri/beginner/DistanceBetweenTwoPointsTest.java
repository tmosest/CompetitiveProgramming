package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DistanceBetweenTwoPointsTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    DistanceBetweenTwoPoints.debugMode = debugMode;
    Assertions.assertEquals(output, DistanceBetweenTwoPoints.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "1.0 7.0\n"
        + "5.0 9.0";
    String output = "4.4721";
    test(input, output, false);
  }

}
