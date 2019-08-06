package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ShoppingOffers {

  int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
    Map<List<Integer>, Integer> map = new HashMap<>();
    return shopping(price, special, needs, map);
  }

  private int shopping(List<Integer> price, List<List<Integer>> special, List<Integer> needs,
      Map<List<Integer>, Integer> map) {
    if (map.containsKey(needs)) {
      return map.get(needs);
    }
    int temp;
    int res = dot(needs, price);
    for (List<Integer> s : special) {
      List<Integer> clone = new ArrayList<>(needs);
      for (temp = 0; temp < needs.size(); temp++) {
        int diff = clone.get(temp) - s.get(temp);
        if (diff < 0) {
          break;
        }
        clone.set(temp, diff);
      }
      if (temp == needs.size()) {
        res = Math.min(res, s.get(temp) + shopping(price, special, clone, map));
      }
    }
    map.put(needs, res);
    return res;
  }

  private int dot(List<Integer> one, List<Integer> two) {
    int sum = 0;
    for (int i = 0; i < one.size(); i++) {
      sum += one.get(i) * two.get(i);
    }
    return sum;
  }
}
