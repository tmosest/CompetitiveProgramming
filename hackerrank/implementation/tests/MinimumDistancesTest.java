package hackerrank.implementation.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;
import hackerrank.implementation.BeautifulTriplets;
import hackerrank.implementation.MinimumDistances;

public class MinimumDistancesTest {

  static int answer;

  static BufferedReader out = null;

  static InputStream testInput;

  static String data;
  static String filePrefix = "hackerrank/implementation/tests/data/MinimumDistances/";

  private static void testFromFile(int fileNumber) throws NumberFormatException, IOException {
    StringBuilder inputString = new StringBuilder();
    inputString.append(filePrefix);
    inputString.append("input");
    if (fileNumber < 10)
      inputString.append("0");
    inputString.append(fileNumber);
    inputString.append(".txt");
    StringBuilder outputString = new StringBuilder();
    outputString.append(filePrefix);
    outputString.append("output");
    if (fileNumber < 10)
      outputString.append("0");
    outputString.append(fileNumber);
    outputString.append(".txt");
    // Get files
    File inputFile = new File(inputString.toString());
    File outputFile = new File(outputString.toString());
    // Get Answer
    out = new BufferedReader(new FileReader(outputFile));
    answer = Integer.parseInt(out.readLine());
    // Set Input Stream from File
    testInput = new FileInputStream(inputFile);
    System.setIn(testInput);
  }

  @Test
  public void testCase0() throws UnsupportedEncodingException {
    data = "6\n7 1 3 4 1 7";
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    MinimumDistances.debugMode = false;
    Assert.assertEquals(3, MinimumDistances.solve());
  }

  @Test
  public void testCase1() throws UnsupportedEncodingException {
    data = "5\n1 2 3 4 10";
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    MinimumDistances.debugMode = false;
    Assert.assertEquals(-1, MinimumDistances.solve());
  }

  @Test
  public void testCase5() throws NumberFormatException, IOException {
    testFromFile(5);
    MinimumDistances.debugMode = false;
    Assert.assertEquals(1, MinimumDistances.solve());
  }
}
