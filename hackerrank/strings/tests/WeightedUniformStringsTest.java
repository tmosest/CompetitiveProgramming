package hackerrank.strings.tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;
import hackerrank.strings.WeightedUniformStrings;

public class WeightedUniformStringsTest {

  static InputStream testInput;
  static String data;

  @Test
  public void testCase0() throws UnsupportedEncodingException {
    String data = "abccddde\n6\n1\n3\n12\n5\n9\n10";
    String answers[] = {"Yes", "Yes", "Yes", "Yes", "No", "No"};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    WeightedUniformStrings.debugMode = false;
    Assert.assertArrayEquals(answers, WeightedUniformStrings.solve());
  }

}
