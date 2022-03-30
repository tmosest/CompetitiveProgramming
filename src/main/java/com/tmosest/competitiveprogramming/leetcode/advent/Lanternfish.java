package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Lanternfish {

  // This works for part one but appears to be too slow for too many days.
  long countFish(List<String> input, int days) {
    List<Fish> fishPool = Arrays.stream(input.get(0).split(","))
        .mapToInt(Integer::parseInt)
        .mapToObj(Fish::new)
        .collect(Collectors.toList());

    for (int i = 0; i < days; i++) {
      List<Fish> nextFishPool = new ArrayList<>();
      for (Fish fish : fishPool) {
        nextFishPool.add(fish);
        if (fish.incrementDayAndReturnIsReproduction()) {
          nextFishPool.add(new Fish());
        }
      }
      fishPool = nextFishPool;
    }
    return fishPool.size();
  }

  private static class Fish {

    private int daysToReproduce;

    private Fish() {
      daysToReproduce = 8;
    }

    private Fish(int daysToReproduce) {
      this.daysToReproduce = daysToReproduce;
    }

    private boolean incrementDayAndReturnIsReproduction() {
      if (daysToReproduce == 0) {
        // go ahead and reset to 7 and ignore 0.
        daysToReproduce = 6;
        return true;
      }
      --daysToReproduce;
      return false;
    }
  }
}
