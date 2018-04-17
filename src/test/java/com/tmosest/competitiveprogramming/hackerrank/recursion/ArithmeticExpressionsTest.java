package com.tmosest.competitiveprogramming.hackerrank.recursion;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hackerrank Recursion: Arithmetic Expressions")
public class ArithmeticExpressionsTest {

  private void test(String input, String output, boolean debugMode) throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    ArithmeticExpressions.debugMode = debugMode;
    Assertions.assertEquals(output, ArithmeticExpressions.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws  UnsupportedEncodingException {
    String input = "3\n"
        + "22 79 21";
    String output = "22+79*21";
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws  UnsupportedEncodingException {
    String input = "5\n"
        + "55 3 45 33 25";
    String output = "55+3-45*33-25";
    test(input, output, false);
  }

  /*
  @Test
  @DisplayName("Test Case 34")
  void testCase34() throws  UnsupportedEncodingException {
    String input = "37\n"
        + "15 50 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100";
    String output = "15-50-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100-100";
    test(input, output, false);
  }
  */
}
