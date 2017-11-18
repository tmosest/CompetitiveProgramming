package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

class HighwayConstructionTest {

  String input;

  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws UnsupportedEncodingException
   */
  private static void test(String input, BigInteger[] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    HighwayConstruction.debugMode = debugMode;
    Assertions.assertArrayEquals(output, HighwayConstruction.solve());
  }

  @Test
  void testCase0() throws UnsupportedEncodingException {
    input = "1\n4 2";
    BigInteger[] output = {new BigInteger("13")};
    test(input, output, true);
  }

}
