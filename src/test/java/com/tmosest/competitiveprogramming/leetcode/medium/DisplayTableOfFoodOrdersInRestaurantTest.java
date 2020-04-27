package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc185")
@DisplayName("LeetCode: 1418. Display Table of Food Orders in a Restaurant")
class DisplayTableOfFoodOrdersInRestaurantTest {

  private DisplayTableOfFoodOrdersInRestaurant displayTableOfFoodOrdersInRestaurant =
      new DisplayTableOfFoodOrdersInRestaurant();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        MatrixListAdapter.toList(new String[][]
            {{"Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"},
                {"3", "0", "2", "1", "0"}, {"5", "0", "1", "0", "1"}, {"10", "1", "0", "0", "0"}}),
        displayTableOfFoodOrdersInRestaurant.displayTable(MatrixListAdapter.toList(new String[][]
            {{"David", "3", "Ceviche"}, {"Corina", "10", "Beef Burrito"},
                {"David", "3", "Fried Chicken"}, {"Carla", "5", "Water"}, {"Carla", "5", "Ceviche"},
                {"Rous", "3", "Ceviche"}}))
    );
  }
}
