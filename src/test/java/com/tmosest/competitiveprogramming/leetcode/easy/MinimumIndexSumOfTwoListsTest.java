package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 599. Minimum Index Sum of Two Lists")
class MinimumIndexSumOfTwoListsTest {
	/* Write code here. */

  MinimumIndexSumOfTwoLists minimumIndexSumOfTwoLists = new MinimumIndexSumOfTwoLists();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] list1 = {
        "Shogun", "Tapioca Express", "Burger King", "KFC"
    };
    String[] list2 = {
        "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"
    };
    String[] expected = {
        "Shogun"
    };
    Assertions.assertArrayEquals(expected, minimumIndexSumOfTwoLists.findRestaurant(list1, list2));
  }


}
