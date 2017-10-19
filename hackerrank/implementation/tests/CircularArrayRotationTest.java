package hackerrank.implementation.tests;

import org.junit.Assert;
import org.junit.Test;
import hackerrank.implementation.CircularArrayRotation;

public class CircularArrayRotationTest {

  @Test
  public void test() {
    int[] array = {1, 2, 3,};
    int k = 2;
    int[] rotatedArray = {2, 3, 1};
    Assert.assertArrayEquals(rotatedArray, CircularArrayRotation.rotatedArray(array, k));
  }

}