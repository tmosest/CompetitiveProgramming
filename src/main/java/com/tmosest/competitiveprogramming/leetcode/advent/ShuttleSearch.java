package com.tmosest.competitiveprogramming.leetcode.advent;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

  BigInteger getWinningLotteryTime(List<String> lines) {
    List<BusStop> busStops = Arrays.stream(lines.get(1).split(","))
        .map(str -> !str.contains("x") ? new BusStop(str, 0) : null).collect(
        Collectors.toList());

    BusStop firstBus = busStops.get(0);
    BigInteger time = BigInteger.valueOf((long) firstBus.getId());
    BigInteger increment = BigInteger.valueOf((long) firstBus.getId());

    while (true) {
      boolean shouldBreak = true;

      for (int i = 0; i < busStops.size(); i++) {
        BusStop current = busStops.get(i);
        if (current == null) {
          continue;
        }
        BigInteger timeNeeded = time.add(BigInteger.valueOf((long) i));
        if (!timeNeeded.mod(BigInteger.valueOf((long) current.getId())).equals(BigInteger.ZERO)) {
          shouldBreak = false;
          break;
        }
      }

      if (shouldBreak) {
        break;
      }

      time = time.add(increment);
    }

    return time;
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
