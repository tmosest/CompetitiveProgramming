package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class RearrangeWordsInSentence {

  String arrangeWords(String text) {
    TreeMap<Integer, List<String>> map = new TreeMap<>();

    for (String str : text.split(" ")) {
      List<String> words = map.getOrDefault(str.length(), new ArrayList<>());
      words.add(str.toLowerCase());
      map.put(str.length(), words);
    }

    StringBuilder stringBuilder = new StringBuilder();

    for (Integer len : map.keySet()) {
      List<String> words = map.get(len);
      for (String word : words) {
        stringBuilder.append(word);
        stringBuilder.append(" ");
      }
    }

    stringBuilder.deleteCharAt(stringBuilder.length() - 1);

    char firstLetter = stringBuilder.charAt(0);
    stringBuilder.setCharAt(0, Character.toUpperCase(firstLetter));

    return stringBuilder.toString();
  }
}
