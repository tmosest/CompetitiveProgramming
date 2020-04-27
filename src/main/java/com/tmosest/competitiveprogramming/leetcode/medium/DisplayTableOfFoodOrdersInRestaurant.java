package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class DisplayTableOfFoodOrdersInRestaurant {

  List<List<String>> displayTable(List<List<String>> orders) {
    List<List<String>> res = new ArrayList<>();
    Map<String, Map<String, Integer>> map = new HashMap<>();
    Set<String> set = new HashSet<>();
    Map<String, Integer> indexMap = new HashMap<>();
    for (List<String> order : orders) {
      String table = order.get(1);
      String item = order.get(2);
      set.add(item);
      if (!map.containsKey(table)) {
        map.put(table, new HashMap<>());
      }
      Map<String, Integer> itemMap = map.get(table);
      itemMap.put(item, itemMap.getOrDefault(item, 0) + 1);
    }
    List<String> header = new ArrayList<>();
    for (String item : set) {
      indexMap.put(item, header.size());
      header.add(item);
    }
    Collections.sort(header);
    header.add(0, "Table");
    for (String table : map.keySet()) {
      List<String> list = new ArrayList<>();
      list.add(table);
      Map<String, Integer> itemMap = map.get(table);
      for (int i = 1; i < header.size(); i++) {
        String item = header.get(i);
        if (itemMap.containsKey(item)) {
          list.add(String.valueOf(itemMap.get(item)));
        } else {
          list.add("0");
        }
      }
      res.add(list);
    }
    Collections.sort(res,
        (one, two) ->
            (Integer.valueOf(one.get(0)) - Integer.valueOf(two.get(0))));
    res.add(0, header);
    return res;
  }
}
