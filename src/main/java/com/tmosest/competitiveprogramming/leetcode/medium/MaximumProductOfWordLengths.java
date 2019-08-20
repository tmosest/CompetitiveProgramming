package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;

class MaximumProductOfWordLengths {

  int maxProduct(String[] words) {
    HashMap<String, Integer> map = new HashMap();
    int res = 0;
    for (int i = 0; i < words.length; i++) {
      map.put(words[i], help(words[i]));
      for (int j = 0; j < i; j++) {
        int s1 = map.get(words[i]);
        int s2 = map.get(words[j]);

        if ((s1 & s2) == 0) {
          res = Math.max(res, words[i].length() * words[j].length());
        }
      }
    }
    return res;
  }

  private int help(String word) {
    boolean[] al = new boolean[26];
    for (char c : word.toCharArray()) {
      al[c - 'a'] = true;
    }

    int res = 0;
    for (boolean b : al) {
      if (b) {
        res++;
      }
      res <<= 1;
    }
    return res;
  }
}
