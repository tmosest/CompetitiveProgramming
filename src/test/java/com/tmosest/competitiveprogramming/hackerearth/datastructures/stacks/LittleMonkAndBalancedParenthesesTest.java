package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hacker Earth: Data Structures: Stacks: Little Monk and Balanced Parentheses")
public class LittleMonkAndBalancedParenthesesTest {

  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    LittleMonkAndBalancedParentheses.debugMode = debugMode;
    Assertions.assertEquals(output, LittleMonkAndBalancedParentheses.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "5\n"
        + "1 -1 2 3 -2";
    int output = 2;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    String input = "10\n"
        + "1 2 3 4 5 6 -6 -5 -4 -3";
    int output = 8;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 6")
  void testCase6() throws UnsupportedEncodingException {
    String input = "13\n"
        + "1 2 1 2 1 2 2 -2 -1 -2 -1 -2 -1";
    int output = 2;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 22")
  void testCase22() throws UnsupportedEncodingException {
    String input = "100\n"
        + "-60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522 -60522 60522";
    int output = 98;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 23")
  void testCase23() throws UnsupportedEncodingException {
    String input = "5\n"
        + "1 -1 2 3 -3";
    int output = 2;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 45")
  void testCase45() throws UnsupportedEncodingException {
    String input = "5\n"
        + "-100000 -99999 -99998 -12345 -1";
    int output = 0;
    test(input, output, false);
  }
}
