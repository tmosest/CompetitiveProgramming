package com.tmosest.competitiveprogramming.hackerrank.woc.week1;

import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("woc1")
@Tag("medium")
@DisplayName("HackerRank WOC Week 1: Volley Ball Match")
public class VolleyBallMatchTest {
  String input;
  long output;
  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   */
  private static void test(String input, long output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    VolleyBallMatch.debugMode = debugMode;
    Assertions.assertEquals(output, VolleyBallMatch.solve());
  }

  @Test
  @DisplayName("Lazy Permutation With Repetition Test")
  void lazyPermutationTest0() {
    long result = 3276;
    long a = 3;
    long b = 25;
    Assertions.assertEquals(result, VolleyBallMatch.computeLazyPermutationWithRepetition(a, b));
  }

  @Test
  @DisplayName("Lazy Permutation With Repetition Test for 1")
  void lazyPermutationTest1() {
    long result = 1;
    long a = 0;
    long b = 25;
    Assertions.assertEquals(result, VolleyBallMatch.computeLazyPermutationWithRepetition(a, b));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    input = "3\n25";
    output = 2925;
    test(input, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() throws UnsupportedEncodingException {
    input = "24\n17";
    output = 0;
    test(input, output, false);
  }
}
