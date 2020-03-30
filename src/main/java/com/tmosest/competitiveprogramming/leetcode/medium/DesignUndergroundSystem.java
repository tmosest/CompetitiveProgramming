package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DesignUndergroundSystem {

  private Map<Integer, Integer> startTimes;
  private Map<Integer, String> startLocation;
  private Map<String, List<Integer>> locationTimeDifferences;

  DesignUndergroundSystem() {
    startTimes = new HashMap<>();
    startLocation = new HashMap<>();
    locationTimeDifferences = new HashMap<>();
  }

  void checkIn(int id, String stationName, int time) {
    startTimes.put(id, time);
    startLocation.put(id, stationName);
  }

  void checkOut(int id, String stationName, int time) {
    String key = constructRouteName(startLocation.get(id), stationName);
    List<Integer> times = locationTimeDifferences.getOrDefault(key, new ArrayList<>());
    times.add(time - startTimes.get(id));
    locationTimeDifferences.put(key, times);
  }

  double getAverageTime(String startStation, String endStation) {
    return locationTimeDifferences
        .getOrDefault(constructRouteName(startStation, endStation), new ArrayList<>())
        .stream()
        .mapToDouble(Double::valueOf)
        .average()
        .orElse(Double.NaN);
  }

  private String constructRouteName(String startStation, String endStation) {
    return startStation + ":" + endStation;
  }
}
