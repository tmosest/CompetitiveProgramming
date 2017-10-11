package _data_structures.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import _data_structures.implementations.ThreeSumsBruteForce;
import junit.framework.Assert;

public class ThreeSumsBruteForceTest {

  ThreeSumsBruteForce threesum = new ThreeSumsBruteForce();

  /**
   * Test data from Princeton Video about it.
   */
  @Test
  public void testCase0() {
    int[] testData = {30, -40, -20, -10, 40, 0, 10, 5,};
    Assert.assertEquals(4, threesum.count(testData));
  }

}
