package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EncodingError {

  static int PRE_AMBLE = 25;

  private Map<Long, Integer> numberCount;
  private int current;
  private int toRemove;


  EncodingError() {
    this.numberCount = new HashMap<>();
  }

  private void setup(List<Long> numbers) {
    numberCount = new HashMap<>();
    current = 0;
    toRemove = 0;
    while (current < PRE_AMBLE) {
      long number = numbers.get(current++);
      int count = numberCount.getOrDefault(number, 0) + 1;
      numberCount.put(number, count);
    }
  }

  private boolean isValid(long number) {
    return numberCount.entrySet().stream()
        .filter(entry -> {
          if (entry.getValue() <= 0) {
            return false;
          }
          long diff = number - entry.getKey();
          int req = (diff != entry.getKey()) ? 1 : 2;
          return numberCount.getOrDefault(diff, 0) >= req;
        }).count() > 0;
  }

  long firstInvalidNumber(List<Long> numbers) {
    setup(numbers);
    long firstInvalid = -1;

    while (current < numbers.size()) {
      long number = numbers.get(current++);
      if (!isValid(number)) {
        return number;
      }
      int count = numberCount.getOrDefault(number, 0) + 1;
      numberCount.put(number, count);

      long remove = numbers.get(toRemove++);
      count = numberCount.getOrDefault(remove, 1) - 1;
      numberCount.put(remove, count);
    }

    return firstInvalid;
  }

  long findSumOfInvalidNumbersContigousEnds(List<Long> numbers) {
    long invalid = firstInvalidNumber(numbers);

    int low = 0;
    int high = 0;

    int runningSum = 0;

    while (low < numbers.size()) {
      if (runningSum < invalid) {
        runningSum += numbers.get(high++);
      } else if (runningSum > invalid) {
        runningSum -= numbers.get(low++);
      } else {
        break;
      }
    }

    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;

    for (int i = low; i < high; i++) {
      max = Math.max(max, numbers.get(i));
      min = Math.min(min, numbers.get(i));
    }

    return min + max;
  }
}
