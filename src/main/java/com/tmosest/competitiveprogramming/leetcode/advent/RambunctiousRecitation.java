package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class RambunctiousRecitation {

  long getNumberAtSpot(String input, int index) {
    List<Integer> numbers = Arrays.stream(input.split(","))
        .map(Integer::valueOf)
        .collect(Collectors.toList());

    int currentIndex = 0;
    int currentValue = numbers.get(0);
    Map<Integer, List<Integer>> lastSpokenIndex = new HashMap<>();

    for (Integer number : numbers) {
      currentValue = number;
      List<Integer> list = lastSpokenIndex.getOrDefault(currentValue, new ArrayList<>());
      list.add(currentIndex++);
      lastSpokenIndex.put(currentValue, list);
    }

    while (currentIndex < index) {
      List<Integer> previousIndexesList = lastSpokenIndex
          .getOrDefault(currentValue, new ArrayList<>());
      if (previousIndexesList != null && previousIndexesList.size() <= 1) {
        currentValue = 0;
      } else {
        currentValue = previousIndexesList.get(previousIndexesList.size() - 1) - previousIndexesList
            .get(previousIndexesList.size() - 2);
      }
      List<Integer> currentIndexesList = lastSpokenIndex
          .getOrDefault(currentValue, new ArrayList<>());
      currentIndexesList.add(currentIndex++);
      lastSpokenIndex.put(currentValue, currentIndexesList);
    }

    return currentValue;
  }
}
