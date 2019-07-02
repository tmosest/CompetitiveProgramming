package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1105. Filling Bookcase Shelves")
class FillingBookcaseShelvesTest {

  private FillingBookcaseShelves fillingBookcaseShelves = new FillingBookcaseShelves();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] books = {{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}};
    Assertions.assertEquals(6, fillingBookcaseShelves.minHeightShelves(books, 4));
  }
}
