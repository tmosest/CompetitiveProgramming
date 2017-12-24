package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.io.IOException;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Binary Search: The Soap Mystery")
class TheSoapMysteryTest {

  public static void test(String input, int[] output, boolean debugMode) throws IOException {
    HackerrankUtil.setSystemIn(input);
    TheSoapMystery.debugMode = debugMode;
    Assert.assertArrayEquals(output, TheSoapMystery.solve());
  }
  
  @Test
  @DisplayName("Test Case 0")
  void test() throws IOException {
    String input = "5\n" + "1 4 10 5 6\n" + "4\n" + "2\n" + "3\n" + "5\n" + "11";
    int[] output = {1, 1, 2, 5};
    test(input, output, false);
  }

}
