package com.tmosest.competitiveprogramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumsBruteForceTest {

  ThreeSumsBruteForce threesum = new ThreeSumsBruteForce();

  /**
   * Test data from Princeton Video about it.
   */
  @Test
  public void testCase0() {
    int[] testData = {30, -40, -20, -10, 40, 0, 10, 5,};
    Assertions.assertEquals(4, threesum.count(testData));
  }

}
