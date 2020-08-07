package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FilterRestaurantsByVeganfriendlyPriceAndDistance {

  List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice,
      int maxDistance) {
    return Arrays.stream(restaurants)
        .filter(resturant -> filterRestaurant(resturant, veganFriendly, maxPrice, maxDistance))
        .sorted((restOne, restTwo) -> {
          int ratingCheck = Integer.compare(restTwo[1], restOne[1]);
          if (ratingCheck == 0) {
            return Integer.compare(restTwo[0], restOne[0]);
          }
          return ratingCheck;
        })
        .map(rest -> rest[0])
        .collect(Collectors.toList());
  }

  private boolean filterRestaurant(int[] resturant, int veganFriendly, int maxPrice,
      int maxDistance) {
    if (veganFriendly == 1 && resturant[2] != 1) {
      return false;
    }

    return resturant[3] <= maxPrice && resturant[4] <= maxDistance;
  }
}
