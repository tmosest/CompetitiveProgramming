package implementations.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.SequenceEquation;

public class SequenceEquationTest {

  @Test
  public void test() {
    int[] sequence = {2, 3, 1,};
    Assert.assertEquals(2, SequenceEquation.findPofP(sequence, 1));
    Assert.assertEquals(3, SequenceEquation.findPofP(sequence, 2));
    Assert.assertEquals(1, SequenceEquation.findPofP(sequence, 3));
  }

}
