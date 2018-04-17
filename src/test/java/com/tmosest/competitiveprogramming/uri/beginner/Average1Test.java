package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Average1Test {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    Average1.debugMode = debugMode;
    Assertions.assertEquals(output, Average1.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5.0\n"
        + "7.1";
    String output = "MEDIA = 6.43182";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    String input = "0.0\n"
        + "7.1";
    String output = "MEDIA = 4.84091";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    String input = "10.0\n"
        + "10.0";
    String output = "MEDIA = 10.00000";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    String input = "0.0\n"
        + "3.8";
    String output = "MEDIA = 2.59091";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() throws UnsupportedEncodingException {
    String input = "9.5\n"
        + "6.8";
    String output = "MEDIA = 7.65909";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 5")
  void testCase5() throws UnsupportedEncodingException {
    String input = "5.8\n"
        + "8.9";
    String output = "MEDIA = 7.91364";
    test(input, output, false);
  }
}
