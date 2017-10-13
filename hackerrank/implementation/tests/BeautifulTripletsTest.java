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
import hackerrank.implementation.QueensAttackII;

public class BeautifulTripletsTest {

  static int answer;

  static BufferedReader out = null;

  static InputStream testInput;

  static String data;
  static String filePrefix = "hackerrank/implementation/tests/data/BeautifulTriplets/";
  
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
    data = "7 3\n1 2 4 5 7 8 10";
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertEquals(3, BeautifulTriplets.solve());
  }

  @Test 
  public void testCase1() throws NumberFormatException, IOException {
    BeautifulTriplets.debugMode = true;
    testFromFile(1);
    Assert.assertEquals(answer, BeautifulTriplets.solve());
  }
}
