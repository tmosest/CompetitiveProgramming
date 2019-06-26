package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class RepeatedDnaSequences {

  /**
   * Determine the number of repeated 10-letter DNA sequences.
   *
   * @param str The string of DNA characters.
   * @return A list of dupes that are 10 letters long.
   */
  public List<String> findRepeatedDnaSequences(String str) {
    HashMap<String, Integer> mapCount = new HashMap<>();
    List<String> result = new LinkedList<>();
    int left = 0;
    int right = left + 1;
    int counter = 1;
    while (right < str.length()) {
      right += 1;
      counter += 1;
      while (counter == 10) {
        String temp = str.substring(left, right);
        mapCount.putIfAbsent(temp, 0);
        mapCount.put(temp, mapCount.get(temp) + 1);
        counter -= 1;
        left += 1;
      }
    }
    for (Map.Entry<String, Integer> entry : mapCount.entrySet()) {
      if (entry.getValue() > 1) {
        result.add(entry.getKey());
      }
    }
    return result;
  }
}
