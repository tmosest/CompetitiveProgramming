package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntervalTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    Interval.debugMode = debugMode;
    Assertions.assertEquals(output, Interval.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "25.01";
    String output = "Intervalo (25,50]";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    String input = "25.00";
    String output = "Intervalo [0,25]";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    String input = "100.00";
    String output = "Intervalo (75,100]";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    String input = "-25.02";
    String output = "Fora de intervalo";
    test(input, output, false);
  }

}
