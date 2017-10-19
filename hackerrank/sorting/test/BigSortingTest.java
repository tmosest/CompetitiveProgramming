package hackerrank.sorting.test;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;
import hackerrank.sorting.BigSorting;

public class BigSortingTest {

  static InputStream testInput;
  static String data;
  static String answer;

  @Test
  public void test() throws UnsupportedEncodingException {
    data = "6\n" + "31415926535897932384626433832795\n" + "1\n" + "3\n" + "10\n" + "3\n" + "5";
    answer = "1\n" + "3\n" + "3\n" + "5\n" + "10\n" + "31415926535897932384626433832795";
    BigInteger[] answers =
        {new BigInteger("1"), new BigInteger("3"), new BigInteger("3"), new BigInteger("5"),
            new BigInteger("10"), new BigInteger("31415926535897932384626433832795")};
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
    Assert.assertArrayEquals(answers, BigSorting.solve());
  }

}
