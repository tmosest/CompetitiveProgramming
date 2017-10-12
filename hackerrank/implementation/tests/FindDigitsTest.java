package hackerrank.implementation.tests;

import org.junit.Test;
import hackerrank.implementation.FindDigits;
import org.junit.Assert;

public class FindDigitsTest {

  @Test
  public void test() {
    Assert.assertEquals(2, FindDigits.countDivisibleDigits("12"));
    Assert.assertEquals(3, FindDigits.countDivisibleDigits("1012"));
  }

}
