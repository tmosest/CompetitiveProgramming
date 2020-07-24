package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PeopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherList {

  List<Integer> peopleIndexes(List<List<String>> fc) {
    int len = fc.size();
    boolean[] isSub = new boolean[len];
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        if (!isSub[j] && is(i, j, fc)) {
          isSub[i] = true;
          break;
        }
      }
      if (!isSub[i]) {
        res.add(i);
      }
    }
    return res;
  }

  private boolean is(int one, int two, List<List<String>> fc) {
    if (one == two || fc.get(one).size() > fc.get(two).size()) {
      return false;
    }
    Set<String> st = new HashSet<>();
    st.addAll(fc.get(two));
    for (String s : fc.get(one)) {
      if (!st.contains(s)) {
        return false;
      }
    }
    return true;
  }
}
