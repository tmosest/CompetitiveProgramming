package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class AvoidFloodInTheCity {

  int[] avoidFlood(int[] rains) {
    // this map stores last day when it rained over lake
    Map<Integer, Integer> fullLakeLastDay = new HashMap<>();
    // contains set of dry days on which no lake has been dried yet
    TreeSet<Integer> dryDays = new TreeSet<>();
    int[] result = new int[rains.length];
    Arrays.fill(result, -1);
    for (int i = 0; i < rains.length; i++) {
      int rain = rains[i];
      if (rain == 0) {
        // dry day, put it into dry day set
        dryDays.add(i);
      } else {
        if (fullLakeLastDay.containsKey(rain)) {
          // get first dry day after last day it rained over lake
          Integer dryDayToEmptyLake = dryDays.ceiling(fullLakeLastDay.get(rain));
          if (dryDayToEmptyLake == null) {
            // no dry day so there is no way to empty lake which is already filled
            return new int[0];
          } else {
            // found the dry day, empty the lake on that dry day
            dryDays.remove(dryDayToEmptyLake);
            result[dryDayToEmptyLake] = rain;
          }
        }
        // now fill the lake again
        fullLakeLastDay.put(rain, i);
      }
    }
    for (Integer dryDay : dryDays) {
      result[dryDay] = 1;
    }
    return result;
  }
}
