package com.tmosest.CompetitiveProgramming.hackerrank.strings;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Strings: Separate the Numbers")
class SeparateTheNumbersTest {

  String input;
  
  private static void test(String input, String[][] output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SeparateTheNumbers.debugMode = debugMode;
    Assertions.assertArrayEquals(output, SeparateTheNumbers.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "7\n1234\n91011\n99100\n101103\n010203\n13\n1";
    String[][] output = {{"YES", "1"}, {"YES", "9"}, {"YES", "99"}, {"NO", "-1"}, {"NO", "-1"},
        {"NO", "-1"}, {"NO", "-1"}};
    test(input, output, false);
  }

}
