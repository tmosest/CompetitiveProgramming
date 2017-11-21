package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WOC Week 35: Matrix Land")
class MatrixLandTest {

  String input;
  int output;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws UnsupportedEncodingException
   */
  private static void test(String input, int output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    MatrixLand.debugMode = debugMode;
    Assertions.assertEquals(output, MatrixLand.solve());
  }

  
  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "4 5\n1 2 3 -1 -2\n-5 -8 -1 2 -150\n1 2 3 -250 100\n1 1 1 1 20";
    output = 37;
    test(input, output, true);
  }
  /*
  // start 100 down 200 right-10 right -10 right -10 down -10 right -10 down 200 down 200 = 650
  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    input = "5 5 100 -10 -10 -100 -250 200 -10 -10 -10 -200 10 -10 -200 -10 -10 10 10 -200 -10 200 -10 -10 -200 -10 200";
    output = 650;
    test(input, output, true);
  }
  */
  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    input = "2 2\n 2 -1\n 2 -2";
    output = 4;
    test(input, output, false);
  }
  
  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    input = "1 6\n 2 -5 2 -8 3 4";
    output = 7;
    test(input, output, false);
  }
  
}
