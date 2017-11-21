package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Search: Count Luck")
class CountLuckTest {

  String input;

  private static void test(String input, boolean[] outputs, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    CountLuck.debugMode = debugMode;
    Assertions.assertArrayEquals(outputs, CountLuck.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "3\n" + "2 3\n" + "*.M\n" + ".X.\n" + "1\n" + "4 11\n" + ".X.X......X\n"
        + ".X*.X.XXX.X\n" + ".XX.X.XM...\n" + "......XXXX.\n" + "3\n" + "4 11\n" + ".X.X......X\n"
        + ".X*.X.XXX.X\n" + ".XX.X.XM...\n" + "......XXXX.\n" + "4";
    boolean[] outputs = {true, true, false};
    test(input, outputs, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    input = "3\n" + "5 11\n" + "..........*\n" + ".XXXXXXXXXX\n" + "...........\n" + "XXXXXXXXXX.\n"
        + "M..........\n" + "0\n" + "5 17\n" + "XXXXXXXXXXXXXXXXX\n" + "XXX.XX.XXXXXXXXXX\n"
        + "XX.*..M.XXXXXXXXX\n" + "XXX.XX.XXXXXXXXXX\n" + "XXXXXXXXXXXXXXXXX\n" + "10\n" + "5 17\n"
        + "XXXXXXXXXXXXXXXXX\n" + "XXX.XX.XXXXXXXXXX\n" + "XX.*..M.XXXXXXXXX\n"
        + "XXX.XX.XXXXXXXXXX\n" + "XXXXXXXXXXXXXXXXX\n" + "1";
    boolean[] outputs = {true, false, true};
    test(input, outputs, true);
  }

}
