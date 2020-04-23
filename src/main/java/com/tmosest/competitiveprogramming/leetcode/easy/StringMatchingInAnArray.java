package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class StringMatchingInAnArray {

  List<String> stringMatching(String[] words) {
    Set<String> res = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words.length; j++) {
        if (i == j) {
          continue;
        }
        if (words[i].contains(words[j])) {
          res.add(words[j]);
        }
      }
    }

    return new ArrayList<>(res);
  }
}
