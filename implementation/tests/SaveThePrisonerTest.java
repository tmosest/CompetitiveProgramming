package implementation.tests;

import org.junit.Test;
import implementation.SaveThePrisoner;
import org.junit.Assert;

public class SaveThePrisonerTest {

  @Test
  public void test() {
    int[] test0 = {5, 2, 1,};
    Assert.assertEquals(2, SaveThePrisoner.saveThePrisoner(test0[0], test0[1], test0[2]));
    int[] test1 = {5, 2, 2,};
    Assert.assertEquals(3, SaveThePrisoner.saveThePrisoner(test1[0], test1[1], test1[2]));
  }

}
