package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class ReconstructOriginalDigitsFromEnglish {

  private static final String[] WORDS =
      {"zero", "one", "two", "three", "four", "five", "six",
          "seven", "eight",
          "nine"};

  private static final char[] LETTERS =
      {'z', 'o', 'w', 't', 'u', 'f', 'x', 's', 'g', 'i'};

  String originalDigits(String str) {
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    Map<Character, Integer> count = new HashMap<>();
    for (char c : str.toCharArray()) {
      count.put(c, count.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < LETTERS.length; i += 2) {
      fillInTreeMap(WORDS, LETTERS, treeMap, count, i);
    }

    for (int i = 1; i < LETTERS.length; i += 2) {
      fillInTreeMap(WORDS, LETTERS, treeMap, count, i);
    }

    StringBuilder sb = new StringBuilder();
    for (Integer k : treeMap.keySet()) {
      for (int i = 0; i < treeMap.get(k); i++) {
        sb.append(k);
      }
    }

    return sb.toString();
  }

  private void fillInTreeMap(String[] words,
      char[] letters,
      TreeMap<Integer, Integer> treeMap,
      Map<Character, Integer> count,
      int index
  ) {
    if (count.containsKey(letters[index])) {
      int val = count.get(letters[index]);
      treeMap.put(index, val);
      for (char c : words[index].toCharArray()) {
        count.put(c, count.get(c) - val);
        if (count.get(c) <= 0) {
          count.remove(c);
        }
      }
    }
  }
}
