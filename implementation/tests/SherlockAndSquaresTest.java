package implementation.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.SherlockAndSquares;

public class SherlockAndSquaresTest {

  @Test
  public void testCase0() {
    Assert.assertEquals(2, SherlockAndSquares.countSquaresInclusive(3, 9));
    Assert.assertEquals(0, SherlockAndSquares.countSquaresInclusive(17, 24));
  }

}
