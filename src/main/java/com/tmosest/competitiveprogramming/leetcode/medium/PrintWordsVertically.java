package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PrintWordsVertically {

  List<String> printVertically(String str) {

    String[] array = str.split(" ");
    Map<Integer, StringBuilder> map = new HashMap<>();
    int limit = longestWord(array);

    for (int i = 0; i < limit; i++) {
      map.put(i, new StringBuilder());
    }

    for (int i : map.keySet()) {
      for (int w = 0; w < array.length; w++) {
        if (i < array[w].length()) {
          map.get(i).append(array[w].charAt(i));
        } else {
          map.get(i).append(" ");
        }
      }
    }

    List<String> list = new ArrayList<>();
    for (int i : map.keySet()) {
      list.add(removeTrailingSpaces(map.get(i).toString()));
    }
    return list;
  }


  //get the longest word so that we can know how many index = string mappings are needed
  private int longestWord(String[] array) {
    int len = 0;
    for (String str : array) {
      if (str.length() > len) {
        len = str.length();
      }
    }
    return len;
  }

  //helper function to remove trailing spaces
  private String removeTrailingSpaces(String param) {
    if (param == null) {
      return null;
    }
    int len = param.length();
    for (; len > 0; len--) {
      if (!Character.isWhitespace(param.charAt(len - 1))) {
        break;
      }
    }
    return param.substring(0, len);
  }
}
