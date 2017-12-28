package com.tmosest.competitiveprogramming.hackerearth.algorithms.search.binarysearch;

import java.io.IOException;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Binary Search: Discover the Monk")
class DiscoverTheMonkTest {

  public static void test(String input, String[] output, boolean debugMode) throws IOException {
    HackerrankUtil.setSystemIn(input);
    DiscoverTheMonk.debugMode = debugMode;
    Assert.assertArrayEquals(output, DiscoverTheMonk.solve());
  }


  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws IOException {
    String input = "5 10\n" + "50 40 30 20 10\n" + "10\n" + "20\n" + "30\n" + "40\n" + "50\n"
        + "60\n" + "70\n" + "80\n" + "90\n" + "100";
    String[] output = {"YES", "YES", "YES", "YES", "YES", "NO", "NO", "NO", "NO", "NO"};
    test(input, output, false);
  }

}
