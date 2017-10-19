package hackerrank.strings.tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;
import hackerrank.strings.SeparateTheNumbers;

public class SeparateTheNumbersTest {

  static InputStream testInput;
  static String data;

  @Test
  public void testCase0() throws UnsupportedEncodingException {
    data = "7\n1234\n91011\n99100\n101103\n010203\n13\n1";
    String[][] answers = {{"YES", "1"}, {"YES", "9"}, {"YES", "99"}, {"NO", "-1"}, {"NO", "-1"},
        {"NO", "-1"}, {"NO", "-1"}};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    SeparateTheNumbers.debugMode = true;
    Assert.assertArrayEquals(answers, SeparateTheNumbers.solve());
  }

  @Test
  public void testCase2() throws UnsupportedEncodingException {
    data = "10\n" + "00000000000000000000000000000000\n" + "11111111111111111111111111111111\n"
        + "22222222222222222222222222222222\n" + "33333333333333333333333333333333\n"
        + "44444444444444444444444444444444\n" + "55555555555555555555555555555555\n"
        + "66666666666666666666666666666666\n" + "77777777777777777777777777777777\n"
        + "88888888888888888888888888888888\n" + "10001001100210031004100510061007";
    String[][] answers = {{"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"},
        {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"YES", "1000"}};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    SeparateTheNumbers.debugMode = false;
    Assert.assertArrayEquals(answers, SeparateTheNumbers.solve());
  }

  @Test
  public void testCase3() throws UnsupportedEncodingException {
    data = "10\n" + "1234567891011121314151617181920\n" + "5678910111213141516171819202122\n"
        + "9101112131415161718192021222324\n" + "979899100101102103104105106107\n"
        + "998999100010011002100310041005\n" + "1234567891011120314151617181920\n"
        + "5678910111213140516171819202122\n" + "9101112131415160718192021222324\n"
        + "979899100101102003104105106107\n" + "998999100010011902100310041005";
    String[][] answers = {{"YES", "1"}, {"YES", "5"}, {"YES", "9"}, {"YES", "97"}, {"YES", "998"},
        {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"},};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    SeparateTheNumbers.debugMode = false;
    Assert.assertArrayEquals(answers, SeparateTheNumbers.solve());
  }

  @Test
  public void testCase20() throws UnsupportedEncodingException {
    data = "10\n" + "429496729542949672964294967297\n" + "429496729542949672964294967296\n"
        + "429496729542949672964294967287\n" + "429496729542949672964294967197\n"
        + "42949672954294967296429496729\n" + "4294967295429496729642949672\n"
        + "429496729500000000000000000001\n" + "42949672950123456789\n"
        + "4294967295000010020030000456789\n" + "4294967295000102003004005";
    String[][] answers = {{"YES", "4294967295"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"},
        {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"}, {"NO", "-1"},};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    SeparateTheNumbers.debugMode = false;
    Assert.assertArrayEquals(answers, SeparateTheNumbers.solve());
  }
}
