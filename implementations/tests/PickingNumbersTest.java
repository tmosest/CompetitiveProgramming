package implementations.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.PickingNumbers;

public class PickingNumbersTest {

  @Test
  public void test_example1() {
    int[] example1 = {4, 6, 5, 3, 3, 1,};
    Assert.assertEquals(3, PickingNumbers.countLargestSubsetWithDiffOfOne(example1));
  }

  @Test
  public void test_example2() {
    int[] example1 = {1, 2, 2, 3, 1, 2,};
    Assert.assertEquals(5, PickingNumbers.countLargestSubsetWithDiffOfOne(example1));
  }

}
