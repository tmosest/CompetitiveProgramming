package com.tmosest.competitiveprogramming.hackerrank.woc.week35;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WOC Week 35: 3D Surface Area")
class ThreeDSurfaceAreaTest {

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
    ThreeDSurfaceArea.debugMode = debugMode;
    Assertions.assertEquals(output, ThreeDSurfaceArea.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "1 1\n1";
    output = 6;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    input = "3 3\n1 3 4\n2 2 3\n1 2 4";
    output = 60;
    test(input, output, false);
  }
  
  @Test
  @DisplayName("Test Case 2")
  void testCase2() throws UnsupportedEncodingException {
    input = "1 1\n 2";
    output = 10;
    test(input, output, false);
  }
  
  @Test
  @DisplayName("Test Case 3")
  void testCase3() throws UnsupportedEncodingException {
    input = "1 2\n1 2";
    output = 14;
    test(input, output, false);
  }
  /*
  @Test
  void testCase4() {
    for(int i = 0; i < 100; i++) {
      for(int j = 0; j < 100; j++) {
        System.out.print("100");
        if(j != 99) System.out.print(" ");
      }
      if(i != 99) System.out.println();
    }
  }
  */
}
