package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.io.IOException;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Binary Search: Round Table Meeting")
class RoundTableMeetingTest {

  public static void test(String input, int[] output, boolean debugMode) throws IOException {
    HackerrankUtil.setSystemIn(input);
    RoundTableMeeting.debugMode = debugMode;
    Assert.assertArrayEquals(output, RoundTableMeeting.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws IOException {
    String input = "10 4 \n" + "7 1 4 3 1 6 4 2 5 1 \n" + "3 4 \n" + "1 2\n" + "2 7\n" + "6 7";
    int[] output = {0, 1, 1, 2};
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws IOException {
    String input = "5 10\n" + "5 5 4 1 2\n" + "4 5\n" + "5 1\n" + "2 5\n" + "1 4\n" + "1 5\n"
        + "5 5\n" + "1 5\n" + "1 2\n" + "1 2\n" + "1 1";
    int[] output = {0, 1, 0, 0, 1, 0, 1, 0, 0, 0};
    test(input, output, false);
  }
}
