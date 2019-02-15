package com.tmosest.competitiveprogramming.leetcode;

public class CanPlaceFlowers {

  /**
   * Determine if we can plant new flowers.
   * @param flowerbed Array of plant placements.
   * @param newPlants Number of new plants.
   * @return True if we can plant the new plants.
   */
  public boolean canPlaceFlowers(int[] flowerbed, int newPlants) {
    int index = 0;
    int count = 0;
    while (index < flowerbed.length) {
      if (flowerbed[index] == 0
          && (index == 0
          || flowerbed[index - 1] == 0)
          && (index == flowerbed.length - 1
          || flowerbed[index + 1] == 0)) {
        flowerbed[index] = 1;
        count++;
      }
      index++;
    }
    return count >= newPlants;
  }
}
