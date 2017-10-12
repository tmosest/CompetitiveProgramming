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
  
  BufferedReader out = null;

  @Test
  public void testCase0() throws UnsupportedEncodingException {
    String data = "4 0\n4 4";
    InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertEquals(9, QueensAttackII.handleInputs());
  }

  @Test
  public void testCase1() throws UnsupportedEncodingException {
    String data = "5 3\n4 3\n5 5\n4 2\n2 3\n";
    InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertEquals(10, QueensAttackII.handleInputs());
  }
  
  @Test
  public void testCase17() throws NumberFormatException, IOException {
    File inputFile = new File("implementation/tests/data/QueensAttackII/input17.txt");
    File outputFile = new File("implementation/tests/data/QueensAttackII/output17.txt");
    out = new BufferedReader(new FileReader(outputFile));
    int answer = Integer.parseInt(out.readLine());
    InputStream testInput = new FileInputStream(inputFile);
    System.setIn(testInput);
    Assert.assertEquals(answer, QueensAttackII.handleInputs());
  }
}
