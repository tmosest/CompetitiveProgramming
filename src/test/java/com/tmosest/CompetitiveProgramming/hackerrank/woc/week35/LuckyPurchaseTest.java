package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank WOC Week 35: Lucky Purchase")
class LuckyPurchaseTest {

  String input;
  String output;
  
  /**
   * Utility Function to actually test the class. Sets the input stream to the input data.
   * 
   * @param input
   * @param output
   * @param debugMode
   * @throws UnsupportedEncodingException
   */
  private static void test(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    LuckyPurchase.debugMode = debugMode;
    Assertions.assertEquals(output, LuckyPurchase.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void test() throws UnsupportedEncodingException {
    input = "4\nHackerBook 777444\nRankBook 3\nTheBook 777\nBestBook 47";
    output = "BestBook";
    test(input, output, false);
  }

}
