package com.tmosest.competitiveprogramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Data Structures: Binary Search Test")
public class BinarySearchTest {

  
  @Test
  @DisplayName("Simple Binary Search Test")
  public void testCase0() {
    int[] array = {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97};

    BinarySearch binarySearch = new BinarySearch(array);

    Assertions.assertEquals(0, binarySearch.search(6));
    Assertions.assertEquals(3, binarySearch.search(25));
    Assertions.assertEquals(array.length - 4, binarySearch.search(93));
    Assertions.assertEquals(array.length - 1, binarySearch.search(97));
    Assertions.assertEquals(- 1, binarySearch.search(100));
  }

}
