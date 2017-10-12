package implementation.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.JumpingOnTheCloudsRevisited;

public class JumpingOnTheCloudsRevisitedTest {

  @Test
  public void test() {
    int[] clouds = {0, 0, 1, 0, 0, 1, 1, 0,};
    int jumpSize = 2;
    Assert.assertEquals(92, JumpingOnTheCloudsRevisited.energyLeft(clouds, jumpSize));
  }

}
