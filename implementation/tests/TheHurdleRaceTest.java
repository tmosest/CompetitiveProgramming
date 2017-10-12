package implementation.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.TheHurdleRace;

public class TheHurdleRaceTest {

  @Test
  public void testCase0() {
    int maxJump = 4;
    int[] fenceHeigths = {1, 6, 3, 5, 2,};
    Assert.assertEquals(2, TheHurdleRace.countBeanNeeded(maxJump, fenceHeigths));
  }
  
  @Test
  public void testCase1() {
    int maxJump = 7;
    int[] fenceHeigths = {2, 5, 4, 5, 2,};
    Assert.assertEquals(0, TheHurdleRace.countBeanNeeded(maxJump, fenceHeigths));
  }

}
