package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc173")
@DisplayName("LeetCode: 1333. Filter Restaurants by Vegan-Friendly, Price and Distance")
class FilterRestaurantsByVeganfriendlyPriceAndDistanceTest {

  private FilterRestaurantsByVeganfriendlyPriceAndDistance filterRestaurantsByVeganfriendlyPriceAndDistance =
      new FilterRestaurantsByVeganfriendlyPriceAndDistance();

  private void test(int[][] rests, int vegan, int maxPrice, int maxDistance, Integer[] res) {
    Assertions.assertArrayEquals(res,
        filterRestaurantsByVeganfriendlyPriceAndDistance.filterRestaurants(
            rests, vegan, maxPrice, maxDistance
        ).toArray(new Integer[0]));
  }

  @Test
  void testCase0() {
    test(
        new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3},
            {5, 1, 1, 15, 1}},
        1,
        50,
        10,
        new Integer[]{3, 1, 5}
    );
  }
}
