package com.tmosest.competitiveprogramming.hackerrank.recursion;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.hackerrank.HackerrankUtil;

@DisplayName("Hackerrank Recursion: Crossword Puzzle")
class CrosswordPuzzleTest {

  String data;
  String output;

  private static void testData(String input, String output, boolean debugMode)
      throws UnsupportedEncodingException {
    HackerrankUtil.setSystemIn(input);
    CrosswordPuzzle.debugMode = debugMode;
    Assertions.assertEquals(output, CrosswordPuzzle.solve());
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() throws UnsupportedEncodingException {
    data = "+-++++++++\n" + "+-++++++++\n" + "+-++++++++\n" + "+-----++++\n" + "+-+++-++++\n"
        + "+-+++-++++\n" + "+++++-++++\n" + "++------++\n" + "+++++-++++\n" + "+++++-++++\n"
        + "LONDON;DELHI;ICELAND;ANKARA";
    output = "+L++++++++\n" + "+O++++++++\n" + "+N++++++++\n" + "+DELHI++++\n" + "+O+++C++++\n"
        + "+N+++E++++\n" + "+++++L++++\n" + "++ANKARA++\n" + "+++++N++++\n" + "+++++D++++";
    testData(data, output, false);
  }

  @Test
  @DisplayName("Test Case 1")
  public void testCase1() throws UnsupportedEncodingException {
    data = "+-++++++++\n" + "+-++++++++\n" + "+-------++\n" + "+-++++++++\n" + "+-++++++++\n"
        + "+------+++\n" + "+-+++-++++\n" + "+++++-++++\n" + "+++++-++++\n" + "++++++++++\n"
        + "AGRA;NORWAY;ENGLAND;GWALIOR";
    output = "+E++++++++\n" + "+N++++++++\n" + "+GWALIOR++\n" + "+L++++++++\n" + "+A++++++++\n"
        + "+NORWAY+++\n" + "+D+++G++++\n" + "+++++R++++\n" + "+++++A++++\n" + "++++++++++";
    testData(data, output, false);
  }

  @Test
  @DisplayName("Test Case 2")
  public void testCase2() throws UnsupportedEncodingException {
    data = "+-++++++++\n" + "+-++-+++++\n" + "+-------++\n" + "+-++-+++++\n" + "+-++-+++++\n"
        + "+-++-+++++\n" + "++++-+++++\n" + "++++-+++++\n" + "++++++++++\n" + "----------\n"
        + "CALIFORNIA;NIGERIA;CANADA;TELAVIV";
    output = "+C++++++++\n" + "+A++T+++++\n" + "+NIGERIA++\n" + "+A++L+++++\n" + "+D++A+++++\n"
        + "+A++V+++++\n" + "++++I+++++\n" + "++++V+++++\n" + "++++++++++\n" + "CALIFORNIA";
    testData(data, output, false);
  }

  @Test
  @DisplayName("Test Case 3")
  public void testCase3() throws UnsupportedEncodingException {
    data = "+-++++++++\n" + "+-++-+++++\n" + "+-------++\n" + "+-++-++-++\n" + "+-++-++-++\n"
        + "+-++-++-++\n" + "++++-++-++\n" + "+--------+\n" + "++++++++++\n" + "----------\n"
        + "CALIFORNIA;LASVEGAS;NIGERIA;CANADA;TELAVIV;ALASKA";
    output = "+C++++++++\n" + "+A++T+++++\n" + "+NIGERIA++\n" + "+A++L++L++\n" + "+D++A++A++\n"
        + "+A++V++S++\n" + "++++I++K++\n" + "+LASVEGAS+\n" + "++++++++++\n" + "CALIFORNIA";
    testData(data, output, false);
  }

  @Test
  @DisplayName("Test Case 5")
  public void testCase5() throws UnsupportedEncodingException {
    data = "+----+++++\n" + "++++-+++++\n" + "++++-+++++\n" + "++++------\n" + "++++-+++-+\n"
        + "++++-+++-+\n" + "++++-+++-+\n" + "++++-+++-+\n" + "++++-+++++\n" + "++++++++++\n"
        + "TREE;ELEPHANTS;PICKLE;LEMON";
    output = "+TREE+++++\n" + "++++L+++++\n" + "++++E+++++\n" + "++++PICKLE\n" + "++++H+++E+\n"
        + "++++A+++M+\n" + "++++N+++O+\n" + "++++T+++N+\n" + "++++S+++++\n" + "++++++++++";
    testData(data, output, false);
  }
}
