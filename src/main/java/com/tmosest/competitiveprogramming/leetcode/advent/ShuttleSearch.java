package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.Arrays;
import java.util.List;

class ShuttleSearch {

  long getDiffTimesBusId(List<String> lines) {
    int time = Integer.valueOf(lines.get(0));
    String[] buses = lines.get(1).split(",");
    return Arrays.stream(buses)
        .filter(str -> !str.contains("x"))
        .map(str -> new BusStop(str, time))
        .reduce((busOne, busTwo) -> {
          if (busOne.getNextTime() < busTwo.getNextTime()) {
            return busOne;
          }
          return busTwo;
        }).map(bus -> {
          long diff = bus.getNextTime() - time;
          return diff * bus.getId();
        })
        .orElse(-1L);
  }

  private static class BusStop {

    private int id;
    private long nextAvailableTime;

    private BusStop(String id, long time) {
      this.id = Integer.valueOf(id);
      updateTime(time);
    }

    private void updateTime(long time) {
      nextAvailableTime = 0;
      while (nextAvailableTime < time) {
        nextAvailableTime += this.id;
      }
    }

    private int getId() {
      return id;
    }

    private long getNextTime() {
      return nextAvailableTime;
    }
  }
}
