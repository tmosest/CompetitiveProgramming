package com.tmosest.CompetitiveProgramming.spoj;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Sphere Online Judge: 1 Life, the Universe, and Everything")
class LifeTheUniverseAndEverythingTest {

  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    LifeTheUniverseAndEverything.debugMode = debugMode;
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    System.setOut(new java.io.PrintStream(out));
    LifeTheUniverseAndEverything.solve();
    Assertions.assertEquals(output, out.toString());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws UnsupportedEncodingException {
    String input = "1\n" + "2\n" + "88\n" + "42\n" + "99";
    String output = "1\n" + "2\n" + "88";
    test(input, output, false);
  }

}
