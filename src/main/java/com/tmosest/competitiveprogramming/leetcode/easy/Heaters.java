package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class Heaters {
  /* Write code here. */

  /**
   * Determine the radius needed from heaters to cover all houses.
   *
   * @param houses The houses.
   * @param heaters The heaters.
   * @return Standard radius of the heaters.
   */
  public int findRadius(int[] houses, int[] heaters) {
    Arrays.sort(houses);
    Arrays.sort(heaters);
    int radius = 0;
    int currentHouse = 0;
    int currentHeater = 0;

    // slidng window, centered around the heater
    while (currentHouse != houses.length) {
      // house in the range, pass it
      if (houses[currentHouse] <= radius + heaters[currentHeater]
          && houses[currentHouse] >= -radius + heaters[currentHeater]) {
        currentHouse++;
        continue;
      }

      // house not in the range, check if next heater could do better than current
      while ((currentHeater != heaters.length - 1)
          && (Math.abs(heaters[currentHeater + 1] - houses[currentHouse])
          <= Math.abs(heaters[currentHeater] - houses[currentHouse]))) {
        currentHeater++;
      }
      radius = Math.max(radius, Math.abs(heaters[currentHeater] - houses[currentHouse]));
      currentHouse++;
    }

    return radius;
  }


}
