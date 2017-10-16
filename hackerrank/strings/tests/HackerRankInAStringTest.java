package hackerrank.strings.tests;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;
import hackerrank.strings.HackerRankInAString;

public class HackerRankInAStringTest {

  static InputStream testInput;
  static String data;

  @Test
  public void testCase0() throws UnsupportedEncodingException {
    data = "2\nhereiamstackerrank\nhackerworld";
    String[] answers = {"YES","NO"};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertArrayEquals(answers, HackerRankInAString.solve());
  }

}
