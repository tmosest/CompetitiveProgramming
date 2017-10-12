package implementation.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.UtopianTree;

public class UtopianTreeTest {

  @Test
  public void testCase0() {
    Assert.assertEquals(1, UtopianTree.treeHeight(0));
    Assert.assertEquals(2, UtopianTree.treeHeight(1));
    Assert.assertEquals(7, UtopianTree.treeHeight(4));
  }

}
