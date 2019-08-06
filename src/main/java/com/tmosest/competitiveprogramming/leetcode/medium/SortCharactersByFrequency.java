package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class SortCharactersByFrequency {

  /**
   * Sorts the characters based on their counts.
   *
   * @param str The string to sort.
   * @return The string sorted by count.
   */
  String frequencySort(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    StringBuilder res = new StringBuilder();
    for (char ch : str.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    Map<Character, Integer> sortedMap =
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));

    Object[] arr = sortedMap.keySet().toArray();
    for (int i = arr.length - 1; i >= 0; i--) {
      int size = map.get(arr[i]);
      while (size > 0) {
        res.append(arr[i]);
        size--;
      }
    }
    return res.toString();
  }
}
