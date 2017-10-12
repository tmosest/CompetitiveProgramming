package hackerrank.implementation.tests;

import org.junit.Test;
import hackerrank.implementation.QueensAttackII;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;

public class QueensAttackIITest {

  static int answer;

  static BufferedReader out = null;

  static InputStream testInput;

  static String data;
  static String filePrefix = "hackerrank/implementation/tests/data/QueensAttackII/";

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
    data = "4 0\n4 4";
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertEquals(9, QueensAttackII.handleInputs());
  }

  @Test
  public void testCase1() throws UnsupportedEncodingException {
    data = "5 3\n4 3\n5 5\n4 2\n2 3\n";
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertEquals(10, QueensAttackII.handleInputs());
  }

  @Test
  public void testCase6() throws NumberFormatException, IOException {
    // Test it!
    QueensAttackII.debugMode = false;
    testFromFile(6);
    Assert.assertEquals(answer, QueensAttackII.handleInputs());
  }

  @Test
  public void testCase17() throws NumberFormatException, IOException {
    // Test it!
    QueensAttackII.debugMode = false;
    testFromFile(17);
    Assert.assertEquals(answer, QueensAttackII.handleInputs());
  }
}
