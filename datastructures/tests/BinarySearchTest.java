package datastructures.tests;

import org.junit.Assert;
import org.junit.Test;
import datastructures.implementations.BinarySearch;

public class BinarySearchTest {

  @Test
  public void testCase0() {
    int[] array = {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97};

    BinarySearch binarySearch = new BinarySearch(array);

    Assert.assertEquals(0, binarySearch.search(6));
    Assert.assertEquals(3, binarySearch.search(25));
    Assert.assertEquals(array.length - 4, binarySearch.search(93));
    Assert.assertEquals(array.length - 1, binarySearch.search(97));
    Assert.assertEquals(- 1, binarySearch.search(100));
  }

}
