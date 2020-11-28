package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

class RearrangeSpacesBetweenWords {

  String reorderSpaces(String text) {
    int spaces = 0;

    List<String> words = new LinkedList<>();

    StringBuilder wd = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) != ' ') {
        wd.append(text.charAt(i));
        if (i == text.length() - 1) {
          words.add(wd.toString());
        }
      } else {
        if (!wd.toString().isEmpty()) {
          words.add(wd.toString());
          wd = new StringBuilder();
        }
        spaces++;
      }
    }

    int wordsCount = words.size();
    int inBetween = 0;
    int rem = spaces;
    if (wordsCount != 1) {
      inBetween = spaces / (wordsCount - 1);
      rem = spaces % (wordsCount - 1);
    }

    StringBuilder res = new StringBuilder();
    for (String s : words) {
      if (!res.toString().isEmpty()) {
        for (int i = 0; i < inBetween; i++) {
          res.append(" ");
        }
      }
      res.append(s);
    }

    for (int i = 0; i < rem; i++) {
      res.append(" ");
    }

    return res.toString();
  }
}
