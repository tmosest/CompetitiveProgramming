package implementations.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.DesignerPdfViewer;

public class DesignerPdfViewerTest {

  @Test
  public void testCase0() {
    int[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,};
    String word = "abc";
    Assert.assertEquals(9, DesignerPdfViewer.highligherArea(heights, word));
  }

  @Test
  public void testCase1() {
    int[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7,};
    String word = "zaba";
    Assert.assertEquals(28, DesignerPdfViewer.highligherArea(heights, word));
  }


}
