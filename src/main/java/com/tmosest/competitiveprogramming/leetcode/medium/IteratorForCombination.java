package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class IteratorForCombination {

  private int index;
  private List<String> combinations;

  IteratorForCombination(String characters, int combinationLength) {
    index = 0;
    combinations = new ArrayList<>();

    for (int i = 0; i < characters.length(); i++) {
      generate(characters, "", i, combinationLength);
    }
  }

  private void generate(String src, String des, int index, int limit) {

    if (index >= src.length()) {
      return;
    }

    des += src.charAt(index);

    if (des.length() == limit) {
      combinations.add(des);
      return;
    }

    for (int i = index + 1; i < src.length(); i++) {
      generate(src, des, i, limit);
    }
  }

  public String next() {
    return combinations.get(index++);
  }

  boolean hasNext() {
    return index < combinations.size();
  }
}
