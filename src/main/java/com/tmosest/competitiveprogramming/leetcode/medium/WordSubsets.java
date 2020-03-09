package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class WordSubsets {

  List<String> wordSubsets(String[] words, String[] patterns) {
    int[] bmax = count("");
    for (String b : patterns) {
      int[] bcount = count(b);
      for (int i = 0; i < 26; ++i) {
        bmax[i] = Math.max(bmax[i], bcount[i]);
      }
    }

    List<String> ans = new ArrayList<>();
    search:
    for (String a : words) {
      int[] acount = count(a);
      for (int i = 0; i < 26; ++i) {
        if (acount[i] < bmax[i]) {
          continue search;
        }
      }
      ans.add(a);
    }

    return ans;
  }

  private int[] count(String str) {
    int[] ans = new int[26];
    for (char c : str.toCharArray()) {
      ans[c - 'a']++;
    }
    return ans;
  }
}
