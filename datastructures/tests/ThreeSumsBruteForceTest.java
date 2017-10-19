package datastructures.tests;

import org.junit.Assert;
import org.junit.Test;
import commons.StopWatch;
import datastructures.implementations.ThreeSumsBruteForce;

public class ThreeSumsBruteForceTest {

  ThreeSumsBruteForce threesum = new ThreeSumsBruteForce();
  StopWatch sw = new StopWatch();

  /**
   * Test data from Princeton Video about it.
   */
  @Test
  public void testCase0() {
    int[] testData = {30, -40, -20, -10, 40, 0, 10, 5,};
    sw.start();
    Assert.assertEquals(4, threesum.count(testData));
    sw.stop();
    System.out.println(sw.getElapsedTime());
  }

}
