package com.tmosest.competitiveprogramming.hackerrank.graph;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank: Algorithms: Graph Theory: Journey to the Moon")
public class JourneyTotheMoonTest {

  private static void test(String input, BigInteger output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    JourneyToTheMoon.debugMode = debugMode;
    Assertions.assertEquals(output, JourneyToTheMoon.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5 3\n"
        + "0 1\n"
        + "2 3\n"
        + "0 4";
    BigInteger output = new BigInteger("6");
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 11")
  void testCase11() throws UnsupportedEncodingException {
    String input = "100000 2\n"
        + "1 2\n"
        + "3 4";
    BigInteger output = new BigInteger("4999949998");
    test(input, output, false);
  }

}
