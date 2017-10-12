package hackerrank.implementation.tests;

import java.text.ParseException;
import org.junit.Assert;
import org.junit.Test;
import hackerrank.implementation.LibraryFine;

public class LibraryFineTest {

  @Test
  public void test() {
    try {
      Assert.assertEquals(45, LibraryFine.fine("9 6 2015", "6 6 2015"));
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  @Test
  public void test6() {
    try {
      Assert.assertEquals(10000, LibraryFine.fine("2 7 2015", "1 2 2014"));
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
