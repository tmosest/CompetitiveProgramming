package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class PyramidTransitionMatrix {

  boolean pyramidTransition(String bottom, List<String> allowed) {
    if (bottom.length() == 1) {
      return true;
    }

    List<List<String>> candi = new ArrayList<>();
    int len = bottom.length();
    for (int i = 0; i < len - 1; i++) {
      String prev = bottom.substring(i, i + 2);
      List<String> tmp = new ArrayList<>();
      for (String s : allowed) {
        if (s.startsWith(prev)) {
          tmp.add(s.substring(2));
        }
      }
      if (tmp.size() == 0) {
        return false;
      }
      candi.add(tmp);
    }

    List<String> nextList = new ArrayList<>();
    dfs(candi, nextList, "", 0);
    for (String next : nextList) {
      if (pyramidTransition(next, allowed)) {
        return true;
      }
    }
    return false;
  }

  private void dfs(List<List<String>> candi, List<String> nextList, String path, int index) {
    if (index == candi.size()) {
      nextList.add(path);
      return;
    }

    for (String s : candi.get(index)) {
      dfs(candi, nextList, path + s, index + 1);
    }
  }
}
