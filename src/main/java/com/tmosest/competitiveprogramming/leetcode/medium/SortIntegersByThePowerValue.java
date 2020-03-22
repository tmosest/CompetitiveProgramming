package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SortIntegersByThePowerValue {

  private static Map<Integer, Integer> cache = new HashMap<>();

  private static int computePower(int num) {
    int count = 0;
    int org = num;

    while (num != 1) {

      if (cache.containsKey(num)) {
        int val = cache.get(num) + count;
        cache.put(org, val);
        return val;
      }

      ++count;
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num = 3 * num + 1;
      }
    }

    cache.put(org, count);
    return count;
  }

  int getKth(int lo, int hi, int index) {
    List<PowerNumber> powerNumbers = new ArrayList<>();
    for (int i = hi; i >= lo; i--) {
      powerNumbers.add(new PowerNumber(i));
    }
    Collections.sort(powerNumbers);
    return powerNumbers.get(index - 1).num;
  }

  private static class PowerNumber implements Comparable<PowerNumber> {

    private final int num;
    private final int count;

    private PowerNumber(int num) {
      this.num = num;
      this.count = computePower(num);
    }

    @Override
    public int compareTo(PowerNumber other) {
      int start = Integer.compare(this.count, other.count);
      if (start != 0) {
        return start;
      }
      return Integer.compare(this.num, other.num);
    }
  }
}
