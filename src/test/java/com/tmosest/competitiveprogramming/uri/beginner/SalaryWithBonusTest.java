package com.tmosest.competitiveprogramming.uri.beginner;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalaryWithBonusTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    SalaryWithBonus.debugMode = debugMode;
    Assertions.assertEquals(output, SalaryWithBonus.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    String input = "JOAO\n"
        + "500.00\n"
        + "1230.30";
    String output = "TOTAL = R$ 684.54";
    test(input, output, false);
  }

}
